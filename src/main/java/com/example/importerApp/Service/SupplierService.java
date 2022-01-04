package com.example.importerApp.Service;

import com.example.importerApp.Entity.Supplier;
import com.example.importerApp.Repo.SupplierRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplierService {

    @Autowired
    SupplierRepo supplierRepo;

    public List<Supplier> getAllSupplier(){
        return this.supplierRepo.findAll();
    }

    public Supplier getSupplierById(Integer supplierId){
        return this.supplierRepo.findSupplierById(supplierId);

    }

}
