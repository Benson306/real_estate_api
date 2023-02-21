package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.HouseType;
import com.example.real_estate_api.services.HouseTypeServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/house_types")
@Tag(name="House Types")
public class HouseTypeController {
    @Autowired
    private HouseTypeServices houseTypeServices;
    @PostMapping
    @Operation(summary = "Add House Types e.g Bedsitter, One Bedroom etc.")
    public String addHouseTypes(@RequestBody HouseType houseType){
        return houseTypeServices.addHouseTypes(houseType);
    }
    @GetMapping
    @Operation(summary = "Get All House Types")
    public List<HouseType> getAllHouseTypes(){
        return houseTypeServices.getAllHouseTypes();
    }
    @PutMapping(value="/update/{id}")
    @Operation(summary = "Update A House Type Detail")
    public String updateHouseTypes(@PathVariable("id") int id, @RequestBody HouseType houseType){
        return houseTypeServices.updateHouseTypes(id, houseType);
    }

    @DeleteMapping(value = "/delete/{id}")
    @Operation(summary = "Delete A House Type")
    public String deleteHouseTypes(@PathVariable("id") int id){
        return houseTypeServices.deleteHouseTypes(id);
    }

}

