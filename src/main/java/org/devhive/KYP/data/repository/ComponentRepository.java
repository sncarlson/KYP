package org.devhive.KYP.data.repository;

import org.devhive.KYP.data.entity.Component;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends CrudRepository<Component, Long> {
}
