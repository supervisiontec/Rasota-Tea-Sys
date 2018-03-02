/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.controller;

import com.supervision.green_leaves_mob.rest.model.MFireWoodType;
import com.supervision.green_leaves_mob.rest.service.MFireWoodTypeService;
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
@RequestMapping(value = "/api/v1/green-leaves-mobile/mfirewoodtype")
public class MFireWoodTypeController {

    @Autowired
    private MFireWoodTypeService fireWoodTypeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<MFireWoodType> findAll() {
        return fireWoodTypeService.findAll();
    }

}
