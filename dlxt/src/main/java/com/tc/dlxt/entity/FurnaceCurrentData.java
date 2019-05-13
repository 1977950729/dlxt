package com.tc.dlxt.entity;

/**
 * FurnaceCurrentData 实体类
 * @date 2019-05-13 22:55:23
 * @version 1.0
 */

public class FurnaceCurrentData implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer furnaceId;
	private String masterGasTemperature;
	private String masterGasStress;
	private String coldHotTemperature;
	private String coldHotStressA;
	private String coldHotStressB;
	private String hotHotTemperatureA;
	private String hotHotTemperatureB;
	private String hotHotStress;
	private String furnaceWaterTemperature;
	private String furnaceWaterStress;
	private String masterGasFlow;
	private String furnaceWaterFlow;
	private String smogOutTemperature;
	private String smogOxygen;
	private String firstHotFlow;
	private String secondHotFlow;
	private String hotHotFlow;
	private String flueFlow;
	private java.util.Date lastUpdateTime;
	private String parameterStatus;
	private String coalLoss;

	/** setter and getter method */
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setFurnaceId(Integer furnaceId){
		this.furnaceId = furnaceId;
	}
	public Integer getFurnaceId(){
		return this.furnaceId;
	}
	public void setMasterGasTemperature(String masterGasTemperature){
		this.masterGasTemperature = masterGasTemperature;
	}
	public String getMasterGasTemperature(){
		return this.masterGasTemperature;
	}
	public void setMasterGasStress(String masterGasStress){
		this.masterGasStress = masterGasStress;
	}
	public String getMasterGasStress(){
		return this.masterGasStress;
	}
	public void setColdHotTemperature(String coldHotTemperature){
		this.coldHotTemperature = coldHotTemperature;
	}
	public String getColdHotTemperature(){
		return this.coldHotTemperature;
	}
	public void setColdHotStressA(String coldHotStressA){
		this.coldHotStressA = coldHotStressA;
	}
	public String getColdHotStressA(){
		return this.coldHotStressA;
	}
	public void setColdHotStressB(String coldHotStressB){
		this.coldHotStressB = coldHotStressB;
	}
	public String getColdHotStressB(){
		return this.coldHotStressB;
	}
	public void setHotHotTemperatureA(String hotHotTemperatureA){
		this.hotHotTemperatureA = hotHotTemperatureA;
	}
	public String getHotHotTemperatureA(){
		return this.hotHotTemperatureA;
	}
	public void setHotHotTemperatureB(String hotHotTemperatureB){
		this.hotHotTemperatureB = hotHotTemperatureB;
	}
	public String getHotHotTemperatureB(){
		return this.hotHotTemperatureB;
	}
	public void setHotHotStress(String hotHotStress){
		this.hotHotStress = hotHotStress;
	}
	public String getHotHotStress(){
		return this.hotHotStress;
	}
	public void setFurnaceWaterTemperature(String furnaceWaterTemperature){
		this.furnaceWaterTemperature = furnaceWaterTemperature;
	}
	public String getFurnaceWaterTemperature(){
		return this.furnaceWaterTemperature;
	}
	public void setFurnaceWaterStress(String furnaceWaterStress){
		this.furnaceWaterStress = furnaceWaterStress;
	}
	public String getFurnaceWaterStress(){
		return this.furnaceWaterStress;
	}
	public void setMasterGasFlow(String masterGasFlow){
		this.masterGasFlow = masterGasFlow;
	}
	public String getMasterGasFlow(){
		return this.masterGasFlow;
	}
	public void setFurnaceWaterFlow(String furnaceWaterFlow){
		this.furnaceWaterFlow = furnaceWaterFlow;
	}
	public String getFurnaceWaterFlow(){
		return this.furnaceWaterFlow;
	}
	public void setSmogOutTemperature(String smogOutTemperature){
		this.smogOutTemperature = smogOutTemperature;
	}
	public String getSmogOutTemperature(){
		return this.smogOutTemperature;
	}
	public void setSmogOxygen(String smogOxygen){
		this.smogOxygen = smogOxygen;
	}
	public String getSmogOxygen(){
		return this.smogOxygen;
	}
	public void setFirstHotFlow(String firstHotFlow){
		this.firstHotFlow = firstHotFlow;
	}
	public String getFirstHotFlow(){
		return this.firstHotFlow;
	}
	public void setSecondHotFlow(String secondHotFlow){
		this.secondHotFlow = secondHotFlow;
	}
	public String getSecondHotFlow(){
		return this.secondHotFlow;
	}
	public void setHotHotFlow(String hotHotFlow){
		this.hotHotFlow = hotHotFlow;
	}
	public String getHotHotFlow(){
		return this.hotHotFlow;
	}
	public void setFlueFlow(String flueFlow){
		this.flueFlow = flueFlow;
	}
	public String getFlueFlow(){
		return this.flueFlow;
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