package org.devhive.KYP.data.entity;

import javax.persistence.*;

@Entity
@Table(name="SEX")
public class Sex {

    @Id
    @Column(name="SEX_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sexId;

    @Column(name="SEX_TYPE")
    private String sexType;

    public Sex(String sexType) {
        this.sexType = sexType;
    }

    public Sex() {

    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }
}
