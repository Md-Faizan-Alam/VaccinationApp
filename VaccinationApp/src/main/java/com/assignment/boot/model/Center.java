package com.assignment.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//	The CenterList.txt file in this repository contains a list of Vaccination Centers in JSON format
//	The above mentioned list was posted to the Database using Postman and was used to test this Application

@Entity
@Table(name="CENTERS")
public class Center {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "center_no")
	private int id;
	@Column(name = "center_name")
	private String name;
	private String address;
	private int pincode;
	private String district;
	private String state;
	
	public Center() {}
	public Center(String name, String address, int pincode, String district, String state) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.district = district;
		this.state = state;
	}
	
	// Getters and Setters
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public int getPincode() {return pincode;}
	public void setPincode(int pincode) {this.pincode = pincode;}
	public String getDistrict() {return district;}
	public void setDistrict(String district) {this.district = district;}
	public String getState() {return state;}
	public void setState(String state) {this.state = state;}
		
}
