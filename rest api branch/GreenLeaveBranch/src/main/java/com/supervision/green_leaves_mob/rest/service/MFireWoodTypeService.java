/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.green_leaves_mob.rest.service;

import com.supervision.green_leaves_mob.rest.model.MFireWoodType;
import com.supervision.green_leaves_mob.rest.repository.MFireWoodTypeRepository;
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
public class MFireWoodTypeService {

    @Autowired
    private MFireWoodTypeRepository fireWoodTypeRepository;

    public List<MFireWoodType> findAll() {
        return fireWoodTypeRepository.findAll();
    }
}
