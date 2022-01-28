package com.organisation.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeQualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String qualification;
    private String university;
    private String year;
    private String aggregate;


    public EmployeeQualification(){
        super();
    }

    @Override
    public String toString() {
        return "EmployeeQualification [aggregate=" + aggregate + ", id=" + id + ", qualification=" + qualification
                + ", university=" + university + ", year=" + year + "]";
    }
    public EmployeeQualification(int id, String qualification, String university, String year, String aggregate) {
        this.id = id;
        this.qualification = qualification;
        this.university = university;
        this.year = year;
        this.aggregate = aggregate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getAggregate() {
        return aggregate;
    }
    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }


    

}
