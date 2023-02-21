package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.HouseUnits;
import com.example.real_estate_api.services.HouseUnitsServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/house_units")
@Tag(name="House Units")
public class HouseUnitsController {
    @Autowired
    private HouseUnitsServices houseUnitsServices;
    @PostMapping
    @Operation(summary = "Add A House Unit")
    public String addHouseUnit(@RequestBody HouseUnits houseUnits){
        return houseUnitsServices.addHouseUnit(houseUnits);
    }

    @GetMapping
    @Operation(summary = "Get All House Units")
    public List<HouseUnits> getHouseUnits(){
        return houseUnitsServices.getHouseUnits();
    }

    @GetMapping(value = "/id/{id}")
    @Operation(summary = "Get A House Unit By Id")
    public HouseUnits getHouseUnitById(@PathVariable("id") int id){
        return houseUnitsServices.getHouseUnitById(id);
    }

    @GetMapping(value = "/apartment/{id}")
    @Operation(summary = "Find All House Units In a Specific Apartment")
    public List<HouseUnits> getHouseUnitsInApartment(@PathVariable("id") int id){
        return houseUnitsServices.getHouseUnitsInApartment(id);
    }
    @GetMapping(value = "/{houseNumber}")
    @Operation(summary = "Get a Specific House Unit")
    public HouseUnits getSpecificHouseUnit(@PathVariable("houseNumber") String houseNumber){
        return houseUnitsServices.getSpecificHouseUnit(houseNumber);
    }

    @PutMapping(value = "/update/{id}")
    @Operation(summary = "Update a House Unit Details")
    public String updateHouseUnits(@PathVariable("id") int id, @RequestBody HouseUnits houseUnits){
        return houseUnitsServices.updateHouseUnit(id, houseUnits);
    }

    @DeleteMapping(value = "/delete/{id}")
    @Operation(summary = "Delete A House Unit")
    public String deleteHouseUnits(@PathVariable("id") int id){
        return houseUnitsServices.deleteHouseUnit(id);
    }
}
