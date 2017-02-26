package com.niit.giftmaniabackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int uid;
	String fname;
	String lname;
	String dob;
	String country;
	String nationality;
	String gender;
	String city;
	String addr; 
	String pcode;
	String emailid;
	public User(Integer uid, String fname, String lname) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
	}
	String uname;
	String pwd; 
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", country=" + country
				+ ", nationality=" + nationality + ", gender=" + gender + ", city=" + city + ", addr=" + addr
				+ ", pcode=" + pcode + ", emailid=" + emailid + ", uname=" + uname + ", pwd=" + pwd + ", cartitems="
				+ cartitems + "]";
	}
	int cartitems;
	
	public int getCartitems() {
		return cartitems;
	}
	public void setCartitems(Integer cartitems) {
		this.cartitems = cartitems;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
