package com.nagarro.java.training.assignment.dlo;

import com.nagarro.java.training.assignment.validation.Type;

/**
 * class-RAW used to calculate tax if type is raw
 *
 */
public class Raw extends Item {

	public Raw(String name, Type type, double price, int quantity) {
		super(name, type, price, quantity);
	}

	@Override
	public double getTax() {
		tax = (0.125 * price);
		totalPrice = (tax + price) * quantity;
//		setTax(tax);
//		setTotalPrice(totalPrice);
		return tax;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

}
