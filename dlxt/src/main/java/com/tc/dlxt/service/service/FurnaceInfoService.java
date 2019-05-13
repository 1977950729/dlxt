package com.tc.dlxt.service.service;

import com.tc.dlxt.entity.FurnaceInfo;

import java.io.Serializable;
import java.util.List;
/**
 * FurnaceInfoService 服务接口
 * @date 2019-05-13 22:55:32
 * @version 1.0
 */
public interface FurnaceInfoService {

	/** 添加方法 */
	void save(FurnaceInfo furnaceInfo);

	/** 修改方法 */
	void update(FurnaceInfo furnaceInfo);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	FurnaceInfo findOne(Serializable id);

	/** 查询全部 */
	List<FurnaceInfo> findAll();

}