package com.example.importerApp.EntityView;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@DynamicUpdate
public class CustomerView {

    @Id
    private Integer customer_id;
    private String customer_name;
    private String customer_category_name;
    private String primaryContact;
    private String alternateContact;
    private String phone_number;
    private String fax_number;
    private String buying_group_name;
    private String websiteURL;
    private String deliveryMethod;
    private String city_name;
    private String delivery_location;
    private String delivery_run;
    private String run_position;

    public CustomerView() {
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_category_name() {
        return customer_category_name;
    }

    public void setCustomer_category_name(String customer_category_name) {
        this.customer_category_name = customer_category_name;
    }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getAlternateContact() {
        return alternateContact;
    }

    public void setAlternateContact(String alternateContact) {
        this.alternateContact = alternateContact;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFax_number() {
        return fax_number;
    }

    public void setFax_number(String fax_number) {
        this.fax_number = fax_number;
    }

    public String getBuying_group_name() {
        return buying_group_name;
    }

    public void setBuying_group_name(String buying_group_name) {
        this.buying_group_name = buying_group_name;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDelivery_location() {
        return delivery_location;
    }

    public void setDelivery_location(String delivery_location) {
        this.delivery_location = delivery_location;
    }

    public String getDelivery_run() {
        return delivery_run;
    }

    public void setDelivery_run(String delivery_run) {
        this.delivery_run = delivery_run;
    }

    public String getRun_position() {
        return run_position;
    }

    public void setRun_position(String run_position) {
        this.run_position = run_position;
    }
}
