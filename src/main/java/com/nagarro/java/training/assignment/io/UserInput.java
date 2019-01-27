package com.nagarro.java.training.assignment.io;
import com.nagarro.java.training.assignment.validation.*;
import com.nagarro.java.training.assignment.constants.*;
import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.service.interfaces.Imported;
import com.nagarro.java.training.assignment.service.interfaces.Manufactured;
import com.nagarro.java.training.assignment.service.interfaces.Raw;
import com.nagarro.java.training.assignment.validation.InputValidation;
import java.util.*;

public class UserInput {
	static Scanner scr = new Scanner(System.in);
	String inputs;
	String itemName;
	String itemType;
	Type itemtype;
	String itemPrice;
	String quantity;
	String nameTypePrice[] = new String[3];
	InputValidation check = new InputValidation();
/*Entering inputs throw this method*/
	public Item inputItemDetails() {
		System.out.println(Constants.ENTERITEM_NAME_TYPE_PRICE);
		while (true) {
			inputs = scr.nextLine();
			if (check.checkinputformat(inputs))
				break;
		}
		splitInputs(inputs);
		System.out.println(Constants.ENTER_THE_QUANTITY);
		checkquantity();
		return itemobject();
	}
	
	
	public Item itemobject() {
		itemtype = Type.valueOf(itemType.toUpperCase());
		Item returnitem = null;
		switch (itemtype) {
		case RAW: {
			Raw obj=new Raw(itemName, itemtype, Double.parseDouble(itemPrice), Integer.parseInt(quantity));
			returnitem=obj;
		}
			break;
		case IMPORTED: {
			Imported obj=new Imported(itemName, itemtype, Double.parseDouble(itemPrice), Integer.parseInt(quantity));
			returnitem=obj;
		}
			break;
		case MANUFACTURED: {
		Manufactured obj=new Manufactured(itemName, itemtype, Double.parseDouble(itemPrice), Integer.parseInt(quantity));
		returnitem=obj;
		}
			break;
		}
		return 	returnitem;
	}
/*
 * following methods take input again and again until user enter correct
 */
	private void checkquantity() {
		while (true) {
			quantity = scr.nextLine();
			if (check.checkItemQuantity(quantity))
				break;
		}
	}

	public void splitInputs(String inputs) {
		String nameTypePrice[] = inputs.split(",");
		itemName = nameTypePrice[0];
		Itemname(itemName);
		itemType = nameTypePrice[1];
		Itemtype(itemType);
		itemPrice = (nameTypePrice[2]);
		itemPrice(itemPrice);
	}

	private void itemPrice(String itemPrice2) {
		while (true) {
			if (check.checkItemPrice(itemPrice))
				break;
			else
				itemPrice = scr.nextLine();
		}

	}

	private void Itemtype(String itemType2) {
		while (true) {
			if (check.checkItemType(itemType))
				break;
			else
				itemType = scr.nextLine();
		}

	}

	private void Itemname(String itemName) {
		while (true) {
			if (check.checkItemName(itemName))
				break;
			else
				itemName = scr.nextLine();
		}

	}

}
