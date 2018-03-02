/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kavish manjitha
 */
@Entity
@Table(name = "m_firewood_unlord_point")
public class MFireWoodUnlordPoint implements Serializable {

    @Id
    @Column(name = "fwupno")
    private String fwupno;

    @Column(name = "name")
    private String name;

    public MFireWoodUnlordPoint() {
    }

    public String getFwupno() {
        return fwupno;
    }

    public void setFwupno(String fwupno) {
        this.fwupno = fwupno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MFireWoodUnlordPoint{" + "fwupno=" + fwupno + ", name=" + name + '}';
    }

}
