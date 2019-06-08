package com.tc.dlxt.service.service;

import com.tc.dlxt.entity.User;

import java.io.Serializable;
import java.util.List;
/**
 * UserService 服务接口
 * @date 2019-05-13 22:55:32
 * @version 1.0
 */
public interface UserService {

	/** 添加方法 */
	void save(User user);

	/** 修改方法 */
	void update(User user);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	User findOne(Serializable id);

	/** 查询全部 */
	List<User> findAll();


}