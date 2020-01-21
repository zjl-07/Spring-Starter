package com.emilda.javasprintstarter.corporate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CorporateService {

    @Autowired
    private CorporateRepository corporateRepository;

    public CorporateService(CorporateRepository corporateRepository) {
        this.corporateRepository = corporateRepository;
    }

    public List<Corporate> getAllCorporates(){
        List<Corporate> corporates = new ArrayList<>();
        corporateRepository.findAll().forEach(corporates::add);

        return corporates;
    }

    public Corporate getCorporate(Integer id) {
        return corporateRepository.findById(id).get();
    }

    public void addCorporate(Corporate corporate) {
        corporateRepository.save(corporate);
    }

    public void updateCorporate(Corporate corporate) {
        corporateRepository.save(corporate);
    }


    public void deleteCorporate(Integer id) {
        corporateRepository.deleteById(id);
    }
}
