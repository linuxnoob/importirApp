package com.example.importerApp.Service;


import com.example.importerApp.Entity.Customers;
import com.example.importerApp.Repo.CustomersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    //filterListCustomer
    public List<String> findSortedName(String name, Integer creditLimit){
        List<String> stringList = new ArrayList<>();
        try {

            List<Customers> customersList = this.customersRepo.findByName(name);
            if(!customersList.isEmpty()){
                stringList = customersList.stream()
                        .filter((customers) -> customers.getCreditLimit().intValue()  > creditLimit)
                        .sorted((c1,c2) -> c1.getCreditLimit().compareTo(c2.getCreditLimit()))
                        .map((customers) ->customers.getCustomerName())
                        .collect(Collectors.toList());
                System.out.println(stringList);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return stringList;
    }
}
