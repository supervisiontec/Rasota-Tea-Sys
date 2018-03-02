/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.master_files.repository;

import com.mycompany.main_rest.master_files.model.RMRoute;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kavish manjitha
 */
@Repository
public interface RMRouteRepository extends JpaRepository<RMRoute, Integer> {

    public List<RMRoute> findByBranch(Integer branch);

    public List<RMRoute> findByRno(String rno);

    public List<RMRoute> findByBranchAndRno(Integer brnch, String rno);
}
