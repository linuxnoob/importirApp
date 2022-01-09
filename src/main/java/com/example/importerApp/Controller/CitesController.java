package com.example.importerApp.Controller;

import com.example.importerApp.Entity.Cities;
import com.example.importerApp.Service.CitiesService;
import net.minidev.json.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin",origins =  {"http://localhost:4200"})
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
    public ResponseEntity<String> updateCities(@RequestBody Cities cities) throws Exception{
        Cities cities1 = new Cities();
        try {
            cities1=this.citiesService.updateCities(cities);
            if(cities1 == null){
                return new ResponseEntity<>("update failed ", HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e){
            System.out.println("msg " + e.getMessage());
        }
        return new ResponseEntity<>(" update success " + cities1, HttpStatus.OK);
    }

    @RequestMapping(path = "/deleteCities", method = RequestMethod.DELETE, produces = {"application/json"})
    public ResponseEntity<String> deleteCites(@RequestParam("cityId")  Integer cityId) throws Exception{
        Integer i=null;
        try {
            i=this.citiesService.deleteCitesById(cityId);
            if(i==0){
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e) {
            System.out.println("msg error " + e.getMessage());
        }
        return new ResponseEntity<>("delete success ", HttpStatus.OK);
    }
}

