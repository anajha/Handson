package com.example.handson;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="MEDICALDRUG")
public class MedicalDrug {
    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    Long id;
	
    @Column(name="DRUGID")
    public Long drugid;
    
    @Column(name="EMPID")
    public Long empid;
  
   
    //no-args constructor
    public MedicalDrug()
    {}


	public MedicalDrug(Long drugid, Long empid) {
		
		this.drugid = drugid;
		this.empid = empid;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getDrugid() {
		return drugid;
	}


	public void setDrugid(Long drugid) {
		this.drugid = drugid;
	}


	public Long getEmpid() {
		return empid;
	}


	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	
}

