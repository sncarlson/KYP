package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Risk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRepository extends CrudRepository<Risk, Long> {
}
