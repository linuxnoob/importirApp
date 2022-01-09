package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Supplier;
import com.example.importerApp.Service.SupplierService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(path = "/saveSupplier", method = RequestMethod.POST, produces ={"application/json"})
    public ResponseEntity<String> saveSupplier(@RequestBody Supplier supplier){
        Supplier supplier1= null;
        try {
            supplier1 = this.supplierService.saveSupplier(supplier);
            if(supplier1!=null){
                return new ResponseEntity<>("save success "+ supplier, HttpStatus.CREATED);
            }
        }catch (Exception e){
            System.out.println("error " + e.getMessage());
        }
        return new ResponseEntity<>("save error", HttpStatus.EXPECTATION_FAILED);
    }

    @RequestMapping(path = "/updateBySupplier", method = RequestMethod.PUT, produces ={"application/json"})
    public ResponseEntity<String> updateSupplier(@RequestBody Supplier supplier){

        try{
            Supplier supplier1 = this.supplierService.updateSupplier(supplier);
            if(supplier == null){
                return new ResponseEntity<>("update error " , HttpStatus.BAD_REQUEST);
            }

        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return new ResponseEntity<>("save successs ", HttpStatus.OK);
    }
    @RequestMapping(path = "/updateSupplierById", method = RequestMethod.DELETE, produces ={"application/json"})
    public ResponseEntity<String> deleteSupplier(@RequestParam("supplierId") Integer supplierId){

        try{
           Integer status = this.supplierService.deleteSuppById(supplierId);
            if(status == null){
                return new ResponseEntity<>("update error " ,HttpStatus.BAD_REQUEST);
            }

        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return new ResponseEntity<>("save successs ", HttpStatus.OK);
    }



}
