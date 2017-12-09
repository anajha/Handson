package com.example.handson;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="DRUGS")
public class Drugs {
    
	@Id
    @GeneratedValue
    Long id;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="DRUGID")
    public Long drugid;
    
    @Column(name="DRUGNAME")
    public String drugname;
  
    @Column(name="DESCRIPTION")
    public String description;
    
    @Column(name="ABOUT")
    public String about;
       
    @Column(name="SYMPTOMS")
    public String symptoms;
    
    @Column(name="MOLECULENAME")
    public String moleculename;
    
    @Column(name="PRODUCTCODE")
    public String productcode;
     
    //no-args constructor
    public Drugs()
    {}

	public Drugs(Long drugid, String drugname, String description, String about, String symptoms, String moleculename,
			String productcode) {
		super();
		this.drugid = drugid;
		this.drugname = drugname;
		this.description = description;
		this.about = about;
		this.symptoms = symptoms;
		this.moleculename = moleculename;
		this.productcode = productcode;
	}

	public Long getDrugid() {
		return drugid;
	}

	public void setDrugid(Long drugid) {
		this.drugid = drugid;
	}

	public String getDrugname() {
		return drugname;
	}

	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getMoleculename() {
		return moleculename;
	}

	public void setMoleculename(String moleculename) {
		this.moleculename = moleculename;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
    
   
}
