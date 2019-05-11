package com.tc.dlxt.entity;

/**
 * 锅炉信息
 */
public class Furnace {
    private String furnace_id;//炉位
    private String parameter_name;//参数名称
    private String current_value;//实时值
    private String standard_value;//标准值
    private String goal_value;//目标值
    private String offset_value;//偏差值
    private String unit;//单位
    private String last_update_time;//上次更新时间
    private String parameter_status;//参数状态
    private String coal_loss;//煤效损耗

    public Furnace() {
    }

    public Furnace(String furnace_id, String parameter_name, String current_value, String standard_value, String goal_value, String offset_value, String unit, String last_update_time, String parameter_status, String coal_loss) {
        this.furnace_id = furnace_id;
        this.parameter_name = parameter_name;
        this.current_value = current_value;
        this.standard_value = standard_value;
        this.goal_value = goal_value;
        this.offset_value = offset_value;
        this.unit = unit;
        this.last_update_time = last_update_time;
        this.parameter_status = parameter_status;
        this.coal_loss = coal_loss;
    }

    public String getFurnace_id() {
        return furnace_id;
    }

    public void setFurnace_id(String furnace_id) {
        this.furnace_id = furnace_id;
    }

    public String getParameter_name() {
        return parameter_name;
    }

    public void setParameter_name(String parameter_name) {
        this.parameter_name = parameter_name;
    }

    public String getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(String current_value) {
        this.current_value = current_value;
    }

    public String getStandard_value() {
        return standard_value;
    }

    public void setStandard_value(String standard_value) {
        this.standard_value = standard_value;
    }

    public String getGoal_value() {
        return goal_value;
    }

    public void setGoal_value(String goal_value) {
        this.goal_value = goal_value;
    }

    public String getOffset_value() {
        return offset_value;
    }

    public void setOffset_value(String offset_value) {
        this.offset_value = offset_value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(String last_update_time) {
        this.last_update_time = last_update_time;
    }

    public String getParameter_status() {
        return parameter_status;
    }

    public void setParameter_status(String parameter_status) {
        this.parameter_status = parameter_status;
    }

    public String getCoal_loss() {
        return coal_loss;
    }

    public void setCoal_loss(String coal_loss) {
        this.coal_loss = coal_loss;
    }
}
