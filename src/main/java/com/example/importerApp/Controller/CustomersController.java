package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Customers;
import com.example.importerApp.Service.CustomersService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/customers/findCustByName", method = RequestMethod.GET ,produces={ "application/json"})
    public List<String> findCustByNameSorted(@RequestParam("custname") String name, @RequestParam("creditLimit") Integer creditLimit){
        System.out.println("name = " +name);
        return customersService.findSortedName(name, creditLimit);
    }
}
