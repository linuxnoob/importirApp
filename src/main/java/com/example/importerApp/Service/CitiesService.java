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
}
