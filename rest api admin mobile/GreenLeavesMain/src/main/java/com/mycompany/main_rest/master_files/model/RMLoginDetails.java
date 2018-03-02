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
@Table(name = "m_login_details")
public class RMLoginDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;
    
    @Column(name = "lgno")
    private Integer lgno;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "active")
    private String active;
    
    @Column(name = "default_route")
    private Integer defaultRoute;
    
    @Column(name = "default_vehicle")
    private Integer defaultVehicle;
    
    @Column(name = "firewood_serial")
    private int firewoodSerial;
    
    @Column(name = "green_leaves_serial")
    private int greenLeavesSerial;
    
    @Column(name = "advance_serial")
    private int advanceSerial;
    
    @Column(name = "fertilizer_serial")
    private int fertilizerSerial;
    
    @Column(name = "loan_serial")
    private int loanSerial;
    
    @Column(name = "branch")
    private Integer branch;

    public RMLoginDetails() {
    }

    public RMLoginDetails(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public RMLoginDetails(Integer indexNo, String name, String userName, String password, int firewoodSerial, int greenLeavesSerial, int advanceSerial, int fertilizerSerial, int loanSerial) {
        this.indexNo = indexNo;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.firewoodSerial = firewoodSerial;
        this.greenLeavesSerial = greenLeavesSerial;
        this.advanceSerial = advanceSerial;
        this.fertilizerSerial = fertilizerSerial;
        this.loanSerial = loanSerial;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getLgno() {
        return lgno;
    }

    public void setLgno(Integer lgno) {
        this.lgno = lgno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Integer getDefaultRoute() {
        return defaultRoute;
    }

    public void setDefaultRoute(Integer defaultRoute) {
        this.defaultRoute = defaultRoute;
    }

    public Integer getDefaultVehicle() {
        return defaultVehicle;
    }

    public void setDefaultVehicle(Integer defaultVehicle) {
        this.defaultVehicle = defaultVehicle;
    }

    public int getFirewoodSerial() {
        return firewoodSerial;
    }

    public void setFirewoodSerial(int firewoodSerial) {
        this.firewoodSerial = firewoodSerial;
    }

    public int getGreenLeavesSerial() {
        return greenLeavesSerial;
    }

    public void setGreenLeavesSerial(int greenLeavesSerial) {
        this.greenLeavesSerial = greenLeavesSerial;
    }

    public int getAdvanceSerial() {
        return advanceSerial;
    }

    public void setAdvanceSerial(int advanceSerial) {
        this.advanceSerial = advanceSerial;
    }

    public int getFertilizerSerial() {
        return fertilizerSerial;
    }

    public void setFertilizerSerial(int fertilizerSerial) {
        this.fertilizerSerial = fertilizerSerial;
    }

    public int getLoanSerial() {
        return loanSerial;
    }

    public void setLoanSerial(int loanSerial) {
        this.loanSerial = loanSerial;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "RMLoginDetails{" + "indexNo=" + indexNo + ", lgno=" + lgno + ", name=" + name + ", userName=" + userName + ", password=" + password + ", active=" + active + ", defaultRoute=" + defaultRoute + ", defaultVehicle=" + defaultVehicle + ", firewoodSerial=" + firewoodSerial + ", greenLeavesSerial=" + greenLeavesSerial + ", advanceSerial=" + advanceSerial + ", fertilizerSerial=" + fertilizerSerial + ", loanSerial=" + loanSerial + ", branch=" + branch + '}';
    }

}
