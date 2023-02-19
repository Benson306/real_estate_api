package com.example.real_estate_api.services;

import com.example.real_estate_api.models.Apartment;
import com.example.real_estate_api.repositories.ApartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class ApartmentsServices {
    @Autowired
    private ApartmentsRepository apartmentsRepository;

    public String addApartment(Apartment apartment){
        Apartment existing = apartmentsRepository.findByName(apartment.getName());

        if(ObjectUtils.isEmpty(existing)){
            apartmentsRepository.save(apartment);
            return "Apartment Added";
        }else{
            return "Apartment Exists";
        }
    }

    public List<Apartment> getApartments(){
        return apartmentsRepository.findAll();
    }

    public Apartment getSpecificApartment(String name) {
        return apartmentsRepository.findByName(name);
    }

    public String updateApartment(int id, Apartment apartment){
        Apartment existing = apartmentsRepository.findById(id).orElse(null);
        if(ObjectUtils.isEmpty(existing)){
            return "Apartment Does Not Exist";
        }else{
            existing.setName(apartment.getName());
            existing.setLocation(apartment.getLocation());
            existing.setLandlordId(apartment.getLandlordId());

            apartmentsRepository.save(existing);
            return "Apartment Updated";
        }


    }

    public String deleteApartment(int id){
        Apartment existing = apartmentsRepository.findById(id).orElse(null);
        if(ObjectUtils.isEmpty(existing)){
            return "Apartment Does Not Exist";
        }else{
            apartmentsRepository.deleteById(id);
            return "Apartment Deleted";
        }
    }
}
