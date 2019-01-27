package com.nagarro.java.training.assignment.services;
import java.util.ArrayList;
import java.util.Scanner;
import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.io.UserInput;
import com.nagarro.java.training.assignment.io.ItemDisplay;

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
		ArrayList<Item> list = new ArrayList<Item>();
		Scanner scr = new Scanner(System.in);
		char entermore = 'n';
		/*loop for user to enter no of item */
		do {
			UserInput input = new UserInput();
			list.add(input.inputItemDetails());
			System.out.println("DO YOU WANT TO ENTER ITEM(Y/N)");
			entermore = scr.nextLine().charAt(0);
		} while (entermore == 'y' || entermore == 'Y');
		/*Main calling output class*/
		ItemDisplay output=new ItemDisplay(list);
	}
}
