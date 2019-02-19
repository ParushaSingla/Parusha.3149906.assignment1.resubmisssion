package com.nagarro.java.training.assignment.services;

import java.util.List;
import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.io.ItemDisplay;
import com.nagarro.java.training.assignment.service.interfaces.*;

/**
 * Main.java-A starting class\
 * 
 * @author parushasingla
 *
 * @version 0.0.1-SNAPSHOT
 * 
 */
public class Main {
	public static void main(String[] args) {
		ItemSevicesImplementation input = new ItemSevicesImplementation();
		List<Item> listOfItem = input.enterDetails();
		ItemDisplay output = new ItemDisplay(listOfItem);
	}
}
