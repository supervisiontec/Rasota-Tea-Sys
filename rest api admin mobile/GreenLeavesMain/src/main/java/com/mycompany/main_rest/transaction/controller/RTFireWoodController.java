/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.controller;

import com.mycompany.main_rest.transaction.request_model.RETFireWood;
import com.mycompany.main_rest.transaction.service.RTFireWoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping(value = "/api/v1/green-leaves/rest/transaction/t-fire-wood")
public class RTFireWoodController {

    @Autowired
    private RTFireWoodService fireWoodService;

    @PostMapping("/insert-t-firewood")
    public Integer insertRFireWood(@RequestBody RETFireWood fireWood) {
        return fireWoodService.insertRFireWood(fireWood);
    }
}
