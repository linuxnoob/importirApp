package com.example.importerApp.Service;

import com.example.importerApp.Entity.Cities;
import com.example.importerApp.Repo.CitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitiesService {

    @Autowired
    CitiesRepo citiesRepo;

    public List<Cities> findAllCities(){
        return this.citiesRepo.findAll();

    }

    public List<Cities> findCitiesByName(String citesName){
        return this.findCitiesByName(citesName);
    }
}
