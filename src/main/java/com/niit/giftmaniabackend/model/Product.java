package com.niit.giftmaniabackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id
	int pid;
	String pname;
	String prod_desc;
	String category;
	@Override
	public  String toString()
	{
		return "Product [pid=" + pid + ", pname=" + pname + ", category=" + category + ",prod_desc=" +prod_desc+"]";
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
		public Product(Integer pid, String pname, String prod_desc, String category) {
		// TODO Auto-generated constructor stub
			this.pid=pid;
			this.pname=pname;
			this.prod_desc=prod_desc;
			this.category=category;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
