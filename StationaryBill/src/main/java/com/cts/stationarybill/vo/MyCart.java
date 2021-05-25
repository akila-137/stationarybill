package com.cts.stationarybill.vo;

import java.util.List;

public class MyCart {
private List<Item> items;
public MyCart() {
	// TODO Auto-generated constructor stub
}
public MyCart(List<Item> items) {
	super();
	this.items = items;
}
public List<Item> getItems() {
	return items;
}
public void setItems(List<Item> items) {
	this.items = items;
}

}
