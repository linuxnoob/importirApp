package com.example.importerApp.Service;

import com.example.importerApp.Entity.Cities;
import com.example.importerApp.Repo.CitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CitiesService {

    @Autowired
    CitiesRepo citiesRepo;

    public List<Cities> findAllCities(){
        List<Cities> citiesList1 = new ArrayList<>();
        citiesList1 = (List<Cities>)  this.citiesRepo.findAll().stream().
                sorted((c1,c2) -> c1.getStateProvinceId().compareTo(c2.getStateProvinceId()))
                .map((cites)-> cites)
                .collect(Collectors.toList());

        return citiesList1;

    }

    public List<Cities> findCitiesByName(String citesName){
        List<Cities> citiesList = new ArrayList<>();
        List<Cities> citiesList1 = new ArrayList<>();
        citiesList = this.citiesRepo.findCityByName(citesName);
        citiesList1 = (List<Cities>) citiesList.stream().
                sorted((c1,c2) -> c1.getStateProvinceId().compareTo(c2.getStateProvinceId()))
        .map((cites)-> cites)
                .collect(Collectors.toList());

        return citiesList1;
    }

    public Cities saveCities(Cities cities) throws Exception{
        Cities city = new Cities();
        try {
            city = this.citiesRepo.getById(cities.getCityId());
            if(city !=null){
                return null;
            }else {
                this.citiesRepo.save(cities);
            }
        }catch (Exception e){
            System.out.println("message error " + e.getMessage());
        }
        return cities;
    }

    public Cities updateCities(Cities cities) throws  Exception{
        try {
            Cities cities1 = this.citiesRepo.findById(cities.getCityId()).orElse(null);
            if(cities1!=null){
                this.citiesRepo.save(cities);
            }else {
                return cities1;
            }
        }catch (Exception e){
            System.out.println("msg error " + e.getMessage());
        }
        return cities;
    }

    public Integer deleteCitesById(Integer cityId) throws Exception{
        try {
            Cities cities = this.citiesRepo.findById(cityId).orElse(null);
            if(cities!=null){
                this.citiesRepo.deleteById(cityId);
            }else{
                return Integer.valueOf(1);
            }

        }catch (Exception e){
            System.out.println("msg error " +e.getMessage());
        }
        return cityId;
    }
}
