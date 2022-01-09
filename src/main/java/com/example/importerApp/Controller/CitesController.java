package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Cities;
import com.example.importerApp.Service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CitesController {

    @Autowired
    CitiesService citiesService;

    @RequestMapping(path = "/getAllCities", method = RequestMethod.GET, produces =  {"application/json"})
    public List<Cities> findAllCities(){
        return this.citiesService.findAllCities();
    }


    @RequestMapping(path = "/getCitiesByName", method = RequestMethod.GET, produces =  {"application/json"})
    public List<Cities> findCitiesByName(@RequestParam("cityName") String name){
        return this.citiesService.findCitiesByName(name);
    }

    @RequestMapping(path = "/addCities", method = RequestMethod.POST, produces = {"application/json"})
    public Cities addCities(@RequestBody  Cities cities) throws Exception{
        try{
            this.citiesService.saveCities(cities);
        }catch (Exception e){
            System.out.println("msg " + e.getMessage());
        }
        return cities;
    }

    @RequestMapping(path = "/updateCities", method = RequestMethod.PUT, produces = {"application/json"} )
    public Cities updateCities(@RequestBody Cities cities) throws Exception{
        try {
            this.citiesService.updateCities(cities);
        }catch (Exception e){
            System.out.println("msg " + e.getMessage());
        }
        return cities;
    }

    @RequestMapping(path = "/deleteCities", method = RequestMethod.DELETE, produces = {"application/json"})
    public Integer deleteCites(@RequestParam("cityId")  Integer cityId) throws Exception{
        Integer i=null;
        try {
            i=this.citiesService.deleteCitesById(cityId);
            if(i==0){
                return 0;
            }
        }catch (Exception e) {
            System.out.println("msg error " + e.getMessage());
        }
        return i;
    }
}

