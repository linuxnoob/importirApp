package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Customers;
import com.example.importerApp.Service.CustomersService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomersController {

    @Autowired
    CustomersService customersService;

    @GetMapping("/customers/getByName/{name}")
    public List<Customers> findCustByName(@PathVariable String name){
        System.out.println("name = " +name);
        return customersService.findCustomerByName(name);
    }

    @GetMapping("/customers/getAll")
    public List<Customers> findAllCustomers(){
        return this.customersService.findAllCust();
    }

    @GetMapping("/customers/getAll/{custId}")
    public List<Customers> findCustById(Integer custId){
        return this.customersService.findCustById(custId);
    }
}
