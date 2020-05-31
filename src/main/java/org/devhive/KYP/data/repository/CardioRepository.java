package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Age;
import org.devhive.KYP.data.entity.Cardio;
import org.devhive.KYP.data.entity.Sex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardioRepository extends CrudRepository<Cardio, Long> {
    Iterable<Cardio> findBySexAndAge(Sex sex, Age age);
}
