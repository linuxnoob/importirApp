package com.example.importerApp.Repo;

import com.example.importerApp.Entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomersRepo extends JpaRepository<Customers, Integer> {


    @Query("Select C from Customers C where C.customerId = customerId")
    List<Customers> findAllById(Integer customerId);

    @Query("Select C from Customers C where C.customerName like %:name%")
    List<Customers> findByName(String name);
}
