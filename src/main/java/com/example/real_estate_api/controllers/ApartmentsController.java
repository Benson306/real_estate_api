package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Apartment;
import com.example.real_estate_api.services.ApartmentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/apartments")
public class ApartmentsController {
    @Autowired
    private ApartmentsServices apartmentsServices;
    @PostMapping
    public String addApartments(@RequestBody Apartment apartment){
        return apartmentsServices.addApartment(apartment);
    }

    @GetMapping
    public List<Apartment> getApartments(){
        return apartmentsServices.getApartments();
    }

    @GetMapping(value = "/id/{id}")
    public Apartment getApartmentById(@PathVariable("id") int id){
        return apartmentsServices.getApartmentById(id);
    }
    @GetMapping(value="/{name}")
    public Apartment getSpecificApartment(@PathVariable("name") String name){
        return apartmentsServices.getSpecificApartment(name);
    }

    @PutMapping(value = "/update/{id}")
    public  String updateApartment(@PathVariable("id") int id, @RequestBody Apartment apartment){
        return apartmentsServices.updateApartment(id, apartment);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteApartment(@PathVariable("id") int id){
        return  apartmentsServices.deleteApartment(id);
    }

}
