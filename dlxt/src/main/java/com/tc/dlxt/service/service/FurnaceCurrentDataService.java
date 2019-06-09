package com.tc.dlxt.service.service;

import com.tc.dlxt.entity.FurnaceCurrentData;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * FurnaceCurrentDataService 服务接口
 * @date 2019-05-13 22:55:32
 * @version 1.0
 */
public interface FurnaceCurrentDataService {

	/** 添加方法 */
	void save(FurnaceCurrentData furnaceCurrentData);

	/** 修改方法 */
	void update(FurnaceCurrentData furnaceCurrentData);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	FurnaceCurrentData findOne(Serializable id);

	/** 查询全部 */
	List<FurnaceCurrentData> findAll();

	/** 查询最新一条 */
	FurnaceCurrentData selectLatest();

	/** 查询锅炉参数信息*/
	List selectFurnaceData();

	/** 查询烟气含氧量*/
    List<Map<String, Object>> selectGasOxygen();

    List<Map<String,Object>> selectCoal();
}