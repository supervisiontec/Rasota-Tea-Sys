package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by kavish manjitha on 11/13/2017.
 * `index_no` INTEGER PRIMARY KEY AUTOINCREMENT,
 * `t_green_leaves_weigh` INTEGER NOT NULL,
 * `bag_no` INTEGER NOT NULL,
 * `green_leaves_type` TEXT NOT NULL
 */

public class TGreenLeavesWeighDetails implements Serializable {

    private Integer indexNo;
    private Integer tGreenLeavesWeigh;
    private BigDecimal quantity;
    private Integer bagCount;

    public TGreenLeavesWeighDetails() {
    }

    public TGreenLeavesWeighDetails(BigDecimal quantity, Integer bagCount) {
        this.quantity = quantity;
        this.bagCount = bagCount;
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

    @Override
    public String toString() {
        return "TGreenLeavesWeighDetails{" +
                "indexNo=" + indexNo +
                ", tGreenLeavesWeigh=" + tGreenLeavesWeigh +
                ", quantity=" + quantity +
                ", bagCount='" + bagCount + '\'' +
                '}';
    }
}
