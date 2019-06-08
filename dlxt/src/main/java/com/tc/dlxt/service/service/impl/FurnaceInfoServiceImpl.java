package com.tc.dlxt.service.service.impl;

import com.tc.dlxt.entity.FurnaceInfo;
import com.tc.dlxt.service.mapper.FurnaceInfoMapper;
import com.tc.dlxt.service.service.FurnaceInfoService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * FurnaceInfoServiceImpl 服务接口实现类
 *
 * @version 1.0
 * @date 2019-05-13 22:55:32
 */
@Service("com.tc.dlxt.service.service.FurnaceInfoService")
public class FurnaceInfoServiceImpl implements FurnaceInfoService {

    @Resource
    private FurnaceInfoMapper furnaceInfoMapper;

    /**
     * 添加方法
     */
    public void save(FurnaceInfo furnaceInfo) {
        try {
            furnaceInfoMapper.insertSelective(furnaceInfo);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 修改方法
     */
    public void update(FurnaceInfo furnaceInfo) {
        try {
            furnaceInfoMapper.updateByPrimaryKeySelective(furnaceInfo);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id删除
     */
    public void delete(Serializable id) {
        try {
            furnaceInfoMapper.deleteByPrimaryKey(id);
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
            Example example = new Example(FurnaceInfo.class);
            // 创建条件对象
            Example.Criteria criteria = example.createCriteria();
            // 创建In条件
            criteria.andIn("id", Arrays.asList(ids));
            // 根据示范对象删除
            furnaceInfoMapper.deleteByExample(example);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id查询
     */
    public FurnaceInfo findOne(Serializable id) {
        try {
            return furnaceInfoMapper.selectByPrimaryKey(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 查询全部
     */
    public List<FurnaceInfo> findAll() {
        try {
            return furnaceInfoMapper.selectAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}