package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Tenant;
import com.example.real_estate_api.services.TenantsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/tenants")
public class TenantsController {
    @Autowired
    private TenantsServices tenantsServices;

    @PostMapping
    public String addTenant(@RequestBody Tenant tenant){
        return  tenantsServices.addTenant(tenant);
    }

    @GetMapping(value = "/id/{id}")
    public Tenant getTenantsById(@PathVariable("id") int id){
        return tenantsServices.getTenantById(id);
    }

    @GetMapping(value = "/apartment/{apartmentId}")
    public List<Tenant> getTenantsByApartment(@PathVariable("apartmentId") int apartmentId){
        return tenantsServices.getTenantsByApartment(apartmentId);
    }

    @PutMapping(value = "/update/{id}")
    public String updateTenant(@PathVariable("id") int id, @RequestBody Tenant tenant){
        return tenantsServices.updateTenant(id, tenant);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteTenant(@PathVariable("id") int id){
        return tenantsServices.deleteTenant(id);
    }
}
