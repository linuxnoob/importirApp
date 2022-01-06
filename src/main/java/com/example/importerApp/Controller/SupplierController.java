package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Supplier;
import com.example.importerApp.Service.SupplierService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @RequestMapping(path = "/getAllSupplier", method = RequestMethod.GET, produces =  {"application/json"})
    public List<Supplier> getAllSupplier(){
        return this.supplierService.getAllSupplier();
    }

    @RequestMapping(path = "/getSupplierById", method = RequestMethod.GET, produces =  {"application/json"})
    public Supplier getSupplierById(@RequestParam("supplierId") Integer supplierId){
        return this.supplierService.getSupplierById(supplierId);
    }
}
