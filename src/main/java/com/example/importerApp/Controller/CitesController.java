package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Cities;
import com.example.importerApp.Service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CitesController {

    @Autowired
    CitiesService citiesService;

    @GetMapping("/cities/getAllCities")
    public List<Cities> findAllCities(){
        return this.citiesService.findAllCities();
    }


    @RequestMapping(path = "/cities/getCitiesByName", method = RequestMethod.GET, produces =  {"application/json"})
    public List<Cities> findCitiesByName(@RequestParam("cityName") String name){
        return this.citiesService.findCitiesByName(name);
    }
}
