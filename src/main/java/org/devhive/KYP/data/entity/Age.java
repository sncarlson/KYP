package org.devhive.KYP.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "AGE")
public class Age {
    @Id
    @Column(name = "AGE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ageId;

    @Column(name="AGE_RANGE")
    private String ageRange;

     public Age(String ageRange) {
        this.ageRange = ageRange;
    }

    public Age() {

    }

    public long getAgeId() {
        return ageId;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

}
