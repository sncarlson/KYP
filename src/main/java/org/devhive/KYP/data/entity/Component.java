package org.devhive.KYP.data.entity;

import javax.persistence.*;

@Entity
@Table(name="COMPONENT")
public class Component {
    @Id
    @Column(name="COMPONENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long componentId;

    @Column(name="COMPONENT_TYPE")
    private String componentType;

    public Component(String componentType) {
        this.componentType = componentType;
    }

    public Component() {

    }

    public long getComponentId() {
        return componentId;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }
}


