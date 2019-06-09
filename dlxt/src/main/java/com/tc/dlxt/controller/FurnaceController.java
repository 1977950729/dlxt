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
    public String selectCoal() {
        List<Map<String, Object>> list = furnaceCurrentDataService.selectCoal();
        List<Date> times = new ArrayList<>();
        List<Object> data = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object testData = (Object) list.get(i).get("testData");
            data.add(testData);
            if (i % 180 == 0 || i == list.size() - 1) {
                Date time = (Date) list.get(i).get("perspecTime");
                times.add(time);
            }
        }
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("times", times);
        resultMap.put("data", data);
        return JSON.toJSONStringWithDateFormat(resultMap, "HH:mm:ss");
    }


}
