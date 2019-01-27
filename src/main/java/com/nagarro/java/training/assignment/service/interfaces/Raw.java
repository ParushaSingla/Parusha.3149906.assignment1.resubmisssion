package com.nagarro.java.training.assignment.service.interfaces;

import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.validation.Type;
/**
 * class-RAW used to calculate tax if type is raw
 *
 */
public class Raw extends Item implements ItemServices{

	public Raw(String name,Type type,double price,int quantity)
	{
		super(name,type,price,quantity);
		calculateTax();
	}

	public void calculateTax() {
		tax = (0.125 * price);
		totalPrice = (tax + price) * quantity;
	    setTax(tax);
		setTotalPrice(totalPrice);
	}

}
