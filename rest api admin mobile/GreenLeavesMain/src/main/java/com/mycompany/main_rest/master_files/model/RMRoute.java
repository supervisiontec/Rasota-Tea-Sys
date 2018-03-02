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
@Table(name = "m_route")
public class RMRoute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "rname")
    private String rname;

    @Column(name = "branch")
    private Integer branch;
    
    @Column(name = "rno")
    private String rno;

    public RMRoute() {
    }

    public RMRoute(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public RMRoute(Integer indexNo, String rname) {
        this.indexNo = indexNo;
        this.rname = rname;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    @Override
    public String toString() {
        return "RMRoute{" + "indexNo=" + indexNo + ", rname=" + rname + ", branch=" + branch + ", rno=" + rno + '}';
    }

}
