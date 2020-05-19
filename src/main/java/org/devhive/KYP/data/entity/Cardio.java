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

    @Column(name = "SEX_ID")
    private long sexId;

    @Column(name = "RISK_ID")
    private long riskId;

    @Column(name = "AGE_ID")
    private long ageId;

    @Column(name = "TARGET_ID")
    private long targetId;

    public long getCardioId() {
        return cardioId;
    }

    public void setCardioId(long cardioId) {
        this.cardioId = cardioId;
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

    public long getSexId() {
        return sexId;
    }

    public void setSexId(long sexId) {
        this.sexId = sexId;
    }

    public long getRiskId() {
        return riskId;
    }

    public void setRiskId(long riskId) {
        this.riskId = riskId;
    }

    public long getAgeId() {
        return ageId;
    }

    public void setAgeId(long ageId) {
        this.ageId = ageId;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }
}
