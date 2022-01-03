package com.example.importerApp.Service;


import com.example.importerApp.Entity.Customers;
import com.example.importerApp.Repo.CustomersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersService {

    @Autowired
    CustomersRepo customersRepo;

    public List<Customers> findCustomerByName(String name){
        System.out.println("CustomerService name " + name);
        return this.customersRepo.findByName(name);
    }

    public List<Customers> findAllCust(){
        return this.customersRepo.findAll();
    }

    public List<Customers> findCustById(Integer id){
        return customersRepo.findAllById(id);
    }
}
