package com.example.importerApp.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity

@Table(name = "DeliveryMethods")
public class DeliveryMethods {

    @GeneratedValue
    @Id
    private Integer deliveryMethodID;
    private String deliveryMethodName;
    private Integer lastEditedBy;
    private Date validFrom;
    private Date validTo;

    public DeliveryMethods() {
    }

    @Override
    public String toString() {
        return "DeliveryMethods{" +
                "deliveryMethodID=" + deliveryMethodID +
                ", deliveryMethodName='" + deliveryMethodName + '\'' +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    public Integer getDeliveryMethodID() {
        return deliveryMethodID;
    }

    public void setDeliveryMethodID(Integer deliveryMethodID) {
        this.deliveryMethodID = deliveryMethodID;
    }

    public String getDeliveryMethodName() {
        return deliveryMethodName;
    }

    public void setDeliveryMethodName(String deliveryMethodName) {
        this.deliveryMethodName = deliveryMethodName;
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
}
