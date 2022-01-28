package com.organisation.api.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class EmployeeOtherDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    private String aadhaarCard;
    private String panNo;
    private String voterId;
    private String passwordNo;
    private String bankname;
    private String branchName;
    private String ifscCode;
    private String accountNo;


    public EmployeeOtherDetail(){
        super();
    }
    

    public EmployeeOtherDetail(int id, EmployeeModel employeeModel, String aadhaarCard, String panNo, String voterId,
            String passwordNo, String bankname, String branchName, String ifscCode, String accountNo) {
        this.id = id;

        this.aadhaarCard = aadhaarCard;
        this.panNo = panNo;
        this.voterId = voterId;
        this.passwordNo = passwordNo;
        this.bankname = bankname;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.accountNo = accountNo;
    }
    @Override
    public String toString() {
        return "EmployeeOtherDetail [aadhaarCard=" + aadhaarCard + ", accountNo=" + accountNo + ", bankname=" + bankname
                + ", branchName=" + branchName + ", id=" + id + ", ifscCode="
                + ifscCode + ", panNo=" + panNo + ", passwordNo=" + passwordNo + ", voterId=" + voterId + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAadhaarCard() {
        return aadhaarCard;
    }
    public void setAadhaarCard(String aadhaarCard) {
        this.aadhaarCard = aadhaarCard;
    }
    public String getPanNo() {
        return panNo;
    }
    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }
    public String getVoterId() {
        return voterId;
    }
    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
    public String getPasswordNo() {
        return passwordNo;
    }
    public void setPasswordNo(String passwordNo) {
        this.passwordNo = passwordNo;
    }
    public String getBankname() {
        return bankname;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    




}
