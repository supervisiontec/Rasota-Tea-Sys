/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.service;

import com.mycompany.main_rest.transaction.model.MLocation;
import com.mycompany.main_rest.transaction.repository.MLocationRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kavish manjitha
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MLocationService {

    @Autowired
    private MLocationRepository mLocationRepository;

    public Integer saveMLocation(MLocation mLocation) {
        mLocation.setDateTime(new Date());
        return mLocationRepository.save(mLocation).getIndexNo();
    }

    public List<MLocation> findtMLocationByLoginUser(Integer loginUser) {
        return mLocationRepository.findAll();
    }

    public List<MLocation> findActiveLoginUsers() {
        List<MLocation> MLocationList = new ArrayList<MLocation>();
        List<Object[]> findActiveLoginUsers = mLocationRepository.findActiveLoginUsers();
        for (Object[] findActiveLoginUser : findActiveLoginUsers) {
            MLocation findLastLocation = mLocationRepository.findLastLocation(Integer.parseInt(findActiveLoginUser[1].toString()), Integer.parseInt(findActiveLoginUser[0].toString()));
            MLocationList.add(findLastLocation);
        }
        return MLocationList;
    }

    public List<MLocation> findtMLocationByBranchAndLoginUserAndDate(Integer branch, Integer loginUser, String date) {
        return mLocationRepository.findtMLocationByBranchAndLoginUserAndDate(branch, loginUser, date);
    }

}
