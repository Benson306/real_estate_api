package com.example.real_estate_api.services;

import com.example.real_estate_api.models.Landlord;
import com.example.real_estate_api.repositories.LandlordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

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
    public List<Landlord> getLandlords(){
        return landlordsRepository.findAll();
    }

    public Landlord getSpecificLandlord(String fullName){
        return landlordsRepository.findByFullName(fullName);
    }

    public String updateLandlord(int id, Landlord landlord){
        Landlord existinglandlord = landlordsRepository.findById(id).orElse(null);

        if(ObjectUtils.isEmpty(existinglandlord)){
            return "Landlord Does not Exist";
        }else{
            existinglandlord.setEmail(landlord.getEmail());
            existinglandlord.setFullName(landlord.getFullName());
            existinglandlord.setPhoneNumber(landlord.getPhoneNumber());

            landlordsRepository.save(existinglandlord);
            return "Landlord Details Updated";
        }
    }

    public String deleteLandlord(int id){
        Landlord existinglandlord = landlordsRepository.findById(id).orElse(null);

        if(ObjectUtils.isEmpty(existinglandlord)){
            return "Landlord Does Not Exist";
        }else{
            landlordsRepository.deleteById(id);
            return "Deleted";
        }

    }



}
