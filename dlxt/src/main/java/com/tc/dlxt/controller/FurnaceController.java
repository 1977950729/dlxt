package com.tc.dlxt.controller;

import com.alibaba.fastjson.JSON;
import com.tc.dlxt.entity.FurnaceCurrentData;
import com.tc.dlxt.service.service.FurnaceCurrentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("furnace")
public class FurnaceController {

    @Autowired
    private FurnaceCurrentDataService furnaceCurrentDataService;

    @RequestMapping("selectLatest")
    public String selectLatest() {
        FurnaceCurrentData furnaceCurrentData = furnaceCurrentDataService.selectLatest();
        return JSON.toJSONStringWithDateFormat(furnaceCurrentData, "yyyy-MM-dd  HH:mm:ss");
    }

    @RequestMapping("selectFurnaceData")
    public String selectFurnaceData() {
        List<Map<String, Object>> result = furnaceCurrentDataService.selectFurnaceData();
        return JSON.toJSONStringWithDateFormat(result, "yyyy-MM-dd  HH:mm:ss");
    }

    @RequestMapping("selectGasOxygen")
    public String selectGasOxygen() {
        List<Map<String, Object>> result = furnaceCurrentDataService.selectGasOxygen();
        return JSON.toJSONStringWithDateFormat(result, "yyyy-MM-dd  HH:mm:ss");
    }

    @RequestMapping("selectCoal")
    public Map<String, Object> selectCoal() {
        List<Map<String, Object>> list = furnaceCurrentDataService.selectCoal();
        List<Object> dataList = new ArrayList<>();
        List<String> timeLList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object testData = (Object) list.get(i).get("testData");
            String time = (String) list.get(i).get("perspecTime");
            dataList.add(testData);
            timeLList.add(time);
        }
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("dataList",dataList);
        resultMap.put("timeLList",timeLList);
        return resultMap;
    }


}
