package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Age;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeRepository extends CrudRepository<Age, Long> {
    Age findByAgeRange(String range);
}
