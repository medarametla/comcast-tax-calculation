// TaxAPI has methods to calculate basic and luxury tax.
package com.medarametla.tax;

public class TaxAPI {

	private double luxuryItemTax = 0.01;
	private double basicItemTax = 0.09;

	public TaxAPI() {

	}
	
	public double getLuxuryItemTax() {
		System.out.println("getLuxuryItemTax");
		return luxuryItemTax;
	}
	
	public double getBasicItemTax() {
		return basicItemTax;
	}

	// Method to calculate luxury tax.
	/**
	 * @param price
	 * @param quantity
	 * @return
	 */
	public double calculateLuxuryItemTax(double price, int quantity) {
		double finalPrice;
		finalPrice = price * quantity * (1 + getLuxuryItemTax());
		return finalPrice;
	}

	// method to calculate basic tax.
	/**
	 * @param price
	 * @param quantity
	 * @return
	 */
	public double calculateBasicItemTax(double price, int quantity) {
		double finalPrice;
		finalPrice = price * quantity * (1 + getBasicItemTax());
		return finalPrice;
	}

}
