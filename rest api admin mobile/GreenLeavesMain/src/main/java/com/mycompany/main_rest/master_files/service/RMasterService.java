/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.service;

import com.mycompany.main_rest.master_files.model.RMBranch;
import com.mycompany.main_rest.master_files.model.RMFirewoodType;
import com.mycompany.main_rest.master_files.model.RMFirewoodUnloardPoint;
import com.mycompany.main_rest.master_files.model.RMLoginDetails;
import com.mycompany.main_rest.master_files.model.RMRoute;
import com.mycompany.main_rest.master_files.model.RMSuplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.main_rest.master_files.repository.RMBranchRepository;
import com.mycompany.main_rest.master_files.repository.RMFirewoodTypeRepository;
import com.mycompany.main_rest.master_files.repository.RMFirewoodUnlordPointRepository;
import com.mycompany.main_rest.master_files.repository.RMLoginDetailsRepository;
import com.mycompany.main_rest.master_files.repository.RMRouteRepository;
import com.mycompany.main_rest.master_files.repository.RMSuplierRepository;
import java.util.List;

/**
 *
 * @author kavish manjitha
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RMasterService {

    @Autowired
    private RMBranchRepository rMBranchRepository;

    @Autowired
    private RMFirewoodTypeRepository rMFirewoodTypeRepository;

    @Autowired
    private RMFirewoodUnlordPointRepository rMFirewoodUnlordPointRepository;

    @Autowired
    private RMLoginDetailsRepository rMLoginDetailsRepository;

    @Autowired
    private RMRouteRepository rMRouteRepository;

    @Autowired
    private RMSuplierRepository rMSuplierRepository;

    public List<RMBranch> findAllBranch() {
        return rMBranchRepository.findAll();
    }

    public List<RMLoginDetails> findAllRMLoginDetailsRepository() {
        return rMLoginDetailsRepository.findAll();
    }

    public List<RMLoginDetails> findMLoginDetailByBranch(Integer branch) {
        return rMLoginDetailsRepository.findByBranch(branch);
    }

    public List<RMRoute> findRMRouteByBranch(Integer branch) {
        return rMRouteRepository.findByBranch(branch);
    }

    public List<RMFirewoodType> findRMFirewoodTypeByBranch(Integer branch) {
        return rMFirewoodTypeRepository.findByBranch(branch);
    }

    public List<RMFirewoodUnloardPoint> findRMFirewoodUnlordPointByBranch(Integer branch) {
        return rMFirewoodUnlordPointRepository.findByBranch(branch);
    }

    public List<RMSuplier> findRMSuplierByBranchAndRoute(Integer branch, Integer route) {
        return rMSuplierRepository.findByBranchAndRoute(branch, route);
    }

}
