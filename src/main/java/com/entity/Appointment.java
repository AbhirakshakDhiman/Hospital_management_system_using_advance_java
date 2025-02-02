package com.entity;

public class Appointment {
private int id;
private int userId;
private String fullname;
private String gender;
private String age;
private String appdate;
private String email;
private String mob;
private String diseases;
private int doctorId;
private String address;
private String status;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getAppdate() {
	return appdate;
}
public void setAppdate(String appdate) {
	this.appdate = appdate;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
public String getDiseases() {
	return diseases;
}
public void setDiseases(String diseases) {
	this.diseases = diseases;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Appointment() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Appointment(int userId, String fullname, String gender, String age, String appdate, String email, String mob,
		String diseases, int doctorId, String address, String status) {
	super();
	this.userId = userId;
	this.fullname = fullname;
	this.gender = gender;
	this.age = age;
	this.appdate = appdate;
	this.email = email;
	this.mob = mob;
	this.diseases = diseases;
	this.doctorId = doctorId;
	this.address = address;
	this.status = status;
}



}
