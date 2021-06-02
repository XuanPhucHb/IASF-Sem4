package com.nxp.sem4.iasf.sem4iasf.repo;

import com.nxp.sem4.iasf.sem4iasf.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employees, Long> {


}
