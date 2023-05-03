package com.subodh.springwebapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.subodh.springwebapp.appconstant.AppConstant;

@Entity
@Table(name = AppConstant.REGISTER_INFO)
public class RegisterEntity implements Serializable {
	
@Id
@GenericGenerator(name ="auto",strategy = "increment" )
@GeneratedValue(generator = "auto")
@Column(name ="id")
private Long id;
@Column(name ="name")
private String name;
@Column(name ="email")
private String email;
@Column(name ="number")
private String number;
@Column(name ="gender")
private String gender;
@Column(name ="city")
private String city;
@Column(name ="country")
private String country;
@Column(name ="pincode")
private String pincode;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
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
@Override
public String toString() {
	return "Register [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", gender=" + gender
			+ ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
}


}
