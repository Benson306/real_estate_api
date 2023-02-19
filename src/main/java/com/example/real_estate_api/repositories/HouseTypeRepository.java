package com.example.real_estate_api.repositories;

import com.example.real_estate_api.models.HouseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseTypeRepository extends JpaRepository<HouseType, Integer> {

    HouseType findByType(String type);
}
