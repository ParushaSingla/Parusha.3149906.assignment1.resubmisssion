package com.nagarro.java.training.assignment.service.interfaces;

import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.validation.Type;
/**
 * class Imported used to calculate tax if type is imported
 *
 */
public class Imported extends Item implements ItemServices {

	public Imported(String name,Type type,double price,int quantity)
	{
		super(name,type,price,quantity);
		calculateTax();
	}
	public void calculateTax() {
		double tax1 = (0.1) * price;
		double s = tax1 + price;
		if (s <= 100) {
			tax = tax1 + 5;
			totalPrice = (5 + s) * quantity;
		} else if (s <= 200 && s > 100) {
			tax = tax1 + 10;
			totalPrice = (10 + s) * quantity;
		} else {
			double k = (5 / 100) * s;
			tax = tax1 + k;
			totalPrice = (k + s) * quantity;
		}
		 setTax(tax);
			setTotalPrice(totalPrice);
	}
}
