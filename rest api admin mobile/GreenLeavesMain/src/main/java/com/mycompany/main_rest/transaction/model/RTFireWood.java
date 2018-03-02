/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kavish manjitha
 */
@Entity
@Table(name = "t_fire_wood")
public class RTFireWood implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "lenght")
    private BigDecimal lenght;

    @Column(name = "width")
    private BigDecimal width;

    @Column(name = "height")
    private BigDecimal height;

    @Column(name = "qty")
    private BigDecimal qty;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "branch")
    private Integer branch;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "login_user")
    private Integer loginUser;

    @Column(name = "firewood_type")
    private Integer firewoodType;

    @Column(name = "firewood_unloard_point")
    private Integer firewoodUnloardPoint;

    @Column(name = "serial")
    private String serial;

    public RTFireWood() {
    }

    public RTFireWood(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getLenght() {
        return lenght;
    }

    public void setLenght(BigDecimal lenght) {
        this.lenght = lenght;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Integer loginUser) {
        this.loginUser = loginUser;
    }

    public Integer getFirewoodType() {
        return firewoodType;
    }

    public void setFirewoodType(Integer firewoodType) {
        this.firewoodType = firewoodType;
    }

    public Integer getFirewoodUnloardPoint() {
        return firewoodUnloardPoint;
    }

    public void setFirewoodUnloardPoint(Integer firewoodUnloardPoint) {
        this.firewoodUnloardPoint = firewoodUnloardPoint;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    
    @Override
    public String toString() {
        return "RTFireWood{" + "indexNo=" + indexNo + ", date=" + date + ", lenght=" + lenght + ", width=" + width + ", height=" + height + ", qty=" + qty + ", rate=" + rate + ", amount=" + amount + ", branch=" + branch + ", supplier=" + supplier + ", loginUser=" + loginUser + ", firewoodType=" + firewoodType + ", firewoodUnloardPoint=" + firewoodUnloardPoint + ", serial=" + serial + '}';
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}
