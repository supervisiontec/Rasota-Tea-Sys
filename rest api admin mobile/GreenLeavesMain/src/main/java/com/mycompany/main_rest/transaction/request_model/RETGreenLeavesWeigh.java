package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RETGreenLeavesWeigh implements Serializable {

    private Integer indexNo;
    private String lgNo;
    private String supNo;
    private String rNo;
    private Integer branch;
    private Integer tempSupplier;
    private String serial;
    private Date date;
    private BigDecimal totalWeight = BigDecimal.ZERO.ZERO;
    private BigDecimal tareCalculated = BigDecimal.ZERO.ZERO;
    private BigDecimal tareDeduction = BigDecimal.ZERO.ZERO;
    private BigDecimal generalDeductionPercent = BigDecimal.ZERO.ZERO;
    private BigDecimal generalDeduction = BigDecimal.ZERO.ZERO;
    private BigDecimal waterDeduction = BigDecimal.ZERO.ZERO;
    private BigDecimal coarseLeaves = BigDecimal.ZERO.ZERO;
    private BigDecimal boiledLeaves = BigDecimal.ZERO.ZERO;
    private BigDecimal netWeight = BigDecimal.ZERO.ZERO;
    private Integer totalBagCount = 0;
    private String greenLeavesType;
    private String status = "PENDING";
    private Integer isSync;

    public RETGreenLeavesWeigh() {
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getLgNo() {
        return lgNo;
    }

    public void setLgNo(String lgNo) {
        this.lgNo = lgNo;
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

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getTempSupplier() {
        return tempSupplier;
    }

    public void setTempSupplier(Integer tempSupplier) {
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

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "RETGreenLeavesWeigh{" +
                "indexNo=" + indexNo +
                ", lgNo='" + lgNo + '\'' +
                ", supNo='" + supNo + '\'' +
                ", rNo='" + rNo + '\'' +
                ", branch=" + branch +
                ", tempSupplier=" + tempSupplier +
                ", date=" + date +
                ", totalWeight=" + totalWeight +
                ", tareCalculated=" + tareCalculated +
                ", tareDeduction=" + tareDeduction +
                ", generalDeductionPercent=" + generalDeductionPercent +
                ", generalDeduction=" + generalDeduction +
                ", waterDeduction=" + waterDeduction +
                ", coarseLeaves=" + coarseLeaves +
                ", boiledLeaves=" + boiledLeaves +
                ", netWeight=" + netWeight +
                ", totalBagCount=" + totalBagCount +
                ", greenLeavesType='" + greenLeavesType + '\'' +
                ", status='" + status + '\'' +
                ", isSync=" + isSync +
                '}';
    }
}
