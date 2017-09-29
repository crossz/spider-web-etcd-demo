package com.spider.db.entity;

// default package
// Generated 2015-8-19 17:34:09 by Hibernate Tools 4.3.1

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * GamingCompany generated by hbm2java
 */
@Entity
@Table(name = "gaming_company_config")
public class GamingCompanyConfig implements java.io.Serializable {

    private static final long serialVersionUID = -8356545349889487013L;

    private Integer id;

    private String companyName;

    private int win310Id;

    private int weight;

    private int isAlways;

    @Column(name = "IS_ALWAYS", nullable = false)
    public int getIsAlways() {

        return isAlways;
    }

    public void setIsAlways(int isAlways) {

        this.isAlways = isAlways;
    }

    public GamingCompanyConfig() {

    }

    public GamingCompanyConfig(String companyName, int win310Id, int weight) {

        this.companyName = companyName;
        this.win310Id = win310Id;
        this.weight = weight;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {

        return this.id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    @Column(name = "COMPANY_NAME", nullable = false, length = 30)
    public String getCompanyName() {

        return this.companyName;
    }

    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    @Column(name = "WIN310_ID", nullable = false)
    public int getWin310Id() {

        return this.win310Id;
    }

    public void setWin310Id(int win310Id) {

        this.win310Id = win310Id;
    }

    @Column(name = "WEIGHT", nullable = false)
    public int getWeight() {

        return this.weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

}
