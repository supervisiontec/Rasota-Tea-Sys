/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.repository;

import com.mycompany.main_rest.master_files.model.RMSuplier;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kavish manjitha
 */
@Repository
public interface RMSuplierRepository extends JpaRepository<RMSuplier, Integer> {

    public List<RMSuplier> findByBranchAndSupno(Integer branch, String supNo);

    public List<RMSuplier> findByBranchAndRoute(Integer branch, Integer route);

    public List<RMSuplier> findBySupno(String supno);
}
