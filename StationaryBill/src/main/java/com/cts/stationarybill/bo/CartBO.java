package com.cts.stationarybill.bo;

import com.cts.stationarybill.vo.Item;


import com.cts.stationarybill.vo.MyCart;

import java.util.*;

public class CartBO {
	private MyCart cart;

	
	public CartBO() {
		// TODO Auto-generated constructor stub
	}
	public CartBO(MyCart cart) {
		super();
		this.cart = cart;
	}
	
	public MyCart getCart() {
		return cart;
	}
	public void setCart(MyCart cart) {
		this.cart = cart;
	}
	
	

	public double calculateBillAfterDiscount(double totalOrderBill) {
		
		List<Item> items=cart.getItems();
		double nbprice=0.0;
		double penprice=0.0;
		for(Item i :items)
		{
			if(i.getItemName().equals("Notebook"))
				nbprice=i.getItemCostPerQuantity();
			if(i.getItemName().equals("Pen"))
				penprice=i.getItemCostPerQuantity();
		}
		int notebooks=countNoteBook();
		int pens=countPen();
		double disc=0.0;
		if(totalOrderBill>500)
		{
			if(notebooks>=3)
				disc+=(notebooks*0.1*nbprice);
			if(pens>=10)
				disc+=(pens*0.2*penprice);
		}
		
		
		//Code here..
		return (totalOrderBill-disc);  //TODO, change this value
	}

	public int countNoteBook() {
		List<Item> items=cart.getItems();
		int count = 0;
		for(Item i:items)
		{
			if(i.getItemName().equals("NoteBook"))
			{
				count=i.getQuantity();
				break;
			}
		}
		//Code here..

		return count;  //TODO, change this value
	} 

	public int countPen() {
		List<Item> items=cart.getItems();
		int count = 0;
		for(Item i:items)
		{
			if(i.getItemName().equals("Pen"))
			{
				count=i.getQuantity();
				break;
			}
		}
		//Code here..

		return count;  //TODO, change this value
	}
}
