package com.tc.dlxt.service.service.impl;

import com.tc.dlxt.entity.FurnaceCurrentData;
import com.tc.dlxt.service.mapper.FurnaceCurrentDataMapper;
import com.tc.dlxt.service.service.FurnaceCurrentDataService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * FurnaceCurrentDataServiceImpl 服务接口实现类
 *
 * @version 1.0
 * @date 2019-05-13 22:55:32
 */
@Service("com.tc.dlxt.service.service.FurnaceCurrentDataService")
public class FurnaceCurrentDataServiceImpl implements FurnaceCurrentDataService {

    @Resource
    private FurnaceCurrentDataMapper furnaceCurrentDataMapper;

    /**
     * 添加方法
     */
    public void save(FurnaceCurrentData furnaceCurrentData) {
        try {
            furnaceCurrentDataMapper.insertSelective(furnaceCurrentData);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 修改方法
     */
    public void update(FurnaceCurrentData furnaceCurrentData) {
        try {
            furnaceCurrentDataMapper.updateByPrimaryKeySelective(furnaceCurrentData);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id删除
     */
    public void delete(Serializable id) {
        try {
            furnaceCurrentDataMapper.deleteByPrimaryKey(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 批量删除
     */
    public void deleteAll(Serializable[] ids) {
        try {
            // 创建示范对象
            Example example = new Example(FurnaceCurrentData.class);
            // 创建条件对象
            Example.Criteria criteria = example.createCriteria();
            // 创建In条件
            criteria.andIn("id", Arrays.asList(ids));
            // 根据示范对象删除
            furnaceCurrentDataMapper.deleteByExample(example);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id查询
     */
    public FurnaceCurrentData findOne(Serializable id) {
        try {
            return furnaceCurrentDataMapper.selectByPrimaryKey(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 查询全部
     */
    public List<FurnaceCurrentData> findAll() {
        try {
            return furnaceCurrentDataMapper.selectAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public FurnaceCurrentData selectLatest() {
        try {
            return furnaceCurrentDataMapper.selectLatest();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}