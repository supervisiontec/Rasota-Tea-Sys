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
@Table(name = "roots")
public class MRoute implements Serializable {

    @Id
    @Column(name = "rno")
    private String rNo;

    @Column(name = "rname")
    private String rname;

    public MRoute() {
    }

    public MRoute(String rNo, String rname) {
        this.rNo = rNo;
        this.rname = rname;
    }

    public String getrNo() {
        return rNo;
    }

    public void setrNo(String rNo) {
        this.rNo = rNo;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "MRoute{" + "rNo=" + rNo + ", rname=" + rname + '}';
    }
    
}
