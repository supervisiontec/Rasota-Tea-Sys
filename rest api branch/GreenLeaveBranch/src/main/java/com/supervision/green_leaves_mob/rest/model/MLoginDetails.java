/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kavish manjitha
 */
@Entity
@Table(name = "m_login_details")
public class MLoginDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "name")
    private String name;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "default_route")
    private String defaultRoute;

    @Column(name = "default_vehicle")
    private String defaultVehicle;

    @Column(name = "active")
    private String active;

    public MLoginDetails() {
    }

    public MLoginDetails(Integer indexNo, String name, String userName, String password, String defaultRoute, String defaultVehicle, String active) {
        this.indexNo = indexNo;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.defaultRoute = defaultRoute;
        this.defaultVehicle = defaultVehicle;
        this.active = active;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDefaultRoute() {
        return defaultRoute;
    }

    public void setDefaultRoute(String defaultRoute) {
        this.defaultRoute = defaultRoute;
    }

    public String getDefaultVehicle() {
        return defaultVehicle;
    }

    public void setDefaultVehicle(String defaultVehicle) {
        this.defaultVehicle = defaultVehicle;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "MLoginDetails{" + "indexNo=" + indexNo + ", name=" + name + ", userName=" + userName + ", password=" + password + ", defaultRoute=" + defaultRoute + ", defaultVehicle=" + defaultVehicle + ", active=" + active + '}';
    }

}
