package com.example.real_estate_api.services;

import com.example.real_estate_api.models.Landlord;
import com.example.real_estate_api.repositories.LandlordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class LandlordsServices {
    @Autowired
    private LandlordsRepository landlordsRepository;

    public String addLandlord(Landlord landlord){

        Landlord ld = landlordsRepository.findByFullName(landlord.getFullName());

        if(ObjectUtils.isEmpty(ld)){
            landlordsRepository.save(landlord);
            return "Landlord Added";
        }else{
            return "Landlord Exists";
        }

    }


}
