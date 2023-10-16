package com.gcu.model;

import java.util.ArrayList;

public class OrderModel {
private Long id;
private String orderNo, productName;
private int quantity;
private float price;
// Getter/ setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getOrderNo() {
	return orderNo;
}
public void setOrderNo(String orderNo) {
	this.orderNo = orderNo;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

// Constructor
public OrderModel(long idSet, String orderNumSet, String productNameSet, float priceSet, int quantitySet) {
	setId(idSet);
	setOrderNo(orderNumSet);
	setProductName(productNameSet);
	setQuantity(quantitySet);
	setPrice(priceSet);
}

public OrderModel() {
	super();
}

}
