/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kavish manjitha
 */
@Entity
@Table(name = "m_firewood_type")
public class MFireWoodType implements Serializable {

    @Id
    @Column(name = "fwtno")
    private String fwtno;

    @Column(name = "name")
    private String name;

    @Column(name = "rate")
    private BigDecimal rate;

    public MFireWoodType() {
    }

    public String getFwtno() {
        return fwtno;
    }

    public void setFwtno(String fwtno) {
        this.fwtno = fwtno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "MFireWoodType{" + "fwtno=" + fwtno + ", name=" + name + ", rate=" + rate + '}';
    }
    
}
