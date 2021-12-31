package com.example.importerApp.Controller;

import com.example.importerApp.Entity.VehicleTemperatures;
import com.example.importerApp.Service.VehicleTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleTemperatureService vehicleTemperatureService;

    @GetMapping("/vehicle/findAll")
    public List<VehicleTemperatures> findAllVehicle(){
        return vehicleTemperatureService.findAll();
    }

    @PostMapping("/vehicle/getByName/{name}")
    public List<VehicleTemperatures> findByName(@PathVariable String name){
        return this.vehicleTemperatureService.findByRegristationName(name);
    }

}
