package com.example.importerApp.Service;

import com.example.importerApp.Entity.Customers;
import com.example.importerApp.Entity.Supplier;
import com.example.importerApp.Repo.SupplierRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Supplier saveSupplier(Supplier supplier) throws Exception{
        try {
            this.supplierRepo.save(supplier);
            }catch (Exception e){
            System.out.println("msg error " + e.getMessage());
            return null;
        }
        return supplier;
    }

    public Supplier updateSupplier(Supplier supplier) throws Exception{
        Supplier supp=null;
        try {
            supp = this.getSupplierById(supplier.getSupplierId());
                if (supp!=null){
                    this.supplierRepo.save(supplier);
                }else {
                    return null;
                }

        }catch (Exception e){
            System.out.println("error msg " + e.getMessage());
        }
        return supplier;
    }

    public Integer deleteSuppById(Integer supplierId)throws Exception{
        try {
            Supplier supplier = this.getSupplierById(supplierId);
                if (supplier !=null){
                    this.supplierRepo.deleteById(supplierId);
                } else {
                    return null;
                }

        }catch (Exception e){
            System.out.println(" error msg " + e.getMessage());
        }
        return supplierId;
    }

}
