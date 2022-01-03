package com.example.importerApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity

@Table(name = "BuyingGroups")
public class BuyingGroups {

    @GeneratedValue
    @Id
    private Integer buyingGroupID;
    private String buyingGroupName;
    private Integer lastEditedBy;
    private Date validFrom;
    private Date validTo;

    @Override
    public String toString() {
        return "BuyingGroups{" +
                "buyingGroupID=" + buyingGroupID +
                ", buyingGroupName='" + buyingGroupName + '\'' +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    public Integer getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(Integer lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    public BuyingGroups() {
    }

    public Integer getBuyingGroupID() {
        return buyingGroupID;
    }

    public void setBuyingGroupID(Integer buyingGroupID) {
        this.buyingGroupID = buyingGroupID;
    }

    public String getBuyingGroupName() {
        return buyingGroupName;
    }

    public void setBuyingGroupName(String buyingGroupName) {
        this.buyingGroupName = buyingGroupName;
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
}
