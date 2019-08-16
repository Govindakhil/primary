package com.utility;

import java.util.List;
import java.util.Map;


public class Shop {
	
	private Map<Integer,String> productMap;
	
	public Map<Integer, String> getProductMap() {
		return productMap;
	}

	public void setProductMap(Map<Integer, String> productMap) {
		this.productMap = productMap;
	}

	//This method should add the serialNumber as key and productName value into the productMap map
	public void addProductDetails(int serialNumber,String productName)
	{
		
	}
	
	/*
	 * This method should search the product based on the producttype and add those products
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 * 1	Fair And Lovely Cream
		2	Lakme Lotion
		3	Fair One Lotion
		4	Ponds Cream
		5	Baby Cream
		if the product type is lotion the output should be
		Lakme Lotion
		Fair One Lotion

	 */
	public List<String> searchBasedOnproduct(String productType){
		
			
	
		return null;
		
	}
	

}
