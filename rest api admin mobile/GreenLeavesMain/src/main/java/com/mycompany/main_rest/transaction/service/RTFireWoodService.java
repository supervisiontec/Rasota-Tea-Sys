/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.service;

import com.mycompany.main_rest.master_files.model.RMFirewoodType;
import com.mycompany.main_rest.master_files.model.RMFirewoodUnloardPoint;
import com.mycompany.main_rest.master_files.repository.RMFirewoodTypeRepository;
import com.mycompany.main_rest.master_files.repository.RMFirewoodUnlordPointRepository;
import com.mycompany.main_rest.transaction.model.RTFireWood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.main_rest.transaction.repository.RTFireWoodRepository;
import com.mycompany.main_rest.transaction.request_model.RETFireWood;
import com.mycompany.main_rest.zexception.EntityNotFoundException;
import java.util.List;

/**
 *
 * @author kavish manjitha
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RTFireWoodService {

    @Autowired
    private RTFireWoodRepository rTFireWoodRepository;

    @Autowired
    private RMFirewoodTypeRepository rMFirewoodTypeRepository;

    @Autowired
    private RMFirewoodUnlordPointRepository rMFirewoodUnlordPointRepository;

    public Integer insertRFireWood(RETFireWood rETFireWood) {

        RTFireWood rTFireWood = new RTFireWood();
        rTFireWood.setBranch(rETFireWood.getbNo());
        rTFireWood.setLoginUser(rETFireWood.getLgNo());

        List<RMFirewoodType> findByFwtno = rMFirewoodTypeRepository.findByFwtno(rETFireWood.getFwtNo());
        List<RMFirewoodUnloardPoint> findByFwupno = rMFirewoodUnlordPointRepository.findByFwupno(rETFireWood.getFwcpNo());

        if (findByFwtno.isEmpty()) {
            throw new EntityNotFoundException("firewood type not found");
        } else {
            rTFireWood.setFirewoodType(findByFwtno.get(0).getIndexNo());
        }
        if (findByFwupno.isEmpty()) {
            throw new EntityNotFoundException("firewood unloard point not found");
        } else {
            rTFireWood.setFirewoodUnloardPoint(findByFwupno.get(0).getIndexNo());
        }

        rTFireWood.setSupplier(rETFireWood.getSupplier());
        rTFireWood.setSerial(rETFireWood.getSerial());
        rTFireWood.setDate(rETFireWood.getDate());
        rTFireWood.setLenght(rETFireWood.getLenght());
        rTFireWood.setWidth(rETFireWood.getWidth());
        rTFireWood.setHeight(rETFireWood.getHeight());
        rTFireWood.setQty(rETFireWood.getQty());
        rTFireWood.setRate(rETFireWood.getRate());
        rTFireWood.setAmount(rETFireWood.getAmount());

        rTFireWoodRepository.save(rTFireWood);
        return rETFireWood.getIndexNo();
    }

}
