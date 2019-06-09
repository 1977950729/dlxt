package com.tc.dlxt.service.service.impl;

import com.tc.dlxt.entity.FurnaceCurrentData;
import com.tc.dlxt.service.mapper.FurnaceCurrentDataMapper;
import com.tc.dlxt.service.service.FurnaceCurrentDataService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;

/**
 * FurnaceCurrentDataServiceImpl 服务接口实现类
 *
 * @version 1.0
 * @date 2019-05-13 22:55:32
 */
@Service("com.tc.dlxt.service.service.FurnaceCurrentDataService")
public class FurnaceCurrentDataServiceImpl implements FurnaceCurrentDataService {

    @Resource
    private FurnaceCurrentDataMapper furnaceCurrentDataMapper;

    /**
     * 添加方法
     */
    public void save(FurnaceCurrentData furnaceCurrentData) {
        try {
            furnaceCurrentDataMapper.insertSelective(furnaceCurrentData);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 修改方法
     */
    public void update(FurnaceCurrentData furnaceCurrentData) {
        try {
            furnaceCurrentDataMapper.updateByPrimaryKeySelective(furnaceCurrentData);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id删除
     */
    public void delete(Serializable id) {
        try {
            furnaceCurrentDataMapper.deleteByPrimaryKey(id);
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
            Example example = new Example(FurnaceCurrentData.class);
            // 创建条件对象
            Example.Criteria criteria = example.createCriteria();
            // 创建In条件
            criteria.andIn("id", Arrays.asList(ids));
            // 根据示范对象删除
            furnaceCurrentDataMapper.deleteByExample(example);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 根据主键id查询
     */
    public FurnaceCurrentData findOne(Serializable id) {
        try {
            return furnaceCurrentDataMapper.selectByPrimaryKey(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 查询全部
     */
    public List<FurnaceCurrentData> findAll() {
        try {
            return furnaceCurrentDataMapper.selectAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public FurnaceCurrentData selectLatest() {
        try {
            return furnaceCurrentDataMapper.selectLatest();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List selectFurnaceData() {
        try {
            List<Map<String,Object>> list = furnaceCurrentDataMapper.selectFurnaceData();
            double hta=0;
            Object htaTime=null;
            double htb=0;

            double hpa=0;
            Object hpaTime=null;
            double hpb=0;

            double fwa=0;
            Object fwaTime=null;
            double fwb=0;

            for(Map<String,Object> map1:list){
                if (map1.get("dateNum").toString().equals("10001")){
                    hta=Double.parseDouble(map1.get("testData").toString());
                    htaTime=map1.get("perspecTime");
                }
                if (map1.get("dateNum").toString().equals("10002")){
                    htb=Double.parseDouble(map1.get("testData").toString());
                }
                if (map1.get("dateNum").toString().equals("10005")){
                    hpa=Double.parseDouble(map1.get("testData").toString());
                    hpaTime=map1.get("perspecTime");
                }
                if (map1.get("dateNum").toString().equals("10006")){
                    hpb=Double.parseDouble(map1.get("testData").toString());
                }
                if (map1.get("dateNum").toString().equals("10007")){
                    fwa=Double.parseDouble(map1.get("testData").toString());
                    fwaTime=map1.get("perspecTime");
                }
                if (map1.get("dateNum").toString().equals("10008")){
                    fwb=Double.parseDouble(map1.get("testData").toString());
                }

            }
            Iterator<Map<String, Object>> iterator = list.iterator();
            // 删除无用元素
            while (iterator.hasNext()){
                String dateNum=iterator.next().get("dateNum").toString();
                if (dateNum.equals("10001")||dateNum.equals("10002")
                        ||dateNum.equals("10005")||dateNum.equals("10006")
                        ||dateNum.equals("10007")||dateNum.equals("10008")
                ){
                    iterator.remove();
                }
            }

            for(Map map:list){
                if (map.get("dateNum").toString().equals("37")){
                    map.put("perspecTime",htaTime);
                    map.put("testData",(hta+htb)/2);

                }else if(map.get("dateNum").toString().equals("52")){
                    map.put("perspecTime",fwaTime);
                    map.put("testData",(fwa+fwb)/2);
                }else if(map.get("dateNum").toString().equals("53")){

                    map.put("perspecTime",hpaTime);
                    map.put("testData",(hpa+hpb)/2);
                }

            }

            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 查询烟气含氧量
     */
    @Override
    public Map<String, Object> selectGasOxygen() {
        Map<String, Object> map=new HashMap<String, Object>();
        try {
            List<Map<String, Object>> list = furnaceCurrentDataMapper.selectGasOxygen();
            List<Object> listTime=new ArrayList<>();
            List<Object> listData=new ArrayList<>();
            for(Map tempmap:list){
                listTime.add(tempmap.get("perspecTime"));
                listData.add(tempmap.get("testData"));
            }
            map.put("listTime",listTime);
            map.put("listData",listData);
            return map;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    @Override
    public List<Map<String,Object>> selectCoal(){
        try {
            return furnaceCurrentDataMapper.selectCoal();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Map<String,Object> selectElectricCoalLoss() {
        Map<String,Object> result =new HashMap<>();
        try {
            List<Map<String,Object>> list = furnaceCurrentDataMapper.selectElectricCoalLoss();
            result.put("table",list);
            List<Object> dataName=new ArrayList<>();
            List<Object> dataValue=new ArrayList<>();
            for(Map map:list){
                dataName.add(map.get("dateName"));
                dataValue.add(map.get("coalloss"));
            }
            result.put("dataName",dataName);
            result.put("dataValue",dataValue);
            return result;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Map<String, Object> selectElectricCoalLossCircle() {
        Map<String,Object> result =new HashMap<>();
        try {
            List<Map<String,Object>> list1 = furnaceCurrentDataMapper.selectElectricCoalLoss();
            List<Map<String,Object>> list2 = furnaceCurrentDataMapper.selectElectricCoalLossCircle();
            result.put("table",list1);
            result.put("circle",list2);
            List<Object> dataName=new ArrayList<>();
            List<Object> dataValue=new ArrayList<>();
            for(Map map:list2){
                dataName.add(map.get("name"));
                dataValue.add(map.get("value"));
            }
            result.put("dataName",dataName);
            result.put("dataValue",dataValue);
            return result;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}