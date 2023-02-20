package com.example.real_estate_api.repositories;

import com.example.real_estate_api.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {

    List<Bill> findByApartmentId(int apartmentId);

    List<Bill> findByHouseUnitId(int houseUnitId);

    List<Bill> findByTenantId(int tenantId);
}
