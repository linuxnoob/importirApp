package com.example.importerApp.Entity;

import org.hibernate.type.descriptor.sql.LongVarbinaryTypeDescriptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity

@Table(name = "People")
public class People {

    @GeneratedValue
    @Id
    private Integer personID;
    private String fullName;
    private String preferredName;
    private String searchName;
    private Boolean isPermittedToLogon;
    private String logonName;
    private Boolean isExternalLogonProvider;
    private LongVarbinaryTypeDescriptor hashedPassword;
    private Boolean isSystemUser;
    private Boolean isEmployee;
    private Boolean isSalesperson;
    private String userPreferences;
    private String faxNumber;
    private String emailAddress;
    private LongVarbinaryTypeDescriptor photo;
    private String customFields;
    private String otherLanguages;
    private Integer lastEditedBy;
    private Date validFrom;
    private Date validTo;

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "personID=" + personID +
                ", fullName='" + fullName + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", searchName='" + searchName + '\'' +
                ", isPermittedToLogon=" + isPermittedToLogon +
                ", logonName='" + logonName + '\'' +
                ", isExternalLogonProvider=" + isExternalLogonProvider +
                ", hashedPassword=" + hashedPassword +
                ", isSystemUser=" + isSystemUser +
                ", isEmployee=" + isEmployee +
                ", isSalesperson=" + isSalesperson +
                ", userPreferences='" + userPreferences + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", photo=" + photo +
                ", customFields='" + customFields + '\'' +
                ", otherLanguages='" + otherLanguages + '\'' +
                ", lastEditedBy=" + lastEditedBy +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public Boolean getPermittedToLogon() {
        return isPermittedToLogon;
    }

    public void setPermittedToLogon(Boolean permittedToLogon) {
        isPermittedToLogon = permittedToLogon;
    }

    public String getLogonName() {
        return logonName;
    }

    public void setLogonName(String logonName) {
        this.logonName = logonName;
    }

    public Boolean getExternalLogonProvider() {
        return isExternalLogonProvider;
    }

    public void setExternalLogonProvider(Boolean externalLogonProvider) {
        isExternalLogonProvider = externalLogonProvider;
    }

    public LongVarbinaryTypeDescriptor getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(LongVarbinaryTypeDescriptor hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public Boolean getSystemUser() {
        return isSystemUser;
    }

    public void setSystemUser(Boolean systemUser) {
        isSystemUser = systemUser;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public void setEmployee(Boolean employee) {
        isEmployee = employee;
    }

    public Boolean getSalesperson() {
        return isSalesperson;
    }

    public void setSalesperson(Boolean salesperson) {
        isSalesperson = salesperson;
    }

    public String getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(String userPreferences) {
        this.userPreferences = userPreferences;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LongVarbinaryTypeDescriptor getPhoto() {
        return photo;
    }

    public void setPhoto(LongVarbinaryTypeDescriptor photo) {
        this.photo = photo;
    }

    public String getCustomFields() {
        return customFields;
    }

    public void setCustomFields(String customFields) {
        this.customFields = customFields;
    }

    public String getOtherLanguages() {
        return otherLanguages;
    }

    public void setOtherLanguages(String otherLanguages) {
        this.otherLanguages = otherLanguages;
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
