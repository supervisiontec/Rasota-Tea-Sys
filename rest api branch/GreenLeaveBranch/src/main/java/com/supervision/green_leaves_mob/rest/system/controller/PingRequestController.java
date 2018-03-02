/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.system.controller;

import com.supervision.green_leaves_mob.rest.system.model.PingRespond;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@RequestMapping(value = "/api/v1/green-leaves-mobile/server-ping")
public class PingRequestController {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping(method = RequestMethod.GET)
    public PingRespond pingRequest() {
        PingRespond pingRespond = new PingRespond();
        pingRespond.setServerDateAndTime(DATE_FORMAT.format(new Date()));
        try {
            pingRespond.setServerIpAddress(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return pingRespond;
    }
}
