package com.example.real_estate_api.repositories;

import com.example.real_estate_api.models.Landlord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandlordsRepository extends JpaRepository<Landlord, Integer> {

    Landlord findByFullName(String fullName);
}
