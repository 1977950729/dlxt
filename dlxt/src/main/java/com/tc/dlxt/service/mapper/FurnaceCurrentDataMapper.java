package com.tc.dlxt.service.mapper;

import com.tc.dlxt.entity.FurnaceCurrentData;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * FurnaceCurrentDataMapper 数据访问接口
 * @date 2019-05-13 22:55:27
 * @version 1.0
 */
public interface FurnaceCurrentDataMapper extends Mapper<FurnaceCurrentData> {

    FurnaceCurrentData selectLatest();

    List selectFurnaceData();

    List<Map<String, Object>> selectGasOxygen();

    List<Map<String,Object>> selectCoal();
}