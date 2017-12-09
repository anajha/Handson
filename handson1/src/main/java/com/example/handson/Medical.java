package com.example.handson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="medical")
public class Medical {
    	
	@Id
    @GeneratedValue
    Long id;
	
    @Column(name="EMPID")
    public Long empid;
    
    @Column(name="REPFIRSTNAME")
    public String repfirstname;
  
    @Column(name="REPLASTNAME")
    public String replastname;
    
    @Column(name="COMPID")
    public String compid;
       
    @Column(name="REPADDRESS")
    public String repaddress;
    
    @Column(name="COUNTRY")
    public String country;
    
    @Column(name="STATE")
    public String state;
    
    @Column(name="CITY")
    public String city;
    
    @Column(name="PINCODE")
    public String pincode;
        
    //no-args constructor
    public Medical()
    {}
    
    public Medical(Long empid, String repfirstname, String replastname, String compid, String repaddress,
			String country, String state, String city, String pincode) {
    	
		this.empid = empid;
		this.repfirstname = repfirstname;
		this.replastname = replastname;
		this.compid = compid;
		this.repaddress = repaddress;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getRepfirstname() {
		return repfirstname;
	}

	public void setRepfirstname(String repfirstname) {
		this.repfirstname = repfirstname;
	}

	public String getReplastname() {
		return replastname;
	}

	public void setReplastname(String replastname) {
		this.replastname = replastname;
	}

	public String getCompid() {
		return compid;
	}

	public void setCompid(String compid) {
		this.compid = compid;
	}

	public String getRepaddress() {
		return repaddress;
	}

	public void setRepaddress(String repaddress) {
		this.repaddress = repaddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

}