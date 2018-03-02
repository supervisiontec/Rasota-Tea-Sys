package com.mycompany.main_rest.transaction.request_model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kavish manjitha on 11/23/2017.
 */

public class RestTGreenLeavesWeigh implements Serializable{

    private RETGreenLeavesWeigh RETGreenLeavesWeigh;
    private List<RestTGreenLeavesWeighDetails> restTGreenLeavesWeighDetails;

    public RestTGreenLeavesWeigh() {
    }

    public RETGreenLeavesWeigh gettGreenLeavesWeigh() {
        return RETGreenLeavesWeigh;
    }

    public void settGreenLeavesWeigh(RETGreenLeavesWeigh RETGreenLeavesWeigh) {
        this.RETGreenLeavesWeigh = RETGreenLeavesWeigh;
    }

    public List<RestTGreenLeavesWeighDetails> getRestTGreenLeavesWeighDetails() {
        return restTGreenLeavesWeighDetails;
    }

    public void setRestTGreenLeavesWeighDetails(List<RestTGreenLeavesWeighDetails> restTGreenLeavesWeighDetails) {
        this.restTGreenLeavesWeighDetails = restTGreenLeavesWeighDetails;
    }

    @Override
    public String toString() {
        return "RestTGreenLeavesWeigh{" +
                "RETGreenLeavesWeigh=" + RETGreenLeavesWeigh +
                ", restTGreenLeavesWeighDetails=" + restTGreenLeavesWeighDetails +
                '}';
    }
}
