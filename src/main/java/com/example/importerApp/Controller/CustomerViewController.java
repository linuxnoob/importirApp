package com.example.importerApp.Controller;

import com.example.importerApp.EntityView.CustomerView;
import com.example.importerApp.Service.CustomerViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/customers/view")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin",origins =  {"http://localhost:4200"})
public class CustomerViewController {

    @Autowired
    CustomerViewService customerViewService;

    @RequestMapping(path = "/findAllCust", method = RequestMethod.GET ,produces={ "application/json"})
    public List<CustomerView> findAllCustView() throws SQLException {
        List<CustomerView> customerViewList = new ArrayList<>();
        try {
            customerViewList = this.customerViewService.findAllCust();
        }catch (Exception e){
            System.out.println("exception " + e.getMessage());
        }
        return  customerViewList;
    }

    @RequestMapping(path = "/findAllCustByName", method = RequestMethod.GET ,produces={ "application/json"})
    public List<CustomerView> findAllCustViewByName(@RequestParam("custname") String name) throws SQLException {
        List<CustomerView> customerViewList = new ArrayList<>();
        try {
            customerViewList = this.customerViewService.findViewCustByName(name);
        }catch (Exception e){
            System.out.println("exception " + e.getMessage());
        }
        return  customerViewList;
    }
}
