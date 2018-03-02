/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.controller;

import com.mycompany.main_rest.transaction.model.MLocation;
import com.mycompany.main_rest.transaction.service.MLocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kavish manjitha
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/green-leaves/rest/transaction/m-location")
public class MLocationController {

    @Autowired
    private MLocationService mLocationService;

    @PostMapping("/insert-m-location")
    public Integer insertMLocation(@RequestBody MLocation mLocation) {
        return mLocationService.saveMLocation(mLocation);
    }

    @GetMapping("/find-m-location")
    public List<MLocation> findtMLocationByLoginUser() {
        return mLocationService.findActiveLoginUsers();
    }

    @GetMapping("/find-m-location-branch-login-user-date/{branch}/{loginUser}/{date}")
    public List<MLocation> findtMLocationByBranchAndLoginUserAndDate(@PathVariable Integer branch, @PathVariable Integer loginUser, @PathVariable String date) {
        return mLocationService.findtMLocationByBranchAndLoginUserAndDate(branch, loginUser, date);
    }
}
