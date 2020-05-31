package org.devhive.KYP.service;

import org.devhive.KYP.data.entity.Sex;
import org.devhive.KYP.data.repository.SexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SexService {
    private final SexRepository sexRepository;

    @Autowired
    SexService(SexRepository sexRepository) {
        this.sexRepository = sexRepository;
    }

    public Sex getSex(String type) {
        Sex sex = sexRepository.findBySexType(type);
        return sex;
    }
}
