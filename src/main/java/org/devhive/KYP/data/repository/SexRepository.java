package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Sex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexRepository extends CrudRepository<Sex, Long> {
}
