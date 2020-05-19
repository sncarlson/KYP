package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Cardio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardioRepository extends CrudRepository<Cardio, Long> {

}
