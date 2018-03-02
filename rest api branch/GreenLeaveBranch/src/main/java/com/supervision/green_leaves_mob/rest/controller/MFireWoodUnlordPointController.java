/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.controller;

import com.supervision.green_leaves_mob.rest.model.MFireWoodUnlordPoint;
import com.supervision.green_leaves_mob.rest.service.MFireWoodUnlordPointService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kavish manjitha
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/green-leaves-mobile/mfirewoodunlordpoint")
public class MFireWoodUnlordPointController {

    @Autowired
    private MFireWoodUnlordPointService fireWoodUnlordPointService;

    @RequestMapping(method = RequestMethod.GET)
    public List<MFireWoodUnlordPoint> findAll() {
        return fireWoodUnlordPointService.findAll();
    }
}
