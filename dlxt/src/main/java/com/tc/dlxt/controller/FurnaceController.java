package com.tc.dlxt.controller;

import com.alibaba.fastjson.JSON;
import com.tc.dlxt.entity.FurnaceCurrentData;
import com.tc.dlxt.service.service.FurnaceCurrentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("furnace")
public class FurnaceController {

    @Autowired
    private FurnaceCurrentDataService furnaceCurrentDataService;

    @RequestMapping("selectLatest")
    public String selectLatest(){
        FurnaceCurrentData furnaceCurrentData = furnaceCurrentDataService.selectLatest();
        return JSON.toJSONStringWithDateFormat(furnaceCurrentData,"yyyy-MM-dd  HH:mm:ss");
    }

    @RequestMapping("selectFurnaceData")
    public String selectFurnaceData(){
        List<Map<String,Object>> result = furnaceCurrentDataService.selectFurnaceData();
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd  HH:mm:ss");
    }

}
