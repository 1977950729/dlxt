package com.tc.dlxt.service.service.impl;

import com.tc.dlxt.entity.User;
import com.tc.dlxt.service.mapper.UserMapper;
import com.tc.dlxt.service.service.UserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * UserServiceImpl 服务接口实现类
 *
 * @version 1.0
 * @date 2019-05-13 22:55:32
 */
@Service("com.tc.dlxt.service.service.UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 添加方法
     */
    public void save(User user) {
        try {
            userMapper.insertSelective(user);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 修改方法
     */
    public void update(User user) {
        try {
            userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id删除
     */
    public void delete(Serializable id) {
        try {
            userMapper.deleteByPrimaryKey(id);
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
            Example example = new Example(User.class);
            // 创建条件对象
            Example.Criteria criteria = example.createCriteria();
            // 创建In条件
            criteria.andIn("id", Arrays.asList(ids));
            // 根据示范对象删除
            userMapper.deleteByExample(example);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id查询
     */
    public User findOne(Serializable id) {
        try {
            return userMapper.selectByPrimaryKey(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 查询全部
     */
    public List<User> findAll() {
        try {
            return userMapper.selectAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public User login(String username, String password) {
        try {
            return userMapper.login(username, password);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public boolean checkUsername(String username) {
        try {
            return userMapper.checkUsername(username) == null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}