package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Landlord;
import com.example.real_estate_api.services.LandlordsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/landlords")
public class LandlordsController {
    @Autowired
    private LandlordsServices landlordsServices;

    @PostMapping
    public String addLandlord(@RequestBody Landlord landlord){
        return landlordsServices.addLandlord(landlord);
    }

    @GetMapping
    public List<Landlord> getLandlords(){
        return landlordsServices.getLandlords();
    }

    @GetMapping(value="/{fullName}")
    public Landlord getSpecificLandlord(@PathVariable("fullName") String fullName){
        return landlordsServices.getSpecificLandlord(fullName);
    }

    @PutMapping(value="/update/{id}")
    public String updateLandlord(@PathVariable("id") int id, @RequestBody Landlord landlord){
        return landlordsServices.updateLandlord(id, landlord);
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteLandlord(@PathVariable("id") int id){
        return  landlordsServices.deleteLandlord(id);
    }
}
