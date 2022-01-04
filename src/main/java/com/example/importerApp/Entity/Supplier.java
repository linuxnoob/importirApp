package com.example.importerApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Suppliers")
public class Supplier {

    @GeneratedValue
    @Id
    private Integer supplierId;
    private String supplierName;
    private Integer cupplierCategoryID;
    private Integer primaryContactPersonID;
    private Integer alternateContactPersonID;
    private Integer deliveryMethodID;
    private Integer deliveryCityID;
    private Integer postalCityID;
    private String supplierReference;
    private String bankAccountName;
    private String bankAccountBranch;
    private String bankAccountCode;
    private String bankAccountNumber;
    private String bankInternationalCode;
    private Integer paymentDays;
    private String internalComments;
    private String phoneNumber;
    private String faxNumber;
    private String websiteURL;
    private String deliveryAddressLine1;
    private String deliveryAddressLine2;
    private String deliveryPostalCode;
    private String postalAddressLine1;
    private String postalAddressLine2;
    private String postalPostalCode;
    private Integer lastEditedBy;
    private Date validFrom;
    private Date validTo;

    public Supplier() {
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", cupplierCategoryID=" + cupplierCategoryID +
                ", primaryContactPersonID=" + primaryContactPersonID +
                ", alternateContactPersonID=" + alternateContactPersonID +
                ", deliveryMethodID=" + deliveryMethodID +
                ", deliveryCityID=" + deliveryCityID +
                ", postalCityID=" + postalCityID +
                ", supplierReference='" + supplierReference + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankAccountBranch='" + bankAccountBranch + '\'' +
                ", bankAccountCode='" + bankAccountCode + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", bankInternationalCode='" + bankInternationalCode + '\'' +
                ", paymentDays=" + paymentDays +
                ", internalComments='" + internalComments + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", websiteURL='" + websiteURL + '\'' +
                ", deliveryAddressLine1='" + deliveryAddressLine1 + '\'' +
                ", deliveryAddressLine2='" + deliveryAddressLine2 + '\'' +
                ", deliveryPostalCode='" + deliveryPostalCode + '\'' +
                ", postalAddressLine1='" + postalAddressLine1 + '\'' +
                ", postalAddressLine2='" + postalAddressLine2 + '\'' +
                ", postalPostalCode='" + postalPostalCode + '\'' +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getCupplierCategoryID() {
        return cupplierCategoryID;
    }

    public void setCupplierCategoryID(Integer cupplierCategoryID) {
        this.cupplierCategoryID = cupplierCategoryID;
    }

    public Integer getPrimaryContactPersonID() {
        return primaryContactPersonID;
    }

    public void setPrimaryContactPersonID(Integer primaryContactPersonID) {
        this.primaryContactPersonID = primaryContactPersonID;
    }

    public Integer getAlternateContactPersonID() {
        return alternateContactPersonID;
    }

    public void setAlternateContactPersonID(Integer alternateContactPersonID) {
        this.alternateContactPersonID = alternateContactPersonID;
    }

    public Integer getDeliveryMethodID() {
        return deliveryMethodID;
    }

    public void setDeliveryMethodID(Integer deliveryMethodID) {
        this.deliveryMethodID = deliveryMethodID;
    }

    public Integer getDeliveryCityID() {
        return deliveryCityID;
    }

    public void setDeliveryCityID(Integer deliveryCityID) {
        this.deliveryCityID = deliveryCityID;
    }

    public Integer getPostalCityID() {
        return postalCityID;
    }

    public void setPostalCityID(Integer postalCityID) {
        this.postalCityID = postalCityID;
    }

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountBranch() {
        return bankAccountBranch;
    }

    public void setBankAccountBranch(String bankAccountBranch) {
        this.bankAccountBranch = bankAccountBranch;
    }

    public String getBankAccountCode() {
        return bankAccountCode;
    }

    public void setBankAccountCode(String bankAccountCode) {
        this.bankAccountCode = bankAccountCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankInternationalCode() {
        return bankInternationalCode;
    }

    public void setBankInternationalCode(String bankInternationalCode) {
        this.bankInternationalCode = bankInternationalCode;
    }

    public Integer getPaymentDays() {
        return paymentDays;
    }

    public void setPaymentDays(Integer paymentDays) {
        this.paymentDays = paymentDays;
    }

    public String getInternalComments() {
        return internalComments;
    }

    public void setInternalComments(String internalComments) {
        this.internalComments = internalComments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getDeliveryAddressLine1() {
        return deliveryAddressLine1;
    }

    public void setDeliveryAddressLine1(String deliveryAddressLine1) {
        this.deliveryAddressLine1 = deliveryAddressLine1;
    }

    public String getDeliveryAddressLine2() {
        return deliveryAddressLine2;
    }

    public void setDeliveryAddressLine2(String deliveryAddressLine2) {
        this.deliveryAddressLine2 = deliveryAddressLine2;
    }

    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public String getPostalAddressLine1() {
        return postalAddressLine1;
    }

    public void setPostalAddressLine1(String postalAddressLine1) {
        this.postalAddressLine1 = postalAddressLine1;
    }

    public String getPostalAddressLine2() {
        return postalAddressLine2;
    }

    public void setPostalAddressLine2(String postalAddressLine2) {
        this.postalAddressLine2 = postalAddressLine2;
    }

    public String getPostalPostalCode() {
        return postalPostalCode;
    }

    public void setPostalPostalCode(String postalPostalCode) {
        this.postalPostalCode = postalPostalCode;
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
