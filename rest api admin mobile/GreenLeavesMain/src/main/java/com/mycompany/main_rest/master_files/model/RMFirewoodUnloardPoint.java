/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.model;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "m_firewood_unloard_point")
public class RMFirewoodUnloardPoint implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;
    
    @Column(name = "fwupno")
    private String fwupno;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "branch")
    private Integer branch;

    public RMFirewoodUnloardPoint() {
    }

    public RMFirewoodUnloardPoint(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public RMFirewoodUnloardPoint(Integer indexNo, String fwupno, String name) {
        this.indexNo = indexNo;
        this.fwupno = fwupno;
        this.name = name;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
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

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "RMFirewoodUnloardPoint{" + "indexNo=" + indexNo + ", fwupno=" + fwupno + ", name=" + name + ", branch=" + branch + '}';
    }
    
}
