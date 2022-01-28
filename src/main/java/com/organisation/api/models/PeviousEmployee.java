package com.organisation.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PeviousEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String empName;
    private String dateOfJoining;
    private String datOfLeaving;
    private String lastSalary;
    private String department;
    private String Designation;


    public PeviousEmployee(){
        super();
    }

    public PeviousEmployee(int id, String empName, String dateOfJoining, String datOfLeaving, String lastSalary,
            String department, String designation) {
        this.id = id;
        this.empName = empName;
        this.dateOfJoining = dateOfJoining;
        this.datOfLeaving = datOfLeaving;
        this.lastSalary = lastSalary;
        this.department = department;
        Designation = designation;
    }
    @Override
    public String toString() {
        return "PeviousEmployee [Designation=" + Designation + ", datOfLeaving=" + datOfLeaving + ", dateOfJoining="
                + dateOfJoining + ", department=" + department + ", empName=" + empName + ", id=" + id + ", lastSalary="
                + lastSalary + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getDateOfJoining() {
        return dateOfJoining;
    }
    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
    public String getDatOfLeaving() {
        return datOfLeaving;
    }
    public void setDatOfLeaving(String datOfLeaving) {
        this.datOfLeaving = datOfLeaving;
    }
    public String getLastSalary() {
        return lastSalary;
    }
    public void setLastSalary(String lastSalary) {
        this.lastSalary = lastSalary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }

    

}
