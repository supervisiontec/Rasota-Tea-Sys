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

@Entity
@Table(name = "t_green_leaves_weigh")
public class TGreenLeavesWeigh implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "route")
    private Integer route;

    @Column(name = "branch")
    private Integer branch;

    @Column(name = "supplier")
    private Integer supplier;

    @Column(name = "login_user")
    private Integer loginUser;

    @Column(name = "temp_supplier_remark")
    private String tempSupplier;

    @Column(name = "date")
    private Date date;

    @Column(name = "total_weight")
    private BigDecimal totalWeight;

    @Column(name = "tare_calculated")
    private BigDecimal tareCalculated;

    @Column(name = "tare_deduction")
    private BigDecimal tareDeduction;

    @Column(name = "general_deduction_percent")
    private BigDecimal generalDeductionPercent;

    @Column(name = "general_deduction")
    private BigDecimal generalDeduction;

    @Column(name = "water_deduction")
    private BigDecimal waterDeduction;

    @Column(name = "coarse_leaves")
    private BigDecimal coarseLeaves;

    @Column(name = "boiled_leaves")
    private BigDecimal boiledLeaves;

    @Column(name = "net_weight")
    private BigDecimal netWeight;

    @Column(name = "total_bag_count")
    private Integer totalBagCount = 0;

    @Column(name = "green_leaves_type")
    private String greenLeavesType;

    @Column(name = "status")
    private String status = "PENDING";

    @Column(name = "serial")
    private String serial;

    public TGreenLeavesWeigh() {
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Integer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Integer loginUser) {
        this.loginUser = loginUser;
    }

    public String getTempSupplier() {
        return tempSupplier;
    }

    public void setTempSupplier(String tempSupplier) {
        this.tempSupplier = tempSupplier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getTareCalculated() {
        return tareCalculated;
    }

    public void setTareCalculated(BigDecimal tareCalculated) {
        this.tareCalculated = tareCalculated;
    }

    public BigDecimal getTareDeduction() {
        return tareDeduction;
    }

    public void setTareDeduction(BigDecimal tareDeduction) {
        this.tareDeduction = tareDeduction;
    }

    public BigDecimal getGeneralDeductionPercent() {
        return generalDeductionPercent;
    }

    public void setGeneralDeductionPercent(BigDecimal generalDeductionPercent) {
        this.generalDeductionPercent = generalDeductionPercent;
    }

    public BigDecimal getGeneralDeduction() {
        return generalDeduction;
    }

    public void setGeneralDeduction(BigDecimal generalDeduction) {
        this.generalDeduction = generalDeduction;
    }

    public BigDecimal getWaterDeduction() {
        return waterDeduction;
    }

    public void setWaterDeduction(BigDecimal waterDeduction) {
        this.waterDeduction = waterDeduction;
    }

    public BigDecimal getCoarseLeaves() {
        return coarseLeaves;
    }

    public void setCoarseLeaves(BigDecimal coarseLeaves) {
        this.coarseLeaves = coarseLeaves;
    }

    public BigDecimal getBoiledLeaves() {
        return boiledLeaves;
    }

    public void setBoiledLeaves(BigDecimal boiledLeaves) {
        this.boiledLeaves = boiledLeaves;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public Integer getTotalBagCount() {
        return totalBagCount;
    }

    public void setTotalBagCount(Integer totalBagCount) {
        this.totalBagCount = totalBagCount;
    }

    public String getGreenLeavesType() {
        return greenLeavesType;
    }

    public void setGreenLeavesType(String greenLeavesType) {
        this.greenLeavesType = greenLeavesType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "TGreenLeavesWeigh{" + "indexNo=" + indexNo + ", route=" + route + ", branch=" + branch + ", supplier=" + supplier + ", loginUser=" + loginUser + ", tempSupplier=" + tempSupplier + ", date=" + date + ", totalWeight=" + totalWeight + ", tareCalculated=" + tareCalculated + ", tareDeduction=" + tareDeduction + ", generalDeductionPercent=" + generalDeductionPercent + ", generalDeduction=" + generalDeduction + ", waterDeduction=" + waterDeduction + ", coarseLeaves=" + coarseLeaves + ", boiledLeaves=" + boiledLeaves + ", netWeight=" + netWeight + ", totalBagCount=" + totalBagCount + ", greenLeavesType=" + greenLeavesType + ", status=" + status + ", serial=" + serial + '}';
    }

}
