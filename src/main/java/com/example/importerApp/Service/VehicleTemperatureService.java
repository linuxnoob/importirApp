package com.example.importerApp.Service;

import com.example.importerApp.Entity.VehicleTemperatures;
import com.example.importerApp.Repo.VehicleTemperatureRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleTemperatureService {

    @Autowired
    VehicleTemperatureRepo vehicleTemperatureRepo;

    public VehicleTemperatures saveVehicle (VehicleTemperatures vehicleTemperatures){
        return this.vehicleTemperatureRepo.save(vehicleTemperatures);
    }



    public List<VehicleTemperatures> findAll(){
        return this.vehicleTemperatureRepo.findAll();
    }

    public  List<VehicleTemperatures> findByRegristationName(String name){
        return this.vehicleTemperatureRepo.findVehicleByRegistration(name);

    }

}
