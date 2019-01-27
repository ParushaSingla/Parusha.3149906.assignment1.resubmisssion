package com.nagarro.java.training.assignment.io;

import java.util.ArrayList;
import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.validation.Type;
/**
 * 
 * class ItemDisplay
 *
 */
public class ItemDisplay {
	public ItemDisplay(ArrayList<Item> list) {
		display(list);
	}

	public void display(ArrayList<Item> list) {
		for (Item item : list) {
			System.out.println(item.getName() + " " + item.getPrice() + " " +item.getQuant()+" "+ item.getTax() + " " + item.getTotalPrice());
		}

	}
}
