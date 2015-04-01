package com.medarametla.tax.test;

import com.medarametla.tax.TaxAPI;
import com.medarametla.tax.TransactionAPI;

public class TestTaxAPI {

	public static void main(String[] args) {
		double finalPrice = 0;

		System.out.println("Welcome to Sales Tax Calculator\n");
		System.out.println(" Tax rate for Luxury item is 9 % and Basic item is 1%\n");
		
		TransactionAPI transactionApi = new TransactionAPI();
		TaxAPI taxApi = new TaxAPI();
		
		transactionApi.initTransactionApi();
		// Check if the item type is luxury item and call its method.
		if (transactionApi.getItemType() == TransactionAPI.ItemType.LUXURY) {
			finalPrice = taxApi.calculateLuxuryItemTax(transactionApi.getPrice(), transactionApi.getQuantity());

		}
		// Check if the item type is basic item and call its method.
		else if (transactionApi.getItemType() == TransactionAPI.ItemType.BASIC) {
			finalPrice = taxApi.calculateBasicItemTax(transactionApi.getPrice(),transactionApi.getQuantity());
		}
		System.out.print("The final price of the  items in cents : " + finalPrice);
	}

}
