package org.devhive.KYP.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "AGE")
public class Age {
    @Id
    @Column(name = "AGE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ageId;

    @Column(name="MIN_AGE")
    private String minAge;

    @Column(name="MAX_AGE")
    private String maxAge;

    public Age(String minAge, String maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public Age() {

    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }
}
