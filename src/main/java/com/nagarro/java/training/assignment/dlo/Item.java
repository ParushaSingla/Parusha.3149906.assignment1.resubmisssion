package com.nagarro.java.training.assignment.dlo;
import com.nagarro.java.training.assignment.validation.Type;
/**
 * class Item Model having data members And member function
 * @author parushasingla
 *
 */
public class Item {
	private String name;
	private Type type;
	protected int quantity;
	protected double price;
	protected double tax;
	protected double totalPrice;


	public Item(String name, Type type, double price, int quantity) {
		this.setName(name);
		this.setType(type);
		this.setQuant(quantity);
		this.setPrice(price);
	}
	

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuant() {
		return quantity;
	}

	public void setQuant(int quant) {
		this.quantity = quant;
	}
}
