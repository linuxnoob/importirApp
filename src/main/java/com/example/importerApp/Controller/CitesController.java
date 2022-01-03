package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Cities;
import com.example.importerApp.Service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitesController {

    @Autowired
    CitiesService citiesService;

    @GetMapping("/cities/getAllCities")
    public List<Cities> findAllCities(){
        return this.citiesService.findAllCities();
    }


    @GetMapping("/cities/getCitiesByName/{citiesName}")
    public List<Cities> findCitiesByName(@PathVariable String name){
        return this.citiesService.findCitiesByName(name);
    }
}
