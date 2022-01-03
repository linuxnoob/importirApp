package com.example.importerApp.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "Customers")
public class Customers {

    @GeneratedValue
    @Id
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "bill_to_customer")
    private Integer billToCustomer;
    @Column(name = "customer_categoryid")
    private Integer customerCategoryID;
    @Column(name = "buying_groupid")
    private Integer buyingGroupID;
    @Column(name = "primary_contact_personid")
    private Integer primaryContactPersonID;
    @Column(name = "alternate_contact_personid")
    private Integer alternateContactPersonID;
    @Column(name = "delivery_methodid")
    private Integer deliveryMethodID;
    @Column(name = "delivery_cityid")
    private Integer deliveryCityID;
    @Column(name = "postal_cityid")
    private Integer postalCityID;
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;
    @Column(name = "account_opened_date")
    private Date accountOpenedDate;
    @Column(name = "standard_discount_percentage")
    private BigDecimal standardDiscountPercentage;
    @Column(name = "is_statement_sent")
    private boolean isStatementSent;
    @Column(name = "is_on_credit_hold")
    private boolean isOnCreditHold;
    @Column(name = "payment_days")
    private Integer paymentDays;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "fax_number")
    private String faxNumber;
    @Column(name = "delivery_run")
    private String deliveryRun;
    @Column(name = "run_position")
    private String runPosition;
    @Column(name = "websiteurl")
    private String websiteURL;
    @Column(name = "delivery_address_line1")
    private String deliveryAddressLine1;
    @Column(name = "delivery_address_line2")
    private String deliveryAddressLine2;
    @Column(name = "delivery_postal_code")
    private String deliveryPostalCode;
    @Column(name = "delivery_location")
    private String deliveryLocation;
    @Column(name = "postal_address_line1")
    private String postalAddressLine1;
    @Column(name = "postal_address_line2")
    private String postalAddressLine2;
    @Column(name = "postal_postal_code")
    private String postalPostalCode;
    @Column(name = "last_edited_by")
    private Integer lastEditedBy;
    @Column(name = "valid_from")
    private Date validFrom;
    @Column(name = "valid_to")
    private Date validTo;

    public Customers(){

    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getBillToCustomer() {
        return billToCustomer;
    }

    public void setBillToCustomer(Integer billToCustomer) {
        this.billToCustomer = billToCustomer;
    }

    public Integer getCustomerCategoryID() {
        return customerCategoryID;
    }

    public void setCustomerCategoryID(Integer customerCategoryID) {
        this.customerCategoryID = customerCategoryID;
    }

    public Integer getBuyingGroupID() {
        return buyingGroupID;
    }

    public void setBuyingGroupID(Integer buyingGroupID) {
        this.buyingGroupID = buyingGroupID;
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



    public Date getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(Date accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }

    public BigDecimal getStandardDiscountPercentage() {
        return standardDiscountPercentage;
    }

    public void setStandardDiscountPercentage(BigDecimal standardDiscountPercentage) {
        this.standardDiscountPercentage = standardDiscountPercentage;
    }

    public boolean isStatementSent() {
        return isStatementSent;
    }

    public void setStatementSent(boolean statementSent) {
        isStatementSent = statementSent;
    }

    public boolean isOnCreditHold() {
        return isOnCreditHold;
    }

    public void setOnCreditHold(boolean onCreditHold) {
        isOnCreditHold = onCreditHold;
    }

    public Integer getPaymentDays() {
        return paymentDays;
    }

    public void setPaymentDays(Integer paymentDays) {
        this.paymentDays = paymentDays;
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

    public String getDeliveryRun() {
        return deliveryRun;
    }

    public void setDeliveryRun(String deliveryRun) {
        this.deliveryRun = deliveryRun;
    }

    public String getRunPosition() {
        return runPosition;
    }

    public void setRunPosition(String runPosition) {
        this.runPosition = runPosition;
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

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
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

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Customers(Integer customerId, String customerName, Integer billToCustomer, Integer customerCategoryID, Integer buyingGroupID, Integer primaryContactPersonID, Integer alternateContactPersonID, Integer deliveryMethodID, Integer deliveryCityID, Integer postalCityID, BigDecimal creditLimit, Date accountOpenedDate, BigDecimal standardDiscountPercentage, boolean isStatementSent, boolean isOnCreditHold, Integer paymentDays, String phoneNumber, String faxNumber, String deliveryRun, String runPosition, String websiteURL, String deliveryAddressLine1, String deliveryAddressLine2, String deliveryPostalCode, String deliveryLocation, String postalAddressLine1, String postalAddressLine2, String postalPostalCode, Integer lastEditedBy, Date validFrom, Date validTo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.billToCustomer = billToCustomer;
        this.customerCategoryID = customerCategoryID;
        this.buyingGroupID = buyingGroupID;
        this.primaryContactPersonID = primaryContactPersonID;
        this.alternateContactPersonID = alternateContactPersonID;
        this.deliveryMethodID = deliveryMethodID;
        this.deliveryCityID = deliveryCityID;
        this.postalCityID = postalCityID;
        this.creditLimit = creditLimit;
        this.accountOpenedDate = accountOpenedDate;
        this.standardDiscountPercentage = standardDiscountPercentage;
        this.isStatementSent = isStatementSent;
        this.isOnCreditHold = isOnCreditHold;
        this.paymentDays = paymentDays;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.deliveryRun = deliveryRun;
        this.runPosition = runPosition;
        this.websiteURL = websiteURL;
        this.deliveryAddressLine1 = deliveryAddressLine1;
        this.deliveryAddressLine2 = deliveryAddressLine2;
        this.deliveryPostalCode = deliveryPostalCode;
        this.deliveryLocation = deliveryLocation;
        this.postalAddressLine1 = postalAddressLine1;
        this.postalAddressLine2 = postalAddressLine2;
        this.postalPostalCode = postalPostalCode;
        this.lastEditedBy = lastEditedBy;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", billToCustomer=" + billToCustomer +
                ", customerCategoryID=" + customerCategoryID +
                ", buyingGroupID=" + buyingGroupID +
                ", primaryContactPersonID=" + primaryContactPersonID +
                ", alternateContactPersonID=" + alternateContactPersonID +
                ", deliveryMethodID=" + deliveryMethodID +
                ", deliveryCityID=" + deliveryCityID +
                ", postalCityID=" + postalCityID +
                ", creditLimit=" + creditLimit +
                ", accountOpenedDate=" + accountOpenedDate +
                ", standardDiscountPercentage=" + standardDiscountPercentage +
                ", isStatementSent=" + isStatementSent +
                ", isOnCreditHold=" + isOnCreditHold +
                ", paymentDays=" + paymentDays +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", deliveryRun='" + deliveryRun + '\'' +
                ", runPosition='" + runPosition + '\'' +
                ", websiteURL='" + websiteURL + '\'' +
                ", deliveryAddressLine1='" + deliveryAddressLine1 + '\'' +
                ", deliveryAddressLine2='" + deliveryAddressLine2 + '\'' +
                ", deliveryPostalCode='" + deliveryPostalCode + '\'' +
                ", deliveryLocation='" + deliveryLocation + '\'' +
                ", postalAddressLine1='" + postalAddressLine1 + '\'' +
                ", postalAddressLine2='" + postalAddressLine2 + '\'' +
                ", postalPostalCode='" + postalPostalCode + '\'' +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }
}
