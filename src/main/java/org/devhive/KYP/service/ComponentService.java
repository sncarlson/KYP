package org.devhive.KYP.service;

import org.devhive.KYP.data.entity.Component;
import org.devhive.KYP.data.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentService {
    private final ComponentRepository componentRepository;

    @Autowired
    ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    public Component getComponent(String type) {
        return this.componentRepository.findByComponentType(type);
    }
}
