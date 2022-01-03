package com.example.importerApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity

@Table(name = "Cities")
public class Cities {

    @Id
    @Column(name = "city_id")
    private Integer cityId;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "state_province_id")
    private Integer stateProvinceId;
    @Column(name = "location")
    private String location;
    @Column(name = "latest_recorded_population")
    private Double latestRecordedPopulation;
    @Column(name = "last_edited_by")
    private Integer lastEditedBy;
    @Column(name = "valid_from")
    private Date validFrom;
    @Column(name = "valid_to")
    private Date validTo;

    public Cities(){

    }
    public Cities(Integer cityId, String cityName, Integer stateProvinceId, String location, Double latestRecordedPopulation, Integer lastEditedBy, Date validFrom, Date validTo) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.stateProvinceId = stateProvinceId;
        this.location = location;
        this.latestRecordedPopulation = latestRecordedPopulation;
        this.lastEditedBy = lastEditedBy;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(Integer stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLatestRecordedPopulation() {
        return latestRecordedPopulation;
    }

    public void setLatestRecordedPopulation(Double latestRecordedPopulation) {
        this.latestRecordedPopulation = latestRecordedPopulation;
    }

    public Integer getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(Integer lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", stateProvinceId=" + stateProvinceId +
                ", location='" + location + '\'' +
                ", latestRecordedPopulation=" + latestRecordedPopulation +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }
}
