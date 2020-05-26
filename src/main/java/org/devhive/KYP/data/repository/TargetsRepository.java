package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Targets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetsRepository extends CrudRepository<Targets, Long> {
}
