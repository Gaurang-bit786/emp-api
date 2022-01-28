package com.organisation.api.models;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 

    @Column(name = "Firstname")
    private String firstName;
    @Column(name = "Middlename")
    private String middleName;
    @Column(name = "Lastname")
    private String lastName;
    @Column(name = "Emp_Code")
    private String empCode;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Date_Of_Birth")
    private String dob;
    @Column(name = "Mobile_umber")
    private String mobileNumber;
    @Column(name = "Alternative_Number")
    private String alterMobileNumber;
    @Column(name = "Address")
    private String address;
    @Column(name = "Permanent_Address")
    private String permanentAddress;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "Email")
    private String mail;
    @Column
    private String image;
    
    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeOrgnisationDetail empOrgDetail;
    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeOtherDetail empOtherDetail;
    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeQualification empQualification;
    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeSalary empSalary;
    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeFamily employeeFamily;
    @OneToOne(cascade = CascadeType.ALL)
    private PeviousEmployee peviousEmployee;
    



    public EmployeeModel(){
        super();
    }


    


    public EmployeeModel(int id, String firstName, String middleName, String lastName, String empCode, String gender,
            String dob, String mobileNumber, String alterMobileNumber, String address, String permanentAddress,
            String city, String state, String mail, String image, EmployeeOrgnisationDetail empOrgDetail,
            EmployeeOtherDetail empOtherDetail, EmployeeQualification empQualification, EmployeeSalary empSalary,
            EmployeeFamily employeeFamily, PeviousEmployee peviousEmployee) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.empCode = empCode;
        this.gender = gender;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.alterMobileNumber = alterMobileNumber;
        this.address = address;
        this.permanentAddress = permanentAddress;
        this.city = city;
        this.state = state;
        this.mail = mail;
        this.image = image;
        this.empOrgDetail = empOrgDetail;
        this.empOtherDetail = empOtherDetail;
        this.empQualification = empQualification;
        this.empSalary = empSalary;
        this.employeeFamily = employeeFamily;
        this.peviousEmployee = peviousEmployee;
    }





    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getFirstName() {
        return firstName;
    }




    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    public String getMiddleName() {
        return middleName;
    }




    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }




    public String getLastName() {
        return lastName;
    }




    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public String getEmpCode() {
        return empCode;
    }




    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }




    public String getGender() {
        return gender;
    }




    public void setGender(String gender) {
        this.gender = gender;
    }




    public String getDob() {
        return dob;
    }




    public void setDob(String dob) {
        this.dob = dob;
    }




    public String getMobileNumber() {
        return mobileNumber;
    }




    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }




    public String getAlterMobileNumber() {
        return alterMobileNumber;
    }




    public void setAlterMobileNumber(String alterMobileNumber) {
        this.alterMobileNumber = alterMobileNumber;
    }




    public String getAddress() {
        return address;
    }




    public void setAddress(String address) {
        this.address = address;
    }




    public String getPermanentAddress() {
        return permanentAddress;
    }




    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }




    public String getCity() {
        return city;
    }




    public void setCity(String city) {
        this.city = city;
    }




    public String getState() {
        return state;
    }




    public void setState(String state) {
        this.state = state;
    }




    public String getMail() {
        return mail;
    }




    public void setMail(String mail) {
        this.mail = mail;
    }




    public String getImage() {
        return image;
    }




    public void setImage(String image) {
        this.image = image;
    }




    public EmployeeOrgnisationDetail getEmpOrgDetail() {
        return empOrgDetail;
    }




    public void setEmpOrgDetail(EmployeeOrgnisationDetail empOrgDetail) {
        this.empOrgDetail = empOrgDetail;
    }




    public EmployeeOtherDetail getEmpOtherDetail() {
        return empOtherDetail;
    }




    public void setEmpOtherDetail(EmployeeOtherDetail empOtherDetail) {
        this.empOtherDetail = empOtherDetail;
    }




    public EmployeeQualification getEmpQualification() {
        return empQualification;
    }




    public void setEmpQualification(EmployeeQualification empQualification) {
        this.empQualification = empQualification;
    }




    public EmployeeSalary getEmpSalary() {
        return empSalary;
    }




    public void setEmpSalary(EmployeeSalary empSalary) {
        this.empSalary = empSalary;
    }




    public EmployeeFamily getEmployeeFamily() {
        return employeeFamily;
    }




    public void setEmployeeFamily(EmployeeFamily employeeFamily) {
        this.employeeFamily = employeeFamily;
    }




    public PeviousEmployee getPeviousEmployee() {
        return peviousEmployee;
    }




    public void setPeviousEmployee(PeviousEmployee peviousEmployee) {
        this.peviousEmployee = peviousEmployee;
    }


    
    
}
