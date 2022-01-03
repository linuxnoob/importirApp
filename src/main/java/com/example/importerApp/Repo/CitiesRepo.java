package com.example.importerApp.Repo;

import com.example.importerApp.Entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CitiesRepo extends JpaRepository<Cities, Integer> {

    @Query("Select C from Cities C where C.cityName like %:cityName%")
    List<Cities> findCityByName(String cityName);

    @Query("Select C from Cities C where C.cityId = :cityId")
    List<Cities> findAllById(Integer cityId);


}
