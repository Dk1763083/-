package com.dong.entity;

import java.io.Serializable;

public class Product implements Serializable{
private Integer id;
private String productName;
private String price;
private String picpath;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(Integer id, String productName, String price, String picpath) {
	super();
	this.id = id;
	this.productName = productName;
	this.price = price;
	this.picpath = picpath;
}
@Override
public String toString() {
	return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", picpath=" + picpath + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getPicpath() {
	return picpath;
}
public void setPicpath(String picpath) {
	this.picpath = picpath;
}


}
