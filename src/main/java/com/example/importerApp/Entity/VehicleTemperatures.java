package com.example.importerApp.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity


@Table(name ="Vehicle")
public class VehicleTemperatures {

    @GeneratedValue
    @Id
    @Column(name="VehicleTemperatureID")
    private Integer vehicleTemperatureID;
    @Column(name = "VehicleRegistration")
    private String vehicleRegistration;
    @Column(name = "ChillerSensorNumber")
    private Integer chillerSensorNumber;
    @Column(name = "RecordedWhen")
    private Timestamp recordedWhen;
    @Column(name = "Temperature")
    private Double temperature;
    @Column(name = "FullSensorData")
    private String fullSensorData;
    @Column(name = "IsCompressed")
    private boolean isCompressed;
    @Column(name = "CompressedSensorData")
    private String compressedSensorData;


    public VehicleTemperatures(Integer vehicleTemperatureID, String vehicleRegistration, Integer chillerSensorNumber, Timestamp recordedWhen, Double temperature, String fullSensorData, boolean isCompressed, String compressedSensorData) {
        this.vehicleTemperatureID = vehicleTemperatureID;
        this.vehicleRegistration = vehicleRegistration;
        this.chillerSensorNumber = chillerSensorNumber;
        this.recordedWhen = recordedWhen;
        this.temperature = temperature;
        this.fullSensorData = fullSensorData;
        this.isCompressed = isCompressed;
        this.compressedSensorData = compressedSensorData;
    }

    public Integer getVehicleTemperatureID() {
        return vehicleTemperatureID;
    }

    public void setVehicleTemperatureID(Integer vehicleTemperatureID) {
        this.vehicleTemperatureID = vehicleTemperatureID;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public Integer getChillerSensorNumber() {
        return chillerSensorNumber;
    }

    public void setChillerSensorNumber(Integer chillerSensorNumber) {
        this.chillerSensorNumber = chillerSensorNumber;
    }

    public Timestamp getRecordedWhen() {
        return recordedWhen;
    }

    public void setRecordedWhen(Timestamp recordedWhen) {
        this.recordedWhen = recordedWhen;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getFullSensorData() {
        return fullSensorData;
    }

    public void setFullSensorData(String fullSensorData) {
        this.fullSensorData = fullSensorData;
    }

    public boolean isCompressed() {
        return isCompressed;
    }

    public void setCompressed(boolean compressed) {
        isCompressed = compressed;
    }

    public String getCompressedSensorData() {
        return compressedSensorData;
    }

    public void setCompressedSensorData(String compressedSensorData) {
        this.compressedSensorData = compressedSensorData;
    }


}
