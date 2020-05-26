package org.devhive.KYP.data.entity;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;

import javax.persistence.*;

@Entity
@Table(name="CARDIO")
public class Cardio {
    @Id
    @Column(name="CARDIO_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cardioId;

    @Column(name="MIN_TIME")
    private String minTime;

    @Column(name = "MAX_TIME")
    private String maxTime;

    @Column(name = "POINTS")
    private String points;

    @ManyToOne
    @JoinColumn(name = "SEX_ID")
    private Sex sex;

    @ManyToOne
    @JoinColumn(name = "RISK_ID")
    private Risk risk;

    @ManyToOne
    @JoinColumn(name = "AGE_ID")
    private Age age;

    @ManyToOne
    @JoinColumn(name = "TARGET_ID")
    private Targets target;


    public Cardio(String minTime, String maxTime, String points, Sex sex, Risk risk, Age age, Targets target) {
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.points = points;
        this.sex = sex;
        this.risk = risk;
        this.age = age;
        this.target = target;
    }

    public Cardio() {

    }

    public String getMinTime() {
        return minTime;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Targets getTarget() {
        return target;
    }

    public void setTarget(Targets target) {
        this.target = target;
    }
}
