/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.service;

import com.mycompany.main_rest.master_files.model.RMLoginDetails;
import com.mycompany.main_rest.master_files.model.RMRoute;
import com.mycompany.main_rest.master_files.model.RMSuplier;
import com.mycompany.main_rest.master_files.repository.RMLoginDetailsRepository;
import com.mycompany.main_rest.master_files.repository.RMRouteRepository;
import com.mycompany.main_rest.master_files.repository.RMSuplierRepository;
import com.mycompany.main_rest.transaction.model.TGreenLeavesWeigh;
import com.mycompany.main_rest.transaction.model.RBagDetails;
import com.mycompany.main_rest.transaction.model.TGreenLeavesWeighDetails;
import com.mycompany.main_rest.transaction.repository.RBagDetailsRepository;
import com.mycompany.main_rest.transaction.repository.TGreenLeavesWeighDetailsRepository;
import com.mycompany.main_rest.transaction.repository.TGreenLeavesWeighRepository;
import com.mycompany.main_rest.transaction.request_model.RestTGreenLeavesWeigh;
import com.mycompany.main_rest.transaction.request_model.RestTGreenLeavesWeighDetails;
import com.mycompany.main_rest.zexception.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kavish manjitha
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RTGreenLeavesService {

    @Autowired
    private RMRouteRepository rMRouteRepository;
    @Autowired
    private RMLoginDetailsRepository rMLoginDetailsRepository;
    @Autowired
    private RMSuplierRepository rMSuplierRepository;
    @Autowired
    private TGreenLeavesWeighRepository tGreenLeavesWeighRepository;
    @Autowired
    private TGreenLeavesWeighDetailsRepository tGreenLeavesWeighDetailsRepository;
    @Autowired
    private RBagDetailsRepository rBagDetailsRepository;

    public Integer insertTGreenLeaves(RestTGreenLeavesWeigh greenLeavesWeigh) {
        TGreenLeavesWeigh saveGreenLeaves = new TGreenLeavesWeigh();

        List<RMRoute> RMRouteList = rMRouteRepository.findByBranchAndRno(greenLeavesWeigh.gettGreenLeavesWeigh().getBranch(), greenLeavesWeigh.gettGreenLeavesWeigh().getrNo());
        if (RMRouteList.isEmpty()) {
            throw new EntityNotFoundException("route type not found");
        } else {
            saveGreenLeaves.setRoute(RMRouteList.get(0).getIndexNo());
        }

        List<RMSuplier> RMSupplierList = rMSuplierRepository.findByBranchAndSupno(greenLeavesWeigh.gettGreenLeavesWeigh().getBranch(), greenLeavesWeigh.gettGreenLeavesWeigh().getSupNo());
        if (RMSupplierList.isEmpty()) {
            throw new EntityNotFoundException("supplier type not found");
        } else {
            saveGreenLeaves.setSupplier(RMSupplierList.get(0).getIndexNo());
        }

        List<RMLoginDetails> RMLoginDetailsList = rMLoginDetailsRepository.findByBranchAndLgno(greenLeavesWeigh.gettGreenLeavesWeigh().getBranch(), Integer.parseInt(greenLeavesWeigh.gettGreenLeavesWeigh().getLgNo()));
        if (RMLoginDetailsList.isEmpty()) {
            throw new EntityNotFoundException("login user not found type not found");
        } else {
            saveGreenLeaves.setLoginUser(RMLoginDetailsList.get(0).getIndexNo());
        }
        saveGreenLeaves.setBranch(greenLeavesWeigh.gettGreenLeavesWeigh().getBranch());
        saveGreenLeaves.setTempSupplier(greenLeavesWeigh.gettGreenLeavesWeigh().getTempSupplier().toString());
        saveGreenLeaves.setDate(greenLeavesWeigh.gettGreenLeavesWeigh().getDate());
        saveGreenLeaves.setTotalWeight(greenLeavesWeigh.gettGreenLeavesWeigh().getTotalWeight());
        saveGreenLeaves.setTareCalculated(greenLeavesWeigh.gettGreenLeavesWeigh().getTareCalculated());
        saveGreenLeaves.setTareDeduction(greenLeavesWeigh.gettGreenLeavesWeigh().getTareDeduction());
        saveGreenLeaves.setGeneralDeductionPercent(greenLeavesWeigh.gettGreenLeavesWeigh().getGeneralDeductionPercent());
        saveGreenLeaves.setGeneralDeduction(greenLeavesWeigh.gettGreenLeavesWeigh().getGeneralDeduction());
        saveGreenLeaves.setWaterDeduction(greenLeavesWeigh.gettGreenLeavesWeigh().getWaterDeduction());
        saveGreenLeaves.setCoarseLeaves(greenLeavesWeigh.gettGreenLeavesWeigh().getCoarseLeaves());
        saveGreenLeaves.setBoiledLeaves(greenLeavesWeigh.gettGreenLeavesWeigh().getBoiledLeaves());
        saveGreenLeaves.setNetWeight(greenLeavesWeigh.gettGreenLeavesWeigh().getNetWeight());
        saveGreenLeaves.setStatus(greenLeavesWeigh.gettGreenLeavesWeigh().getStatus());
        saveGreenLeaves.setSerial(greenLeavesWeigh.gettGreenLeavesWeigh().getSerial());
        saveGreenLeaves.setGreenLeavesType(greenLeavesWeigh.gettGreenLeavesWeigh().getGreenLeavesType());
        saveGreenLeaves.setTotalBagCount(greenLeavesWeigh.gettGreenLeavesWeigh().getTotalBagCount());

        TGreenLeavesWeigh TGreenLeavesWeigh = tGreenLeavesWeighRepository.save(saveGreenLeaves);
        List<RestTGreenLeavesWeighDetails> restTGreenLeavesWeighDetails = greenLeavesWeigh.getRestTGreenLeavesWeighDetails();
        for (RestTGreenLeavesWeighDetails restTGreenLeavesWeighDetail : restTGreenLeavesWeighDetails) {
            TGreenLeavesWeighDetails greenLeavesWeighDetails = new TGreenLeavesWeighDetails();
            greenLeavesWeighDetails.setBagCount(restTGreenLeavesWeighDetail.getBagCount());
            greenLeavesWeighDetails.setQuantity(restTGreenLeavesWeighDetail.getQuantity());
            greenLeavesWeighDetails.settGreenLeavesWeigh(TGreenLeavesWeigh.getIndexNo());
            TGreenLeavesWeighDetails saveTgreenLeavesWeighDetails = tGreenLeavesWeighDetailsRepository.save(greenLeavesWeighDetails);

            List<com.mycompany.main_rest.transaction.request_model.RBagDetails> rBagDetailsList = restTGreenLeavesWeighDetail.getrBagDetailsList();
            for (com.mycompany.main_rest.transaction.request_model.RBagDetails rBagDetails1 : rBagDetailsList) {
                RBagDetails bagDetails = new RBagDetails();
                bagDetails.setBagNo(rBagDetails1.getBagNo());
                bagDetails.setQuantity(rBagDetails1.getQuantity());
                bagDetails.settGreenLeavesWeighDetails(saveTgreenLeavesWeighDetails.getIndexNo());
                rBagDetailsRepository.save(bagDetails);
            }
        }
        return greenLeavesWeigh.gettGreenLeavesWeigh().getIndexNo();
    }
}
