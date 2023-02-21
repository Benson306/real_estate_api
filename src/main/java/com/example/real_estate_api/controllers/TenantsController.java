package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Tenant;
import com.example.real_estate_api.services.TenantsServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/tenants")
@Tag(name="Tenants")
public class TenantsController {
    @Autowired
    private TenantsServices tenantsServices;

    @PostMapping
    @Operation(summary = "Add a Tenant")
    public String addTenant(@RequestBody Tenant tenant){
        return  tenantsServices.addTenant(tenant);
    }

    @GetMapping(value = "/id/{id}")
    @Operation(summary = "Find a Tenant By Id")
    public Tenant getTenantsById(@PathVariable("id") int id){
        return tenantsServices.getTenantById(id);
    }

    @GetMapping(value = "/apartment/{apartmentId}")
    @Operation(summary = "Find Tenants By apartmentId")
    public List<Tenant> getTenantsByApartment(@PathVariable("apartmentId") int apartmentId){
        return tenantsServices.getTenantsByApartment(apartmentId);
    }

    @PutMapping(value = "/update/{id}")
    @Operation(summary = "Update a tenant's Details")
    public String updateTenant(@PathVariable("id") int id, @RequestBody Tenant tenant){
        return tenantsServices.updateTenant(id, tenant);
    }

    @DeleteMapping(value = "/delete/{id}")
    @Operation(summary = "Delete a Tenant")
    public String deleteTenant(@PathVariable("id") int id){
        return tenantsServices.deleteTenant(id);
    }
}
