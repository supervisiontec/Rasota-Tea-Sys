/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.service;

import com.supervision.green_leaves_mob.rest.model.MSupplier;
import com.supervision.green_leaves_mob.rest.repository.MSupplierRepository;
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
public class MSupplierService {

    @Autowired
    private MSupplierRepository mSupplierRepository;

    public List<MSupplier> findByRNo(String rno) {
        return mSupplierRepository.findByRNo(rno);
    }

    public int findByRouteCount(String route) {
        return mSupplierRepository.findByRNo(route).size();
    }
}
