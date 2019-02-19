package com.nagarro.java.training.assignment.io;
import java.util.List;
import com.nagarro.java.training.assignment.dlo.Item;
/**
 * 
 * class ItemDisplay
 *
 */
public class ItemDisplay {
	public ItemDisplay(List<Item> list) {
		display(list);
	}

	public void display(List<Item>list) {
		for (Item item : list) {
			System.out.println(item.getName() + " " + item.getPrice() + " " +item.getQuant()+" "+ item.getTax() + " " + item.getTotalPrice());
		}

	}
}
