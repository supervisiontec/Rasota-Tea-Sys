/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.service;

import com.mycompany.main_rest.master_files.model.RMLoginDetails;
import com.mycompany.main_rest.master_files.repository.RMLoginDetailsRepository;
import com.mycompany.main_rest.transaction.request_model.REMLoginSerial;
import com.mycompany.main_rest.zexception.EntityNotFoundException;
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
public class RTCommonService {

    @Autowired
    private RMLoginDetailsRepository rMLoginDetailsRepository;

    public Integer updateSerialNumber(REMLoginSerial fireWood) {

        List<RMLoginDetails> findByBranchAndLgno = rMLoginDetailsRepository.findByBranchAndLgno(fireWood.getBranch(), fireWood.getLgno());
        if (findByBranchAndLgno.isEmpty()) {
            throw new EntityNotFoundException("login detail not found");
        }
        RMLoginDetails loginDetails = findByBranchAndLgno.get(0);
        loginDetails.setFirewoodSerial(fireWood.getFirewoodSerial());
        loginDetails.setGreenLeavesSerial(fireWood.getGreenLeavesSerial());
        loginDetails.setAdvanceSerial(fireWood.getAdvanceSerial());
        loginDetails.setFertilizerSerial(fireWood.getFertilizerSerial());
        loginDetails.setLoanSerial(fireWood.getLgno());
        return rMLoginDetailsRepository.save(loginDetails).getIndexNo();
    }

}
