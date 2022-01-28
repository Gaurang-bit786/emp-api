package com.organisation.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String basicSalary;
    private String da;
    private String hra;
    private String conveynance;
    private String medicalReimb;
    private String specialAllow;
    private String pf;
    private String esi;
    private String grossSalary;
    private String netSalary;
    private String totlDeduction;


    public EmployeeSalary(){
        super();
    }

    
    public EmployeeSalary(int id, String basicSalary, String da, String hra, String conveynance, String medicalReimb,
            String specialAllow, String pf, String esi, String grossSalary, String netSalary, String totlDeduction) {
        this.id = id;
        this.basicSalary = basicSalary;
        this.da = da;
        this.hra = hra;
        this.conveynance = conveynance;
        this.medicalReimb = medicalReimb;
        this.specialAllow = specialAllow;
        this.pf = pf;
        this.esi = esi;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.totlDeduction = totlDeduction;
    }
    @Override
    public String toString() {
        return "EmployeeSalary [basicSalary=" + basicSalary + ", conveynance=" + conveynance + ", da=" + da + ", esi="
                + esi + ", grossSalary=" + grossSalary + ", hra=" + hra + ", id=" + id + ", medicalReimb="
                + medicalReimb + ", netSalary=" + netSalary + ", pf=" + pf + ", specialAllow=" + specialAllow
                + ", totlDeduction=" + totlDeduction + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }
    public String getDa() {
        return da;
    }
    public void setDa(String da) {
        this.da = da;
    }
    public String getHra() {
        return hra;
    }
    public void setHra(String hra) {
        this.hra = hra;
    }
    public String getConveynance() {
        return conveynance;
    }
    public void setConveynance(String conveynance) {
        this.conveynance = conveynance;
    }
    public String getMedicalReimb() {
        return medicalReimb;
    }
    public void setMedicalReimb(String medicalReimb) {
        this.medicalReimb = medicalReimb;
    }
    public String getSpecialAllow() {
        return specialAllow;
    }
    public void setSpecialAllow(String specialAllow) {
        this.specialAllow = specialAllow;
    }
    public String getPf() {
        return pf;
    }
    public void setPf(String pf) {
        this.pf = pf;
    }
    public String getEsi() {
        return esi;
    }
    public void setEsi(String esi) {
        this.esi = esi;
    }
    public String getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(String grossSalary) {
        this.grossSalary = grossSalary;
    }
    public String getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(String netSalary) {
        this.netSalary = netSalary;
    }
    public String getTotlDeduction() {
        return totlDeduction;
    }
    public void setTotlDeduction(String totlDeduction) {
        this.totlDeduction = totlDeduction;
    }

    
}
