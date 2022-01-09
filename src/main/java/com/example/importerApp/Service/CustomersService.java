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

    public Customers saveCustomers(Customers customers) throws Exception{
        Customers customers1= new Customers();
        try {
           customers1 =this.customersRepo.save(customers);
            System.out.println(customers1);
        }catch (Exception e){
            System.out.println("msg error " + e.getMessage());
        }
        return customers;
    }

    public Customers updateCust(Customers customers) throws Exception{
        Customers cust= new Customers();
        try {
            cust = this.customersRepo.getById(customers.getCustomerId());
            if(cust !=null){
                this.customersRepo.save(customers);
            } else {
                return cust;
            }

        }catch (Exception e){
            System.out.println("msg error " + e.getMessage());
        }
        return customers;
    }

    public Integer deleteById(Integer custId) throws Exception{
        Customers customers = new Customers();
        try {
            customers = this.customersRepo.getById(custId);
            if(customers!=null){
                this.customersRepo.deleteById(custId);
            }else{
                return 1;
            }
        }catch (Exception e){
            System.out.println("msg error " + e.getMessage());
        }
        return custId;
    }

}
