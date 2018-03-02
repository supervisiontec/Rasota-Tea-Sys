package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by kavish manjitha on 11/14/2017.
 */

public class RBagDetails implements Serializable {

    private Integer indexNo;
    private Integer tGreenLeavesWeighDetails;
    private BigDecimal quantity;
    private String bagNo;

    public RBagDetails() {
    }

    public RBagDetails(String bagNo) {
        this.bagNo = bagNo;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer gettGreenLeavesWeighDetails() {
        return tGreenLeavesWeighDetails;
    }

    public void settGreenLeavesWeighDetails(Integer tGreenLeavesWeighDetails) {
        this.tGreenLeavesWeighDetails = tGreenLeavesWeighDetails;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getBagNo() {
        return bagNo;
    }

    public void setBagNo(String bagNo) {
        this.bagNo = bagNo;
    }

    @Override
    public String toString() {
        return "RBagDetails{" +
                "indexNo=" + indexNo +
                ", tGreenLeavesWeighDetails=" + tGreenLeavesWeighDetails +
                ", quantity=" + quantity +
                ", bagNo='" + bagNo + '\'' +
                '}';
    }
}
