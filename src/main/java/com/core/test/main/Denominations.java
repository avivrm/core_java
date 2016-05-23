package com.core.test.main;

import java.io.IOException;

class Denominations {
	public static void main(String args[]) throws IOException {
		int den[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 }; // storing all the
																// denominations
																// in an array
		System.out.print("Enter any Amount: "); // Entering an amount
		int amount = 722;

		int copy = amount; // Making a copy of the amount
		int totalNotes = 0, count = 0;

		System.out.println("\nDENOMINATIONS: \n");

		for (int i = 0; i < den.length; i++) // Since there are 9 different types of
									// notes, hence we check for each note.
		{
			count = amount / den[i]; // counting number of den[i] notes
			if (count != 0) // printing that denomination if the count is not
							// zero
			{
				System.out.println(den[i] + "\tx\t" + count + "\t= " + den[i]
						* count);
			}
			totalNotes = totalNotes + count; // finding the total number of
												// notes
			amount = amount % den[i]; // finding the remaining amount whose
										// denomination is to be found
			System.out.println(amount);
		}

		System.out.println("--------------------------------");
		System.out.println("TOTAL\t\t\t= " + copy); // printing the total amount
		System.out.println("--------------------------------");
		System.out.println("Total Number of Notes\t= " + totalNotes); // printing
																		// the
																		// total
																		// number
																		// of
																		// notes
	}
}