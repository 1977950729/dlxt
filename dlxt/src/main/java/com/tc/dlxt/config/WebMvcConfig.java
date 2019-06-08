package com.tc.dlxt.config;

import com.tc.dlxt.Interceptor.CommonInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
@ComponentScan(basePackages = "com.tc")
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public HandlerInterceptorAdapter createTokenSecurityInterceptor() {
        return new CommonInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(createTokenSecurityInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/")
                .excludePathPatterns("/static/**")
                .excludePathPatterns("/Login/login")
                .excludePathPatterns("/Login/nopwLogin")
                .excludePathPatterns("/Login/nopwLogout");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/pages/index/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
