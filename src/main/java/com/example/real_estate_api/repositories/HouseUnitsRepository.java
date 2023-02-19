package com.example.real_estate_api.repositories;

import com.example.real_estate_api.models.HouseUnits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseUnitsRepository extends JpaRepository<HouseUnits, Integer> {
    HouseUnits findByHouseNumber(String houseNumber);
}
