/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.service;

import com.supervision.green_leaves_mob.rest.model.MLoginDetails;
import com.supervision.green_leaves_mob.rest.repository.MLoginDetailsRepository;
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
public class MLoginDetailsService {

    @Autowired
    private MLoginDetailsRepository loginDetailsRepository;

    public List<MLoginDetails> findAllLoginDetails() {
        return loginDetailsRepository.findAll();
    }

    public int getLooginDetailsCount() {
        return loginDetailsRepository.findAll().size();
    }
}
