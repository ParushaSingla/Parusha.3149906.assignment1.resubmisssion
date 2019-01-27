package com.nagarro.java.training.assignment.validation;

import com.nagarro.java.training.assignment.constants.*;
import com.nagarro.java.training.assignment.exception.UserInputException;

public class InputValidation {
	boolean flag = true;

	/*
	 * this function checks for correct name
	 */
	public boolean checkItemName(String itemName) {
		try {
			if (!itemName.matches("[a-zA-Z]+")) {
				throw new UserInputException(Constants.ITEM_NAME_SHOULD_BE_IN_ALPHABETS);
			}
		} catch (UserInputException exception) {
			System.out.println(exception.getMessage());
			return false;
		}
		return true;
	}
	/*
	 * this function checks for correct quantity
	 */

	public boolean checkItemQuantity(String itemquantity) {
		int quantity;
		try {
			quantity = Integer.parseInt(itemquantity);
			if (quantity <= 0) {
				throw new UserInputException(Constants.ENTER_THE_QUANTITY);
			}

		} catch (NumberFormatException exception) {

			System.out.println(Constants.ENTER_THE_QUANTITY);
			return false;
		} catch (UserInputException exception) {
			flag = false;
			System.out.println(exception.getMessage());
			return false;
		}
		return true;

	}
	/*
	 * this function checks for correct price
	 */

	public boolean checkItemPrice(String itemPrice) {
		double price;
		try {
			price = Double.parseDouble(itemPrice);
			if (price <= 0) {
				throw new UserInputException(Constants.ENTER_THE_PRICE);
			}
		} catch (NumberFormatException exception) {

			System.out.println(Constants.ENTER_THE_PRICE);
			return false;
		} catch (UserInputException exception) {

			System.out.println(exception.getMessage());
			return false;
		}
		return true;
	}

	/*
	 * this function checks for correct type
	 */
	public boolean checkItemType(String itemType) {
		for (Type T : Type.values()) {
			if (T.name().equalsIgnoreCase(itemType)) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}

		if (!flag) {

			try {
				throw new UserInputException(Constants.ENTER_TYPE_RAW_MANUFACTURED_IMPORTED);
			} catch (UserInputException e) {
				System.out.println(e.getMessage());
				return false;
			}
		}
		return true;
	}
	/*
	 * this function checks for correct nametypeprice format
	 */

	public boolean checkinputformat(String inputs) {
		String nameTypePrice[] = inputs.split(",");
		try {
			if (nameTypePrice.length != 3) {
				throw new UserInputException(Constants.ENTERITEM_NAME_TYPE_PRICE);
			}
		} catch (UserInputException exception) {
			System.out.println(exception.getMessage());
			return false;
		}
		return true;
	}
}
