package org.devhive.KYP.service;

import org.devhive.KYP.data.entity.Risk;
import org.devhive.KYP.data.repository.RiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskService {
    private final RiskRepository riskRepository;

    @Autowired
    RiskService(RiskRepository riskRepository) {
        this.riskRepository = riskRepository;
    }

    public Risk getRisk(String type) {
        return this.riskRepository.findByRiskType(type);
    }
}
