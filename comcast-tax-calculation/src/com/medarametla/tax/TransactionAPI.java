package com.medarametla.tax;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TransactionAPI {
	
	public enum ItemType {
		LUXURY, BASIC
	}

	private double price;
	private int quantity;
	private ItemType itemType;

	// Constructor
	public TransactionAPI() {

	}

	// Getters and Setters for Price.
	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	// Getters and Setters for quantity
	public int getQuantity() {
		return quantity;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Getters and Setters for itemtype.
	public ItemType getItemType() {
		return itemType;
	}

	private void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	// Method to Take UserInput
	public void initTransactionApi() {
		readAmount();
		readQuantity();
		readItemType();
	}

	// Method to accept a valid float value.

	private boolean readAmount() {
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		double amount;
		do {
			System.out.println("Please enter the cost\n");
			try {
				amount = input.nextDouble();
				quit = true;
				break;
			} catch (final InputMismatchException e) {
				System.out.println("You have enetered an invalid value.Please re enter");
				input.nextLine();
				continue;
			}
		} while (true);
		input.close();
		
		setPrice(amount);

		return quit;
	}

	// Method to accept a valid integer value for number of items

	private boolean readQuantity() {
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int quantity;
		do {
			System.out.println("Please enter the number of items\n");
			try {
				quantity = input.nextInt();
				quit = true;
				break;
			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid value.Please re enter");
				input.nextLine();
				continue;
			}
		} while (true);
		input.close();
		
		setQuantity(quantity);

		return quit;
	}

	// Method to accept a valid integer value for number of items
	private boolean readItemType() {
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		char itemtype;
		ItemType itype = ItemType.LUXURY;
		do {
			System.out.println("Enter L for luxury item and B for basic item\n");
			itemtype = input.next().charAt(0);
			switch (itemtype) {
			case 'L':
			case 'l':
				itype = ItemType.LUXURY;
				quit = true;
				break;
			case 'B':
			case 'b':
				itype = ItemType.BASIC;
				quit = true;
				break;
			default:
				System.out.println("You have entered an invalid choice. Try again with L/l or W/w.\n");
				continue;
			}

		} while (quit != true);
		input.close();
		
		setItemType(itype);

		return quit;
	}

}
