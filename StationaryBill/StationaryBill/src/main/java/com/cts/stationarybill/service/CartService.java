package com.cts.stationarybill.service;

import java.util.List;

import com.cts.stationarybill.bo.CartBO;
import com.cts.stationarybill.exception.InvalidCostPerQuantityException;
import com.cts.stationarybill.vo.Item;


public class CartService {
	private CartBO cartBo;
	public CartService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CartService(CartBO cartBo) {
		super();
		this.cartBo = cartBo;
	}

	public CartBO getCartBo() {
		return cartBo;
	}

	public void setCartBo(CartBO cartBo) {
		this.cartBo = cartBo;
	}
	/**
	 * Method to calculate total bill
	 * 
	 * @param MyCart
	 * @return totalOrderBill
	 */
	public double calculateOrderTotalBill() throws InvalidCostPerQuantityException {
		double totalOrderBill = 0;

		//Code here..

		return totalOrderBill;  //TODO, change this value

	}

	/**
	 * Method to validate cost per quantity and throws exception if validation failes
	 * 
	 * @exception InvalidCostPerQuantityException
	 */
	public boolean validateCostPerQuantity() throws InvalidCostPerQuantityException{
		//Code here..
		return false;
	}
}
