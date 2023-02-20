package com.example.real_estate_api.services;

import com.example.real_estate_api.models.HouseUnits;
import com.example.real_estate_api.repositories.HouseUnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class HouseUnitsServices {
    @Autowired
    private HouseUnitsRepository houseUnitsRepository;

    public String addHouseUnit(HouseUnits houseUnits){
        HouseUnits units = houseUnitsRepository.findByHouseNumber(houseUnits.getHouseNumber());

        if(ObjectUtils.isEmpty(units)){
            houseUnitsRepository.save(houseUnits);
            return "Unit Added";
        }else{
            return "Unit Already Exists";
        }
    }

    public List<HouseUnits> getHouseUnits(){
        return houseUnitsRepository.findAll();
    }

    public HouseUnits getHouseUnitById(int id){
        return houseUnitsRepository.findById(id).orElse(null);
    }

    public HouseUnits getSpecificHouseUnit(String houseNumber){
        return  houseUnitsRepository.findByHouseNumber(houseNumber);
    }

    public List<HouseUnits> getHouseUnitsInApartment(int apartmentID){
        return houseUnitsRepository.findByApartmentId(apartmentID);
    }

    public String updateHouseUnit(int id, HouseUnits houseUnits){
        HouseUnits units = houseUnitsRepository.findById(id).orElse(null);

        if(ObjectUtils.isEmpty(units)){
            return "Unit Does Not exist";
        }else{
            units.setHouseNumber(houseUnits.getHouseNumber());
            units.setHouseTypeId(houseUnits.getHouseTypeId());
            units.setRent(houseUnits.getRent());
            units.setApartmentId(houseUnits.getApartmentId());

            houseUnitsRepository.save(units);
            return "House Unit Updated";
        }
    }

    public String deleteHouseUnit(int id){
        HouseUnits units = houseUnitsRepository.findById(id).orElse(null);

        if(ObjectUtils.isEmpty(units)){
            return "Unit Does Not exist";
        }else{
            houseUnitsRepository.deleteById(id);
            return "House Unit Deleted";
        }
    }
}
