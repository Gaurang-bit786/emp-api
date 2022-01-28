package com.organisation.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeFamily {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String memberName;
    private String relation;
    private String residingWithEmployee;
    private String deptOfEmployee;

    public EmployeeFamily(){
        super();
    }    

    public EmployeeFamily(int id, String memberName, String relation, String residingWithEmployee,
            String deptOfEmployee) {
        this.id = id;
        this.memberName = memberName;
        this.relation = relation;
        this.residingWithEmployee = residingWithEmployee;
        this.deptOfEmployee = deptOfEmployee;
    }


    


    @Override
    public String toString() {
        return "EmployeeFamily [deptOfEmployee=" + deptOfEmployee + ", id=" + id + ", memberName=" + memberName
                + ", relation=" + relation + ", residingWithEmployee=" + residingWithEmployee + "]";
    }





    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getRelation() {
        return relation;
    }
    public void setRelation(String relation) {
        this.relation = relation;
    }
    public String getResidingWithEmployee() {
        return residingWithEmployee;
    }
    public void setResidingWithEmployee(String residingWithEmployee) {
        this.residingWithEmployee = residingWithEmployee;
    }
    public String getDeptOfEmployee() {
        return deptOfEmployee;
    }
    public void setDeptOfEmployee(String deptOfEmployee) {
        this.deptOfEmployee = deptOfEmployee;
    }

    
    
    
    

}
