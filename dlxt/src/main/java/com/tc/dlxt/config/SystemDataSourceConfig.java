package com.tc.dlxt.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


@Configuration
@MapperScan(basePackages = {"com.tc.dlxt.service.mapper"}, sqlSessionFactoryRef = "systemSqlSessionFactory")
@EnableCaching
public class SystemDataSourceConfig {

    @Value("${mybatis.systemMapperLocations}")
    private String systemMapperLocations;

    @Value("${mybatis.configLocation}")
    private String configLocation;

    @Value("${system.datasource.url}")
    private String url;

    @Value("${system.datasource.driverClassName}")
    private String driverClass;

    @Value("${system.datasource.username}")
    private String user;

    @Value("${system.datasource.password}")
    private String password;

    public Filter getStatFilter(){
        StatFilter sf = new StatFilter();
        sf.setLogSlowSql(true);
        sf.setSlowSqlMillis(1);
        return sf;
    }
    @Bean(name = "systemDataSource")
    @Primary
    public DataSource systemDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        List<Filter> filterList = new ArrayList<Filter>();
        filterList.add(getStatFilter());
        dataSource.setProxyFilters(filterList);
        return dataSource;
    }

    @Bean(name = "systemTransactionManager")
    @Primary
    public DataSourceTransactionManager systemTransactionManager() {
        return new DataSourceTransactionManager(systemDataSource());
    }

    @Bean(name="systemSqlSessionTemplate",destroyMethod="close")
    @Scope("prototype")
    public SqlSessionTemplate getSystemSqlSessionTemplate()throws Exception {
        SqlSessionTemplate jdbcTemplate = new SqlSessionTemplate(systemSqlSessionFactory(systemDataSource()));
        return jdbcTemplate;
    }

    @Bean(name = "systemSqlSessionFactory")
    @Primary
    public SqlSessionFactory systemSqlSessionFactory(@Qualifier("systemDataSource") DataSource systemDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(systemDataSource);
        //加入扫描Mapper.xml文件
        sessionFactory.setConfigLocation(new DefaultResourceLoader().getResource(configLocation));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(systemMapperLocations));
        return sessionFactory.getObject();
    }
}