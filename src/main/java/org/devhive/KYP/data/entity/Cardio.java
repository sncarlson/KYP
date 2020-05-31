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

    @Column(name="TIME_RANGE")
    private String timeRange;

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


    public Cardio(String timeRange, String points, Sex sex, Risk risk, Age age, Targets target) {
        this.timeRange = timeRange;
        this.points = points;
        this.sex = sex;
        this.risk = risk;
        this.age = age;
        this.target = target;
    }

    public Cardio() {

    }

    public long getCardioId() {
        return cardioId;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
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
