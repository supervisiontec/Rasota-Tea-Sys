/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.controller;

import com.mycompany.main_rest.transaction.request_model.RestTGreenLeavesWeigh;
import com.mycompany.main_rest.transaction.service.RTGreenLeavesService;
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
@RequestMapping(value = "/api/v1/green-leaves/rest/transaction/t-green-leaves-weigh")
public class RTGreenLeavesController {

    @Autowired
    private RTGreenLeavesService greenLeavesService;

    @PostMapping("/insert-t-green-leaves-weigh")
    public Integer insertTGreenLeaves(@RequestBody RestTGreenLeavesWeigh greenLeavesWeigh) {
        return greenLeavesService.insertTGreenLeaves(greenLeavesWeigh);
    }
}
