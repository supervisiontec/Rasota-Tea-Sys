package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kavish manjitha on 11/23/2017.
 */

public class RestTGreenLeavesWeighDetails implements Serializable {

    private Integer indexNo;
    private Integer tGreenLeavesWeigh;
    private BigDecimal quantity;
    private Integer bagCount;
    private List<RBagDetails> rBagDetailsList;

    public RestTGreenLeavesWeighDetails() {
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer gettGreenLeavesWeigh() {
        return tGreenLeavesWeigh;
    }

    public void settGreenLeavesWeigh(Integer tGreenLeavesWeigh) {
        this.tGreenLeavesWeigh = tGreenLeavesWeigh;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Integer getBagCount() {
        return bagCount;
    }

    public void setBagCount(Integer bagCount) {
        this.bagCount = bagCount;
    }

    public List<RBagDetails> getrBagDetailsList() {
        return rBagDetailsList;
    }

    public void setrBagDetailsList(List<RBagDetails> rBagDetailsList) {
        this.rBagDetailsList = rBagDetailsList;
    }

    @Override
    public String toString() {
        return "RestTGreenLeavesWeighDetails{" +
                "indexNo=" + indexNo +
                ", tGreenLeavesWeigh=" + tGreenLeavesWeigh +
                ", quantity=" + quantity +
                ", bagCount=" + bagCount +
                ", rBagDetailsList=" + rBagDetailsList +
                '}';
    }
}
