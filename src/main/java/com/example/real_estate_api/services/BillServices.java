package com.example.real_estate_api.services;

import com.example.real_estate_api.models.Bill;
import com.example.real_estate_api.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BillServices {
    @Autowired
    private BillRepository billRepository;

    public String addBill(Bill bill){
        bill.setBillingTime(LocalDateTime.now());
        billRepository.save(bill);
        return "Billing Done";
    }

    public List<Bill> getBillByApartmentId(int apartmentId){
        return billRepository.findByApartmentId(apartmentId);
    }

    public List<Bill> getBillByHouseUnitId(int houseUnitId){
        return  billRepository.findByHouseUnitId(houseUnitId);
    }

    public List<Bill> getBillByTenantId(int tenantId){
        return billRepository.findByTenantId(tenantId);
    }
}
