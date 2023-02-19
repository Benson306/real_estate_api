package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.HouseType;
import com.example.real_estate_api.services.HouseTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/house_types")
public class HouseTypeController {
    @Autowired
    private HouseTypeServices houseTypeServices;
    @PostMapping
    public String addHouseTypes(@RequestBody HouseType houseType){
        return houseTypeServices.addHouseTypes(houseType);
    }
    @GetMapping
    public List<HouseType> getAllHouseTypes(){
        return houseTypeServices.getAllHouseTypes();
    }
    @PutMapping(value="/update/{id}")
    public String updateHouseTypes(@PathVariable("id") int id, @RequestBody HouseType houseType){
        return houseTypeServices.updateHouseTypes(id, houseType);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteHouseTypes(@PathVariable("id") int id){
        return houseTypeServices.deleteHouseTypes(id);
    }

}

