package org.devhive.KYP.service;

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


}
