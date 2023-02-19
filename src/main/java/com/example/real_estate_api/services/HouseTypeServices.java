package com.example.real_estate_api.services;

import com.example.real_estate_api.models.HouseType;
import com.example.real_estate_api.repositories.HouseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class HouseTypeServices {
    @Autowired
    private HouseTypeRepository houseTypeRepository;

    public String addHouseTypes(HouseType houseType){
        HouseType existing = houseTypeRepository.findByType(houseType.getType());

        if(!ObjectUtils.isEmpty(existing)){
            return "House Type Exists";
        }else{
            houseTypeRepository.save(houseType);
            return "House Type Added";
        }

    }

    public List<HouseType> getAllHouseTypes(){
        return houseTypeRepository.findAll();
    }

    public String updateHouseTypes(int id, HouseType houseType){
        HouseType existing = houseTypeRepository.findById(id).orElse(null);

        if(!ObjectUtils.isEmpty(existing)){
            existing.setType(houseType.getType());

            houseTypeRepository.save(existing);
            return "House Type updated";
        }else{
            return "House Type Does Not Exist";
        }
    }

    public String deleteHouseTypes(int id){
        HouseType existing = houseTypeRepository.findById(id).orElse(null);

        if(!ObjectUtils.isEmpty(existing)){
            houseTypeRepository.deleteById(id);
            return "House Type Deleted";
        }else{
            return "House Type Does Not Exist";
        }
    }
}
