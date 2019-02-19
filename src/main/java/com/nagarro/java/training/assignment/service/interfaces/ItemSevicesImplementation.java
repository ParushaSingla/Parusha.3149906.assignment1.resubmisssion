package com.nagarro.java.training.assignment.service.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.io.UserInput;

public class ItemSevicesImplementation implements ItemServices {

	public List<Item> enterDetails() {
		List<Item> list = new ArrayList<Item>();
		Scanner scr = new Scanner(System.in);
		char entermore = 'n';
		/* loop for user to enter no of item */
		do {
			UserInput input = new UserInput();
			list.add(input.inputItemDetails());
			System.out.println("DO YOU WANT TO ENTER ITEM(Y/N)");
			entermore = scr.nextLine().charAt(0);
		} while (entermore == 'y' || entermore == 'Y');
		return list;
	}

}
