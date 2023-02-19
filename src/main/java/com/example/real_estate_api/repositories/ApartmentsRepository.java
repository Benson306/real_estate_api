package com.example.real_estate_api.repositories;

import com.example.real_estate_api.models.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentsRepository extends JpaRepository<Apartment,Integer> {

    Apartment findByName(String name);
}
