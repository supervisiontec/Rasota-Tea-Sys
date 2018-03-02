package com.mycompany.main_rest.transaction.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kavish manjitha on 11/13/2017. `index_no` INTEGER PRIMARY KEY
 * AUTOINCREMENT, `t_green_leaves_weigh` INTEGER NOT NULL, `bag_no` INTEGER NOT
 * NULL, `green_leaves_type` TEXT NOT NULL
 */
@Entity
@Table(name = "t_green_leaves_weigh_detail")
public class TGreenLeavesWeighDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;
    @Column(name = "t_green_leaves_weigh")
    private Integer tGreenLeavesWeigh;
    @Column(name = "quantity")
    private BigDecimal quantity;
    @Column(name = "bag_count")
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
        return "TGreenLeavesWeighDetails{"
                + "indexNo=" + indexNo
                + ", tGreenLeavesWeigh=" + tGreenLeavesWeigh
                + ", quantity=" + quantity
                + ", bagCount='" + bagCount + '\''
                + '}';
    }
}
