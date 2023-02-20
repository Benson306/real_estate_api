package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.HouseUnits;
import com.example.real_estate_api.services.HouseUnitsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/house_units")
public class HouseUnitsController {
    @Autowired
    private HouseUnitsServices houseUnitsServices;
    @PostMapping
    public String addHouseUnit(@RequestBody HouseUnits houseUnits){
        return houseUnitsServices.addHouseUnit(houseUnits);
    }

    @GetMapping
    public List<HouseUnits> getHouseUnits(){
        return houseUnitsServices.getHouseUnits();
    }

    @GetMapping(value = "/id/{id}")
    public HouseUnits getHouseUnitById(@PathVariable("id") int id){
        return houseUnitsServices.getHouseUnitById(id);
    }

    @GetMapping(value = "/apartment/{id}")
    public List<HouseUnits> getHouseUnitsInApartment(@PathVariable("id") int id){
        return houseUnitsServices.getHouseUnitsInApartment(id);
    }
    @GetMapping(value = "/{houseNumber}")
    public HouseUnits getSpecificHouseUnit(@PathVariable("houseNumber") String houseNumber){
        return houseUnitsServices.getSpecificHouseUnit(houseNumber);
    }

    @PutMapping(value = "/update/{id}")
    public String updateHouseUnits(@PathVariable("id") int id, @RequestBody HouseUnits houseUnits){
        return houseUnitsServices.updateHouseUnit(id, houseUnits);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteHouseUnits(@PathVariable("id") int id){
        return houseUnitsServices.deleteHouseUnit(id);
    }
}
