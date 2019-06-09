package com.tc.dlxt.service.mapper;

import com.tc.dlxt.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * UserMapper 数据访问接口
 *
 * @version 1.0
 * @date 2019-05-13 22:55:28
 */
public interface UserMapper extends Mapper<User> {


    User login(@Param("username") String username, @Param("password") String password);
}