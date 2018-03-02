/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main_rest.transaction.repository;

import com.mycompany.main_rest.transaction.model.MLocation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kavish manjitha
 */
public interface MLocationRepository extends JpaRepository<MLocation, Integer> {

    @Query(value = "select \n"
            + " * \n"
            + "from \n"
            + " m_location \n"
            + "where \n"
            + " date_format(m_location.date_time, \"%Y-%m-%d\") = date_format(curdate(), \"%Y-%m-%d\") \n"
            + "and \n"
            + " m_location.login_user = :loginUser and m_location.branch = :branch \n"
            + "order by \n"
            + " m_location.index_no \n"
            + "desc limit 1", nativeQuery = true)
    public MLocation findLastLocation(@Param("loginUser") Integer loginUser, @Param("branch") Integer branch);

    @Query(value = "select\n"
            + " *\n"
            + "from\n"
            + " m_location\n"
            + "where\n"
            + " date_format(m_location.date_time, \"%Y-%m-%d\") = date_format(:date, \"%Y-%m-%d\")\n"
            + "and\n"
            + " m_location.login_user = :loginUser and m_location.branch = :branch", nativeQuery = true)
    public List<MLocation> findtMLocationByBranchAndLoginUserAndDate(@Param("loginUser") Integer loginUser, @Param("branch") Integer branch, @Param("date") String date);

    @Query(value = "select\n"
            + " m_location.branch,\n"
            + " m_location.login_user\n"
            + "from \n"
            + " m_location \n"
            + "left join m_login_details\n"
            + "on m_login_details.lgno = m_location.login_user and m_login_details.branch = m_location.branch\n"
            + "where \n"
            + " date_format(m_location.date_time, \"%Y-%m-%d\") = date_format(curdate(), \"%Y-%m-%d\") \n"
            + "group by \n"
            + " m_location.login_user", nativeQuery = true)
    public List<Object[]> findActiveLoginUsers();

}
