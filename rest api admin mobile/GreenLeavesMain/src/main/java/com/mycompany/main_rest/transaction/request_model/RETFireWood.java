package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RETFireWood implements Serializable {

    private Integer indexNo;
    private Integer bNo;
    private String supplier;
    private String serial;
    private Integer lgNo;
    private String fwtNo;
    private String fwcpNo;
    private Date date;
    private BigDecimal lenght;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal qty;
    private BigDecimal rate;
    private BigDecimal amount;
    private Integer isSync;

    public RETFireWood() {
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getbNo() {
        return bNo;
    }

    public void setbNo(Integer bNo) {
        this.bNo = bNo;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getLgNo() {
        return lgNo;
    }

    public void setLgNo(Integer lgNo) {
        this.lgNo = lgNo;
    }

    public String getFwtNo() {
        return fwtNo;
    }

    public void setFwtNo(String fwtNo) {
        this.fwtNo = fwtNo;
    }

    public String getFwcpNo() {
        return fwcpNo;
    }

    public void setFwcpNo(String fwcpNo) {
        this.fwcpNo = fwcpNo;
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

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

}
