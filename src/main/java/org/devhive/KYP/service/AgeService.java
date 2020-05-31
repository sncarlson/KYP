package org.devhive.KYP.service;

import org.devhive.KYP.data.entity.Age;
import org.devhive.KYP.data.repository.AgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgeService {
    private final AgeRepository ageRepository;

    @Autowired
    AgeService(AgeRepository ageRepository) {
        this.ageRepository = ageRepository;
    }

    public Age getAge(String range) {
        return this.ageRepository.findByAgeRange(range);
    }
}
