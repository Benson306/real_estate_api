package com.example.real_estate_api.services;

import com.example.real_estate_api.models.Tenant;
import com.example.real_estate_api.repositories.TenantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class TenantsServices {
    @Autowired
    private TenantsRepository tenantsRepository;

    public String addTenant(Tenant tenant){

        Tenant existing = tenantsRepository.findByFullName(tenant.getFullName());

        if(ObjectUtils.isEmpty(existing)) {
            tenantsRepository.save(tenant);
            return "Tenant Added";
        }else{
            return "Tenant Exists";
        }
    }

    public List<Tenant> getTenantsByApartment(int id){
        return tenantsRepository.findByApartmentId(id);
    }

    public String updateTenant(int id,Tenant tenant){
        Tenant existing = tenantsRepository.findById(id).orElse(null);

        if(!ObjectUtils.isEmpty(existing)) {
            existing.setFullName(tenant.getFullName());
            existing.setEmail(tenant.getEmail());
            existing.setPhoneNumber(tenant.getPhoneNumber());
            existing.setHouseNumberId(tenant.getHouseNumberId());
            existing.setApartmentId(tenant.getApartmentId());
            existing.setStatus(tenant.getStatus());

            tenantsRepository.save(existing);
            return "Tenant Updated";
        }else{
            return "Tenant Does Not Exist";
        }
    }

    public String deleteTenant(int id){
        Tenant existing = tenantsRepository.findById(id).orElse(null);

        if(!ObjectUtils.isEmpty(existing)) {
            tenantsRepository.deleteById(id);
            return "Tenant Deleted";
        }else{
            return "Tenant Does Not Exist";
        }
    }
}
