package com.example.importerApp.Repo;

import com.example.importerApp.Entity.VehicleTemperatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface VehicleTemperatureRepo extends JpaRepository<VehicleTemperatures, Integer> {

    //List<VehicleTemperatures> findAllById(Integer vehicleTemperatureID);

    @Query("select V from VehicleTemperatures V where V.vehicleRegistration like %:registration%")
    List<VehicleTemperatures> findVehicleByRegistration(String registration);




}
