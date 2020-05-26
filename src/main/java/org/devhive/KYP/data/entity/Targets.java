package org.devhive.KYP.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "TARGETS")
public class Targets {

    @Id
    @Column(name = "TARGET_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long targetId;

    @Column(name="MIN_VALUE")
    private String minValue;

    @Column(name="TARGET_VALUE")
    private String targetValue;

    @ManyToOne
    @JoinColumn(name = "COMPONENT_ID")
    private Component component;

    @ManyToOne
    @JoinColumn(name = "SEX_ID")
    private Sex sex;

    @ManyToOne
    @JoinColumn(name = "AGE_ID")
    private Age age;

    public Targets(String minValue, String targetValue, Component component, Sex sex, Age age) {
        this.minValue = minValue;
        this.targetValue = targetValue;
        this.component = component;
        this.sex = sex;
        this.age = age;
    }

    public Targets() {

    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }
}
