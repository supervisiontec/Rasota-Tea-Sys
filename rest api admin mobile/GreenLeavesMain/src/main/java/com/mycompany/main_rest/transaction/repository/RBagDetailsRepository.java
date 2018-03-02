/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.repository;

import com.mycompany.main_rest.transaction.model.RBagDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kavish manjitha
 */
public interface RBagDetailsRepository extends JpaRepository<RBagDetails, Integer>{
    
}
