package com.grandcircus.coffeeshop.entity;

public class Items {
private String coffee;
private String price;
private String strength;




public Items() {
	coffee = "";
	price = "";
	strength = "";
	// TODO Auto-generated constructor stub
}




public Items(String coffee, String price, String strength) {
	super();
	this.coffee = coffee;
	this.price = price;
	this.strength = strength;
}




public String getCoffee() {
	return coffee;
}




public void setCoffee(String coffee) {
	this.coffee = coffee;
}




public String getPrice() {
	return price;
}




public void setPrice(String price) {
	this.price = price;
}




public String getStrength() {
	return strength;
}




public void setStrength(String strength) {
	this.strength = strength;
}




@Override
public String toString() {
	return "coffee=" + coffee + ", price=" + price + ", strength=" + strength;
}




}
