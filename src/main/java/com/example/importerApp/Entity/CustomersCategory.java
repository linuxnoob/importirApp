package com.example.importerApp.Entity;

import javax.persistence.*;
import java.sql.Date;


@Entity

@Table(name = "CustomersCategory")
public class CustomersCategory {

    @GeneratedValue
    @Id
    private Integer customerCategoryID;
    private String customerCategoryName;
    private Integer lastEditedBy;
    private Date validFrom;
    private Date validTo;

    public CustomersCategory() {
    }

    public Integer getCustomerCategoryID() {
        return customerCategoryID;
    }

    public void setCustomerCategoryID(Integer customerCategoryID) {
        this.customerCategoryID = customerCategoryID;
    }

    public String getCustomerCategoryName() {
        return customerCategoryName;
    }

    public void setCustomerCategoryName(String customerCategoryName) {
        this.customerCategoryName = customerCategoryName;
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
        return "CustomersCategory{" +
                "customerCategoryID=" + customerCategoryID +
                ", customerCategoryName='" + customerCategoryName + '\'' +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }
}
