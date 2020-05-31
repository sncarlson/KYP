package org.devhive.KYP.service;

import org.devhive.KYP.data.entity.Age;
import org.devhive.KYP.data.entity.Component;
import org.devhive.KYP.data.entity.Sex;
import org.devhive.KYP.data.entity.Targets;
import org.devhive.KYP.data.repository.TargetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TargetsService {
    private final TargetsRepository targetsRepository;

    @Autowired
    TargetsService(TargetsRepository targetsRepository) {
        this.targetsRepository = targetsRepository;
    }

    public Targets getTargets(Component component, Age age, Sex sex) {
        return this.targetsRepository.findByComponentAndAgeAndSex(component, age, sex);
    }

}
