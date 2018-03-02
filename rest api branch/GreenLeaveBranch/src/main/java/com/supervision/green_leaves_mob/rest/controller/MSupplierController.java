/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.controller;

import com.supervision.green_leaves_mob.rest.model.MSupplier;
import com.supervision.green_leaves_mob.rest.service.MSupplierService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kavish manjitha
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/green-leaves-mobile/msupplier")
public class MSupplierController {

    @Autowired
    private MSupplierService mSupplierService;

    @RequestMapping(value = "/findy-by-route/{route}", method = RequestMethod.GET)
    public List<MSupplier> findByRNo(@PathVariable("route") String root) {
        return mSupplierService.findByRNo(root);
    }
    
    @RequestMapping(value = "/findy-by-route-count/{route}", method = RequestMethod.GET)
    public int findByRouteCount(@PathVariable("route") String root) {
        return mSupplierService.findByRouteCount(root);
    }
}
