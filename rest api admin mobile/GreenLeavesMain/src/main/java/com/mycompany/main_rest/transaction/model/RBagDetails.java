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
 * Created by kavish manjitha on 11/14/2017.
 */
@Entity
@Table(name = "r_bag_details")
public class RBagDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "t_green_leaves_weigh_detail")
    private Integer tGreenLeavesWeighDetails;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "bag_no")
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
        return "RBagDetails{"
                + "indexNo=" + indexNo
                + ", tGreenLeavesWeighDetails=" + tGreenLeavesWeighDetails
                + ", quantity=" + quantity
                + ", bagNo='" + bagNo + '\''
                + '}';
    }
}
