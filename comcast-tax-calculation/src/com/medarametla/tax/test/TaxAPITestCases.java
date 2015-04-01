package com.medarametla.tax.test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.medarametla.tax.TaxAPI;

public class TaxAPITestCases {
	// Test calculateLuxuryItemTax()
	TaxAPI taxApi = new TaxAPI();
	// Testing for both price and quantity to be zero.
	double withLuxuryItemTax1 = taxApi.calculateLuxuryItemTax(0, 0);
	double luxuryTax1 = 0;
	// Testing for both price as 10, and quantity as zero.
	double withLuxuryItemTax2 = taxApi.calculateLuxuryItemTax(10, 0);
	double luxuryTax2 = 0;
	// Test with price as 1, quantity as -1.
	double withLuxuryItemTax3 = taxApi.calculateLuxuryItemTax(1, -1);
	double luxuryTax3 = -1.01;
	// Test with price as -1, quantity as -1.
	double withLuxuryItemTax4 = taxApi.calculateLuxuryItemTax(-1, -1);
	double luxuryTax4 = 1.01;

	// Test calculateBasicItemTax()
	// Test with price and quantity to be zero.
	double withBasicItemTax1 = taxApi.calculateBasicItemTax(0, 0);
	double basicTax1 = 0;
	// Test with price 10, quantity to be zero.
	double withBasicItemTax2 = taxApi.calculateBasicItemTax(10, 0);
	double basicTax2 = 0;
	// Test with price as 1, quantity as -1.
	double withBasicItemTax3 = taxApi.calculateLuxuryItemTax(1, -1);
	double basicTax3 = -1.01;
	// Test with price as -1, quantity as -1.
	double withBasicItemTax4 = taxApi.calculateLuxuryItemTax(-1, -1);
	double basicTax4 = 1.01;

	@Test
	public void TestLuxTax() {
		System.out.println("@Test TestLuxTax: " + withLuxuryItemTax1 + " = " + luxuryTax1);
		AssertJUnit.assertEquals(withLuxuryItemTax1, luxuryTax1);
		
		System.out.println("@Test TestLuxTax: " + withLuxuryItemTax2 + " = " + luxuryTax2);
		AssertJUnit.assertEquals(withLuxuryItemTax2, luxuryTax2);
		
		System.out.println("@Test TestLuxTax: " + withLuxuryItemTax3 + " = " + luxuryTax3);
		AssertJUnit.assertEquals(withLuxuryItemTax3, luxuryTax3);
		
		System.out.println("@Test TestLuxTax: " + withLuxuryItemTax4 + " = " + luxuryTax4);
		AssertJUnit.assertEquals(withLuxuryItemTax4, luxuryTax4);
	}

	@Test
	public void TestBasicTax() {
		System.out.println("@Test TestLuxTax: " + withBasicItemTax1 + " = " + basicTax1);
		AssertJUnit.assertEquals(withBasicItemTax1, basicTax1);
		
		System.out.println("@Test TestLuxTax: " + withBasicItemTax2 + " = " + basicTax2);
		AssertJUnit.assertEquals(withBasicItemTax2, basicTax2);
		
		System.out.println("@Test TestLuxTax: " + withBasicItemTax3 + " = " + basicTax3);
		AssertJUnit.assertEquals(withBasicItemTax3, basicTax3);
		
		System.out.println("@Test TestLuxTax: " + withBasicItemTax4 + " = " + basicTax4);
		AssertJUnit.assertEquals(withBasicItemTax4, basicTax4);

	}
}
