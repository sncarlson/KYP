package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Age;
import org.devhive.KYP.data.entity.Component;
import org.devhive.KYP.data.entity.Sex;
import org.devhive.KYP.data.entity.Targets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetsRepository extends CrudRepository<Targets, Long> {
    Targets findByComponentAndAgeAndSex(Component component, Age age, Sex sex);
}
