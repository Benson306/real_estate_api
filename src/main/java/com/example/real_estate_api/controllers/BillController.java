package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Bill;
import com.example.real_estate_api.services.BillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/billing")
public class BillController {
    @Autowired
    private BillServices billServices;

    @PostMapping
    public String addBill(@RequestBody Bill bill){
        return  billServices.addBill(bill);
    }

    @GetMapping(value="/apartment/{id}")
    public List<Bill> getBillByApartmentId(@PathVariable("id") int id){
        return billServices.getBillByApartmentId(id);
    }

    @GetMapping(value="/house/{id}")
    public List<Bill> getBillByHouseUnitId(@PathVariable("id") int id){
        return billServices.getBillByHouseUnitId(id);
    }

    @GetMapping(value="/tenant/{id}")
    public List<Bill> getBillByTenantId(@PathVariable("id") int id){
        return billServices.getBillByTenantId(id);
    }
}
