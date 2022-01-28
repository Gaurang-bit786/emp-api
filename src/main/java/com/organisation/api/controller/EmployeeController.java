package com.organisation.api.controller;


import java.util.List;
import java.util.Optional;
import com.organisation.api.models.EmployeeModel;
import com.organisation.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;







@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/emp")
    List<EmployeeModel> all(){
        return employeeRepository.findAll();
    }

    @GetMapping("/emp/{id}")
    Optional<EmployeeModel> getDataById(@PathVariable int id){
        return employeeRepository.findById(id);
    }

    @PostMapping("/emp")
    public EmployeeModel newEmployee(@RequestBody EmployeeModel entity){
        entity.setEmpCode("Emp00" + String.valueOf(entity.getId()));
        return employeeRepository.save(entity);
    }




    @PutMapping("/emp/{id}")
    EmployeeModel replaceEmployee(@RequestBody EmployeeModel newEmployee, @PathVariable Integer id) {
    
        return employeeRepository.findById(id)
          .map(employee -> {
            
            employee.setFirstName(newEmployee.getFirstName());
            employee.setMiddleName(newEmployee.getMiddleName());
            employee.setLastName(newEmployee.getLastName());
            employee.setEmpCode(newEmployee.getEmpCode());
            employee.setGender(newEmployee.getGender());
            employee.setDob(newEmployee.getDob());
            employee.setMobileNumber(newEmployee.getMobileNumber());
            employee.setAlterMobileNumber(newEmployee.getAlterMobileNumber());
            employee.setAddress(newEmployee.getAddress());
            employee.setPermanentAddress(newEmployee.getPermanentAddress());
            employee.setCity(newEmployee.getCity());
            employee.setState(newEmployee.getState());
            employee.setMail(newEmployee.getMail());
            employee.setImage(newEmployee.getImage());
            
            employee.getEmpOrgDetail().setCardNo(newEmployee.getEmpOrgDetail().getCardNo());
            employee.getEmpOrgDetail().setConfirmDate(newEmployee.getEmpOrgDetail().getConfirmDate());
            employee.getEmpOrgDetail().setDepartment(newEmployee.getEmpOrgDetail().getDepartment());
            employee.getEmpOrgDetail().setEmployeeType(newEmployee.getEmpOrgDetail().getEmployeeType());
            employee.getEmpOrgDetail().setEpfNumber(newEmployee.getEmpOrgDetail().getEpfNumber());
            employee.getEmpOrgDetail().setEsicNo(newEmployee.getEmpOrgDetail().getEsicNo());
            employee.getEmpOrgDetail().setJoiningDate(newEmployee.getEmpOrgDetail().getJoiningDate());
            employee.getEmpOrgDetail().setReportingTo(newEmployee.getEmpOrgDetail().getReportingTo());
            employee.getEmpOrgDetail().setStartDate(newEmployee.getEmpOrgDetail().getStartDate());
            employee.getEmpOrgDetail().setSubDepartment(newEmployee.getEmpOrgDetail().getSubDepartment());
            
            employee.getEmpOtherDetail().setPanNo(newEmployee.getEmpOtherDetail().getPanNo());
            employee.getEmpOtherDetail().setAadhaarCard(newEmployee.getEmpOtherDetail().getAadhaarCard());
            employee.getEmpOtherDetail().setAccountNo(newEmployee.getEmpOtherDetail().getAccountNo());
            employee.getEmpOtherDetail().setBankname(newEmployee.getEmpOtherDetail().getBankname());
            employee.getEmpOtherDetail().setBranchName(newEmployee.getEmpOtherDetail().getBranchName());
            employee.getEmpOtherDetail().setVoterId(newEmployee.getEmpOtherDetail().getVoterId());
            employee.getEmpOtherDetail().setPasswordNo(newEmployee.getEmpOtherDetail().getPasswordNo());
            employee.getEmpOtherDetail().setIfscCode(newEmployee.getEmpOtherDetail().getIfscCode());
            
            employee.getEmpQualification().setAggregate(newEmployee.getEmpQualification().getAggregate());
            employee.getEmpQualification().setQualification(newEmployee.getEmpQualification().getQualification());
            employee.getEmpQualification().setUniversity(newEmployee.getEmpQualification().getUniversity());
            employee.getEmpQualification().setYear(newEmployee.getEmpQualification().getYear());
            
            employee.getEmpSalary().setBasicSalary(newEmployee.getEmpSalary().getBasicSalary());
            employee.getEmpSalary().setConveynance(newEmployee.getEmpSalary().getConveynance());
            employee.getEmpSalary().setDa(newEmployee.getEmpSalary().getDa());
            employee.getEmpSalary().setEsi(newEmployee.getEmpSalary().getEsi());
            employee.getEmpSalary().setGrossSalary(newEmployee.getEmpSalary().getGrossSalary());
            employee.getEmpSalary().setHra(newEmployee.getEmpSalary().getHra());
            employee.getEmpSalary().setMedicalReimb(newEmployee.getEmpSalary().getMedicalReimb());
            employee.getEmpSalary().setNetSalary(newEmployee.getEmpSalary().getNetSalary());
            employee.getEmpSalary().setPf(newEmployee.getEmpSalary().getPf());
            employee.getEmpSalary().setSpecialAllow(newEmployee.getEmpSalary().getSpecialAllow());
            employee.getEmpSalary().setTotlDeduction(newEmployee.getEmpSalary().getTotlDeduction());
            
            employee.getPeviousEmployee().setDatOfLeaving(newEmployee.getPeviousEmployee().getDatOfLeaving());
            employee.getPeviousEmployee().setDateOfJoining(newEmployee.getPeviousEmployee().getDateOfJoining());
            employee.getPeviousEmployee().setDepartment(newEmployee.getPeviousEmployee().getDepartment());
            employee.getPeviousEmployee().setDesignation(newEmployee.getPeviousEmployee().getDesignation());
            employee.getPeviousEmployee().setEmpName(newEmployee.getPeviousEmployee().getEmpName());
            employee.getPeviousEmployee().setLastSalary(newEmployee.getPeviousEmployee().getLastSalary());

            employee.getEmployeeFamily().setDeptOfEmployee(newEmployee.getEmployeeFamily().getDeptOfEmployee());
            employee.getEmployeeFamily().setMemberName(newEmployee.getEmployeeFamily().getMemberName());
            employee.getEmployeeFamily().setRelation(newEmployee.getEmployeeFamily().getRelation());
            employee.getEmployeeFamily().setResidingWithEmployee(newEmployee.getEmployeeFamily().getResidingWithEmployee());

            return employeeRepository.save(employee);
          })
          .orElseGet(() -> {
            newEmployee.setId(id);
            return employeeRepository.save(newEmployee);
          });
      }
}
