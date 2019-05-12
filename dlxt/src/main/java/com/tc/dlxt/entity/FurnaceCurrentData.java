package com.tc.dlxt.entity;

import java.util.Date;

public class FurnaceCurrentData {
    private int id;
    private int furnace_id;
    private double master_gas_temperature;
    private double master_gas_stress;
    private double cold_hot_temperature;
    private double cold_hot_stress_a;
    private double cold_hot_stress_b;
    private double hot_hot_temperature_a;
    private double hot_hot_temperature_b;
    private double hot_hot_stress;
    private double furnace_water_temperature;
    private double furnace_water_stress;
    private double master_gas_flow;
    private double furnace_water_flow;
    private double smog_out_temperature;
    private double smog_oxygen;
    private double first_hot_flow;
    private double second_hot_flow;
    private double hot_hot_flow;
    private double flue_flow;
    private Date last_update_time;
    private String parameter_status;
    private double coal_loss;

    public FurnaceCurrentData() {
    }

    public FurnaceCurrentData(int id, int furnace_id, double master_gas_temperature, double master_gas_stress, double cold_hot_temperature, double cold_hot_stress_a, double cold_hot_stress_b, double hot_hot_temperature_a, double hot_hot_temperature_b, double hot_hot_stress, double furnace_water_temperature, double furnace_water_stress, double master_gas_flow, double furnace_water_flow, double smog_out_temperature, double smog_oxygen, double first_hot_flow, double second_hot_flow, double hot_hot_flow, double flue_flow, Date last_update_time, String parameter_status, double coal_loss) {
        this.id = id;
        this.furnace_id = furnace_id;
        this.master_gas_temperature = master_gas_temperature;
        this.master_gas_stress = master_gas_stress;
        this.cold_hot_temperature = cold_hot_temperature;
        this.cold_hot_stress_a = cold_hot_stress_a;
        this.cold_hot_stress_b = cold_hot_stress_b;
        this.hot_hot_temperature_a = hot_hot_temperature_a;
        this.hot_hot_temperature_b = hot_hot_temperature_b;
        this.hot_hot_stress = hot_hot_stress;
        this.furnace_water_temperature = furnace_water_temperature;
        this.furnace_water_stress = furnace_water_stress;
        this.master_gas_flow = master_gas_flow;
        this.furnace_water_flow = furnace_water_flow;
        this.smog_out_temperature = smog_out_temperature;
        this.smog_oxygen = smog_oxygen;
        this.first_hot_flow = first_hot_flow;
        this.second_hot_flow = second_hot_flow;
        this.hot_hot_flow = hot_hot_flow;
        this.flue_flow = flue_flow;
        this.last_update_time = last_update_time;
        this.parameter_status = parameter_status;
        this.coal_loss = coal_loss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFurnace_id() {
        return furnace_id;
    }

    public void setFurnace_id(int furnace_id) {
        this.furnace_id = furnace_id;
    }

    public double getMaster_gas_temperature() {
        return master_gas_temperature;
    }

    public void setMaster_gas_temperature(double master_gas_temperature) {
        this.master_gas_temperature = master_gas_temperature;
    }

    public double getMaster_gas_stress() {
        return master_gas_stress;
    }

    public void setMaster_gas_stress(double master_gas_stress) {
        this.master_gas_stress = master_gas_stress;
    }

    public double getCold_hot_temperature() {
        return cold_hot_temperature;
    }

    public void setCold_hot_temperature(double cold_hot_temperature) {
        this.cold_hot_temperature = cold_hot_temperature;
    }

    public double getCold_hot_stress_a() {
        return cold_hot_stress_a;
    }

    public void setCold_hot_stress_a(double cold_hot_stress_a) {
        this.cold_hot_stress_a = cold_hot_stress_a;
    }

    public double getCold_hot_stress_b() {
        return cold_hot_stress_b;
    }

    public void setCold_hot_stress_b(double cold_hot_stress_b) {
        this.cold_hot_stress_b = cold_hot_stress_b;
    }

    public double getHot_hot_temperature_a() {
        return hot_hot_temperature_a;
    }

    public void setHot_hot_temperature_a(double hot_hot_temperature_a) {
        this.hot_hot_temperature_a = hot_hot_temperature_a;
    }

    public double getHot_hot_temperature_b() {
        return hot_hot_temperature_b;
    }

    public void setHot_hot_temperature_b(double hot_hot_temperature_b) {
        this.hot_hot_temperature_b = hot_hot_temperature_b;
    }

    public double getHot_hot_stress() {
        return hot_hot_stress;
    }

    public void setHot_hot_stress(double hot_hot_stress) {
        this.hot_hot_stress = hot_hot_stress;
    }

    public double getFurnace_water_temperature() {
        return furnace_water_temperature;
    }

    public void setFurnace_water_temperature(double furnace_water_temperature) {
        this.furnace_water_temperature = furnace_water_temperature;
    }

    public double getFurnace_water_stress() {
        return furnace_water_stress;
    }

    public void setFurnace_water_stress(double furnace_water_stress) {
        this.furnace_water_stress = furnace_water_stress;
    }

    public double getMaster_gas_flow() {
        return master_gas_flow;
    }

    public void setMaster_gas_flow(double master_gas_flow) {
        this.master_gas_flow = master_gas_flow;
    }

    public double getFurnace_water_flow() {
        return furnace_water_flow;
    }

    public void setFurnace_water_flow(double furnace_water_flow) {
        this.furnace_water_flow = furnace_water_flow;
    }

    public double getSmog_out_temperature() {
        return smog_out_temperature;
    }

    public void setSmog_out_temperature(double smog_out_temperature) {
        this.smog_out_temperature = smog_out_temperature;
    }

    public double getSmog_oxygen() {
        return smog_oxygen;
    }

    public void setSmog_oxygen(double smog_oxygen) {
        this.smog_oxygen = smog_oxygen;
    }

    public double getFirst_hot_flow() {
        return first_hot_flow;
    }

    public void setFirst_hot_flow(double first_hot_flow) {
        this.first_hot_flow = first_hot_flow;
    }

    public double getSecond_hot_flow() {
        return second_hot_flow;
    }

    public void setSecond_hot_flow(double second_hot_flow) {
        this.second_hot_flow = second_hot_flow;
    }

    public double getHot_hot_flow() {
        return hot_hot_flow;
    }

    public void setHot_hot_flow(double hot_hot_flow) {
        this.hot_hot_flow = hot_hot_flow;
    }

    public double getFlue_flow() {
        return flue_flow;
    }

    public void setFlue_flow(double flue_flow) {
        this.flue_flow = flue_flow;
    }

    public Date getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(Date last_update_time) {
        this.last_update_time = last_update_time;
    }

    public String getParameter_status() {
        return parameter_status;
    }

    public void setParameter_status(String parameter_status) {
        this.parameter_status = parameter_status;
    }

    public double getCoal_loss() {
        return coal_loss;
    }

    public void setCoal_loss(double coal_loss) {
        this.coal_loss = coal_loss;
    }
}
