package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Bill;
import com.example.real_estate_api.services.BillServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/billing")
@Tag(name="Billing")
public class BillController {
    @Autowired
    private BillServices billServices;

    @PostMapping
    @Operation(summary = "Post a Bill")
    public String addBill(@RequestBody Bill bill){
        return  billServices.addBill(bill);
    }

    @GetMapping(value="/apartment/{id}")
    @Operation(summary = "Get All Bills of an Apartment")
    public List<Bill> getBillByApartmentId(@PathVariable("id") int id){
        return billServices.getBillByApartmentId(id);
    }

    @GetMapping(value="/house/{id}")
    @Operation(summary = "Get All Bills of a House Unit")
    public List<Bill> getBillByHouseUnitId(@PathVariable("id") int id){
        return billServices.getBillByHouseUnitId(id);
    }

    @GetMapping(value="/tenant/{id}")
    @Operation(summary = "Get All Bills of a Tenant")
    public List<Bill> getBillByTenantId(@PathVariable("id") int id){
        return billServices.getBillByTenantId(id);
    }
}
