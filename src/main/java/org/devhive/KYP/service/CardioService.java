package org.devhive.KYP.service;

import org.devhive.KYP.data.entity.Age;
import org.devhive.KYP.data.entity.Cardio;
import org.devhive.KYP.data.entity.Sex;
import org.devhive.KYP.data.repository.CardioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardioService {
    private final CardioRepository cardioRepository;

    @Autowired
    CardioService(CardioRepository cardioRepository) {
        this.cardioRepository = cardioRepository;
    }

    public Iterable<Cardio> getCardioScores(Sex sex, Age age) {
        return this.cardioRepository.findBySexAndAge(sex, age);
    }

}
