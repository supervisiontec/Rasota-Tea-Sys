/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;

/**
 *
 * @author kavish manjitha
 */
public class REMLoginSerial implements Serializable {

    private Integer lgno;
    private Integer branch;
    private Integer firewoodSerial;
    private Integer greenLeavesSerial;
    private Integer advanceSerial;
    private Integer fertilizerSerial;
    private Integer loanSerial;

    public REMLoginSerial() {
    }

    public Integer getLgno() {
        return lgno;
    }

    public void setLgno(Integer lgno) {
        this.lgno = lgno;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getFirewoodSerial() {
        return firewoodSerial;
    }

    public void setFirewoodSerial(Integer firewoodSerial) {
        this.firewoodSerial = firewoodSerial;
    }

    public Integer getGreenLeavesSerial() {
        return greenLeavesSerial;
    }

    public void setGreenLeavesSerial(Integer greenLeavesSerial) {
        this.greenLeavesSerial = greenLeavesSerial;
    }

    public Integer getAdvanceSerial() {
        return advanceSerial;
    }

    public void setAdvanceSerial(Integer advanceSerial) {
        this.advanceSerial = advanceSerial;
    }

    public Integer getFertilizerSerial() {
        return fertilizerSerial;
    }

    public void setFertilizerSerial(Integer fertilizerSerial) {
        this.fertilizerSerial = fertilizerSerial;
    }

    public Integer getLoanSerial() {
        return loanSerial;
    }

    public void setLoanSerial(Integer loanSerial) {
        this.loanSerial = loanSerial;
    }

    @Override
    public String toString() {
        return "REMLoginSerial{" + "lgno=" + lgno + ", branch=" + branch + ", firewoodSerial=" + firewoodSerial + ", greenLeavesSerial=" + greenLeavesSerial + ", advanceSerial=" + advanceSerial + ", fertilizerSerial=" + fertilizerSerial + ", loanSerial=" + loanSerial + '}';
    }
   
}
