package com.tc.dlxt.entity;

/**
 * FurnaceInfo 实体类
 * @date 2019-05-13 22:55:23
 * @version 1.0
 */
public class FurnaceInfo implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer furnaceId;
	private String parameterName;
	private String currentValue;
	private String standardValue;
	private String goalValue;
	private String offsetValue;
	private String unit;
	private java.util.Date lastUpdateTime;
	private String parameterStatus;
	private String coalLoss;

	/** setter and getter method */
	public void setFurnaceId(Integer furnaceId){
		this.furnaceId = furnaceId;
	}
	public Integer getFurnaceId(){
		return this.furnaceId;
	}
	public void setParameterName(String parameterName){
		this.parameterName = parameterName;
	}
	public String getParameterName(){
		return this.parameterName;
	}
	public void setCurrentValue(String currentValue){
		this.currentValue = currentValue;
	}
	public String getCurrentValue(){
		return this.currentValue;
	}
	public void setStandardValue(String standardValue){
		this.standardValue = standardValue;
	}
	public String getStandardValue(){
		return this.standardValue;
	}
	public void setGoalValue(String goalValue){
		this.goalValue = goalValue;
	}
	public String getGoalValue(){
		return this.goalValue;
	}
	public void setOffsetValue(String offsetValue){
		this.offsetValue = offsetValue;
	}
	public String getOffsetValue(){
		return this.offsetValue;
	}
	public void setUnit(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}
	public void setLastUpdateTime(java.util.Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	public java.util.Date getLastUpdateTime(){
		return this.lastUpdateTime;
	}
	public void setParameterStatus(String parameterStatus){
		this.parameterStatus = parameterStatus;
	}
	public String getParameterStatus(){
		return this.parameterStatus;
	}
	public void setCoalLoss(String coalLoss){
		this.coalLoss = coalLoss;
	}
	public String getCoalLoss(){
		return this.coalLoss;
	}

}