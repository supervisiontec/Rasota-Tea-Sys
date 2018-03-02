/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kavish manjitha
 */
@Entity
@Table(name = "glsuplist")
public class MSupplier implements Serializable {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supno")
    private String supNo;

    @Column(name = "rno")
    private String rNo;

    @Column(name = "supname")
    private String supName;

    @Column(name = "mobno")
    private String mobNo;

    public MSupplier() {
    }

    public String getSupNo() {
        return supNo;
    }

    public void setSupNo(String supNo) {
        this.supNo = supNo;
    }

    public String getrNo() {
        return rNo;
    }

    public void setrNo(String rNo) {
        this.rNo = rNo;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "MSupplier{" + "supNo=" + supNo + ", rNo=" + rNo + ", supName=" + supName + ", mobNo=" + mobNo + '}';
    }

}
