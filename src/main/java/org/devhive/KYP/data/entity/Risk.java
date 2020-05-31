package org.devhive.KYP.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "RISK")
public class Risk {
    @Id
    @Column(name="RISK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long riskId;

    @Column(name="RISK_TYPE")
    private String riskType;

    public Risk(String riskType) {
        this.riskType = riskType;
    }

    public Risk() {

    }

    public long getRiskId() {
        return riskId;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }
}
