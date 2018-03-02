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
@Table(name = "m_suplier")
public class RMSuplier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;
    
    @Column(name = "supno")
    private String supno;
    
    @Column(name = "supname")
    private String supname;
    
    @Column(name = "mobno")
    private String mobno;
    
    @Column(name = "branch")
    private Integer branch;
    
    @Column(name = "route")
    private Integer route;


    public RMSuplier() {
    }

    public RMSuplier(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public RMSuplier(Integer indexNo, String supno) {
        this.indexNo = indexNo;
        this.supno = supno;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getSupno() {
        return supno;
    }

    public void setSupno(String supno) {
        this.supno = supno;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "RMSuplier{" + "indexNo=" + indexNo + ", supno=" + supno + ", supname=" + supname + ", mobno=" + mobno + ", branch=" + branch + ", route=" + route + '}';
    }
   
    
}
