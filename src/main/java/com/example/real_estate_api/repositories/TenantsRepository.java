package com.example.real_estate_api.repositories;

import com.example.real_estate_api.models.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TenantsRepository extends JpaRepository<Tenant,Integer> {
    Tenant findByFullName(String fullName);

    List<Tenant> findByApartmentId(int id);
}
