package com.example.importerApp.Repo;

import com.example.importerApp.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import java.util.List;

@RepositoryRestResource
public interface SupplierRepo extends JpaRepository<Supplier, Integer> {

    @Query("Select S from Supplier S where S.supplierId = :supplierId")
    Supplier findSupplierById(Integer supplierId);
}
