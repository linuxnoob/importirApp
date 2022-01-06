package com.example.importerApp.Controller;

import com.example.importerApp.Entity.VehicleTemperatures;
import com.example.importerApp.Service.VehicleTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleTemperatureService vehicleTemperatureService;

    @GetMapping("/findAll")
    public List<VehicleTemperatures> findAllVehicle(){
        return vehicleTemperatureService.findAll();
    }

    @PostMapping("/getByName/{name}")
    public List<VehicleTemperatures> findByName(@PathVariable String name){
        return this.vehicleTemperatureService.findByRegristationName(name);
    }

}
