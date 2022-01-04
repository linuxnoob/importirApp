package com.example.importerApp.Service;

import com.example.importerApp.EntityView.CustomerView;
import com.example.importerApp.Repo.CustomerViewRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerViewService {

    @Autowired
    CustomerViewRepo customerViewRepo;

    public List<CustomerView> findAllCust() throws SQLException {
        List<CustomerView> customerViewList = new ArrayList<>();
        try {
            customerViewList = this.customerViewRepo.findCustomViewAll();

        }catch (Exception e){
            System.out.println("exception " + e.getMessage());
        }

        return customerViewList;
    }

    public List<CustomerView> findViewCustByName(String name) throws SQLException{
        List<CustomerView> customerViewList = new ArrayList<>();
        try {
            customerViewList = this.customerViewRepo.findCustomView(name);
        }catch (Exception e){
            System.out.println("e " + e.getMessage());
        }
        return customerViewList;
    }
}
