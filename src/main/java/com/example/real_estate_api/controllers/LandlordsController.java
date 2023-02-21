package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Landlord;
import com.example.real_estate_api.services.LandlordsServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/landlords")
@Tag(name = "Landlords")
public class LandlordsController {
    @Autowired
    private LandlordsServices landlordsServices;

    @PostMapping
    @Operation(summary = "Add a Landlord")
    public String addLandlord(@RequestBody Landlord landlord){
        return landlordsServices.addLandlord(landlord);
    }

    @GetMapping
    @Operation(summary = "Find All Landlords")
    public List<Landlord> getLandlords(){
        return landlordsServices.getLandlords();
    }

    @GetMapping(value="/{fullName}")
    @Operation(summary = "Find A Specific Landlord")
    public Landlord getSpecificLandlord(@PathVariable("fullName") String fullName){
        return landlordsServices.getSpecificLandlord(fullName);
    }

    @PutMapping(value="/update/{id}")
    @Operation(summary = "Update A Landlords Details")
    public String updateLandlord(@PathVariable("id") int id, @RequestBody Landlord landlord){
        return landlordsServices.updateLandlord(id, landlord);
    }

    @DeleteMapping(value="/delete/{id}")
    @Operation(summary = "Delete a Landlord")
    public String deleteLandlord(@PathVariable("id") int id){
        return  landlordsServices.deleteLandlord(id);
    }
}
