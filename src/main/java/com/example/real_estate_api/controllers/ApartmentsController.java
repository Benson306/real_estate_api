package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Apartment;
import com.example.real_estate_api.services.ApartmentsServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/apartments")
@Tag(name = "Apartments")
public class ApartmentsController {
    @Autowired
    private ApartmentsServices apartmentsServices;
    @PostMapping
    @Operation(summary = "Add an Apartment")
    public String addApartments(@RequestBody Apartment apartment){
        return apartmentsServices.addApartment(apartment);
    }

    @GetMapping
    @Operation(summary = "Find All Apartments")
    public List<Apartment> getApartments(){
        return apartmentsServices.getApartments();
    }

    @GetMapping(value = "/id/{id}")
    @Operation(summary = "Find A Specific Apartment By Id")
    public Apartment getApartmentById(@PathVariable("id") int id){
        return apartmentsServices.getApartmentById(id);
    }
    @GetMapping(value="/{name}")
    @Operation(summary = "Find A Specific Apartment By name")
    public Apartment getSpecificApartment(@PathVariable("name") String name){
        return apartmentsServices.getSpecificApartment(name);
    }

    @PutMapping(value = "/update/{id}")
    @Operation(summary = "Update A Specific Apartment Details")
    public  String updateApartment(@PathVariable("id") int id, @RequestBody Apartment apartment){
        return apartmentsServices.updateApartment(id, apartment);
    }

    @DeleteMapping(value = "/delete/{id}")
    @Operation(summary = "Delete A Specific Apartment By Id")
    public String deleteApartment(@PathVariable("id") int id){
        return  apartmentsServices.deleteApartment(id);
    }

}
