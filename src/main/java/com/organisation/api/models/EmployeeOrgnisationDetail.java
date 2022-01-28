package com.organisation.api.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeOrgnisationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    

    private Long cardNo;
    private String joiningDate;
    private String confirmDate;
    private String employeeType;
    private String department;
    private String  subDepartment;
    private String reportingTo;
    private String epfNumber;
    private String startDate;

    private String esicNo;
    
    public EmployeeOrgnisationDetail(){
        super();
    }
    
    @Override
    public String toString() {
        return "EmployeeOrgnisationDetail [cardNo=" + cardNo + ", confirmDate=" + confirmDate + ", department="
                + department + ", employeeType=" + employeeType + ", epfNumber=" + epfNumber
                + ", esicNo=" + esicNo + ", id=" + id + ", joiningDate=" + joiningDate + ", reportingTo=" + reportingTo
                + ", startDate=" + startDate + ", subDepartment=" + subDepartment + "]";
    }
    public EmployeeOrgnisationDetail(int id, EmployeeModel empModel, Long cardNo, String joiningDate,
            String confirmDate, String employeeType, String department, String subDepartment, String reportingTo,
            String epfNumber, String startDate, String esicNo) {
        this.id = id;

        this.cardNo = cardNo;
        this.joiningDate = joiningDate;
        this.confirmDate = confirmDate;
        this.employeeType = employeeType;
        this.department = department;
        this.subDepartment = subDepartment;
        this.reportingTo = reportingTo;
        this.epfNumber = epfNumber;
        this.startDate = startDate;
        this.esicNo = esicNo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Long getCardNo() {
        return cardNo;
    }
    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }
    public String getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    public String getConfirmDate() {
        return confirmDate;
    }
    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }
    public String getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSubDepartment() {
        return subDepartment;
    }
    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
    }
    public String getReportingTo() {
        return reportingTo;
    }
    public void setReportingTo(String reportingTo) {
        this.reportingTo = reportingTo;
    }
    public String getEpfNumber() {
        return epfNumber;
    }
    public void setEpfNumber(String epfNumber) {
        this.epfNumber = epfNumber;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEsicNo() {
        return esicNo;
    }
    public void setEsicNo(String esicNo) {
        this.esicNo = esicNo;
    }
    
    

}
