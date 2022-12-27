package com.springCodekul.springCodekul.onetomany.repository;

import com.springCodekul.springCodekul.onetomany.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
