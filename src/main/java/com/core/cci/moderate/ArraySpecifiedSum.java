package com.core.cci.moderate;

import java.io.IOException;
import java.util.Arrays;

/**
 * Find all the combinations of numbers in an array 
 * whose sum is equal to a specified number.
 * Example - In [1, 2, 3, 4, 5, 6, 7, 8, 9], for specified number 10: 
 * The output should be (1 + 9), (2 + 8), (3 + 7), (4 + 6)
 * @author Jatin Sehgal <v-jsehgal@expedia.com>
 *
 */
public class ArraySpecifiedSum {

	public static void main(String[] args) throws IOException {
		int[] numbers = {1, 2, 3, 7, 4, 9, 5, 6, 8};
		printSpecifiedSum(numbers, 10);
	}
	
	public static void printSpecifiedSum(int[] numbers, int sum) {
		Arrays.sort(numbers);
		int first = 0;
		int last = numbers.length-1;
		while(first < last) {
			if(numbers[first] + numbers[last] == sum) {
				System.out.println(numbers[first] + " + " + numbers[last] + " = " + sum);
				first++;
				last--;
			} else if(numbers[first] + numbers[last] < sum){
				first++;
			} else {
				last--;
			}
		}
	}
}
