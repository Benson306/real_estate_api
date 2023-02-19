package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.Landlord;
import com.example.real_estate_api.services.LandlordsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/landlords")
public class LandlordsController {
    @Autowired
    private LandlordsServices landlordsServices;

    @PostMapping
    public String addLandlord(@RequestBody Landlord landlord){
        return landlordsServices.addLandlord(landlord);
    }
}
