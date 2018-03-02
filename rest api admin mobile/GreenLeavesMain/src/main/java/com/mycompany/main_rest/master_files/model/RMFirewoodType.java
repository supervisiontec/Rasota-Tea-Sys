/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "m_firewood_type")
public class RMFirewoodType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;
    
    @Column(name = "fwtno")
    private String fwtno;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "rate")
    private BigDecimal rate;
    
    @Column(name = "branch")
    private Integer branch;

    public RMFirewoodType() {
    }

    public RMFirewoodType(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public RMFirewoodType(Integer indexNo, String fwtno, String name, BigDecimal rate) {
        this.indexNo = indexNo;
        this.fwtno = fwtno;
        this.name = name;
        this.rate = rate;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
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

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "RMFirewoodType{" + "indexNo=" + indexNo + ", fwtno=" + fwtno + ", name=" + name + ", rate=" + rate + ", branch=" + branch + '}';
    }
    
}
