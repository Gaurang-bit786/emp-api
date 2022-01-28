package com.organisation.api.repository;

import com.organisation.api.models.EmployeeModel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer>{

    // @Query(value="select concat('COMP',REPLICATE(0,4-len(isNull(max(cast(convert(varchar,substring(empCode,5,15))as int)),1)+1)),isNull(max(cast(convert(varchar, substring(empCode, 5, 15)) as int)),0)+1) from Employee_model" , nativeQuery = true)
    // public String findempCode();
    
}
