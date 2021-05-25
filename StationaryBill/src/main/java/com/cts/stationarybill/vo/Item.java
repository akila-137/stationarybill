package com.cts.stationarybill.vo;

public class Item {
	// member variables
		private String itemName;
		private double itemCostPerQuantity;
		private int quantity;
		public Item() {
			// TODO Auto-generated constructor stub
		}
		// Parameterized Constructor
		public Item(String itemName, double itemCostPerQuantity, int quantity) {
			super();		
			this.itemName = itemName;
			this.itemCostPerQuantity = itemCostPerQuantity;
			this.quantity = quantity;
		}

		// getter and setter methods
		
		/**
		 * @return the itemName
		 */
		public String getItemName() {
			return itemName;
		}

		/**
		 * @param itemName
		 *            the itemName to set
		 */
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		/**
		 * @return the itemCostPerQuantity
		 */
		public double getItemCostPerQuantity() {
			return itemCostPerQuantity;
		}

		/**
		 * @param itemCostPerQuantity
		 *            the itemCostPerQuantity to set
		 */
		public void setItemCostPerQuantity(double itemCostPerQuantity) {
			this.itemCostPerQuantity = itemCostPerQuantity;
		}

		/**
		 * @return the quantity
		 */
		public int getQuantity() {
			return quantity;
		}
		
		/**
		 * @param quantity
		 *            the quantity to set
		 */
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Item [itemName=" + itemName + ", itemCostPerQuantity=" + itemCostPerQuantity + ", quantity="
					+ quantity + "]";
		}
			
		
}
