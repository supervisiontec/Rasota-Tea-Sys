/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.system.model;

import java.util.Date;

/**
 *
 * @author kavish manjitha
 */
public class PingRespond {

    private String serverDateAndTime;
    private String serverIpAddress;

    public PingRespond() {
    }

    public PingRespond(String serverDateAndTime, String serverIpAddress) {
        this.serverDateAndTime = serverDateAndTime;
        this.serverIpAddress = serverIpAddress;
    }

    public String getServerDateAndTime() {
        return serverDateAndTime;
    }

    public void setServerDateAndTime(String serverDateAndTime) {
        this.serverDateAndTime = serverDateAndTime;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    @Override
    public String toString() {
        return "PingRespond{" + "serverDateAndTime=" + serverDateAndTime + ", serverIpAddress=" + serverIpAddress + '}';
    }

}
