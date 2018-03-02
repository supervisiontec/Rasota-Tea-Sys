/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.controller;

import com.mycompany.main_rest.master_files.model.RMBranch;
import com.mycompany.main_rest.master_files.model.RMFirewoodType;
import com.mycompany.main_rest.master_files.model.RMFirewoodUnloardPoint;
import com.mycompany.main_rest.master_files.model.RMLoginDetails;
import com.mycompany.main_rest.master_files.model.RMRoute;
import com.mycompany.main_rest.master_files.model.RMSuplier;
import com.mycompany.main_rest.master_files.service.RMasterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kavish manjitha
 */
@RestController
@CrossOrigin
@RequestMapping("/api/v1/green-leaves/rest/master-files")
public class RMasterController {

    @Autowired
    private RMasterService rMasterService;

    @GetMapping("/m-branch")
    public List<RMBranch> findAllBranch() {
        return rMasterService.findAllBranch();
    }

    @GetMapping("/m-login-details")
    public List<RMLoginDetails> findAllRMLoginDetailsRepository() {
        return rMasterService.findAllRMLoginDetailsRepository();
    }

    @GetMapping("/m-login-details-by-branch/{branch}")
    public List<RMLoginDetails> findMLoginDetailByBranch(@PathVariable Integer branch) {
        return rMasterService.findMLoginDetailByBranch(branch);
    }

    @GetMapping("/m-route-by-branch/{branch}")
    public List<RMRoute> findRMRouteByBranch(@PathVariable Integer branch) {
        return rMasterService.findRMRouteByBranch(branch);
    }

    @RequestMapping("/m-firewood-type-by-branch/{branch}")
    public List<RMFirewoodType> findRMFirewoodTypeByBranch(@PathVariable Integer branch) {
        return rMasterService.findRMFirewoodTypeByBranch(branch);
    }

    @GetMapping("/m-firewood-unlord-point-by-branch/{branch}")
    public List<RMFirewoodUnloardPoint> findRMFirewoodUnlordPointByBranch(@PathVariable Integer branch) {
        return rMasterService.findRMFirewoodUnlordPointByBranch(branch);
    }

    @GetMapping("/m-supplier-by-branch-and-route/{branch}/{route}")
    public List<RMSuplier> findRMSuplierByBranchAndRoute(@PathVariable Integer branch, @PathVariable Integer route) {
        return rMasterService.findRMSuplierByBranchAndRoute(branch, route);
    }
}
