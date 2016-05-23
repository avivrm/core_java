package com.core.test.main;

/*
 * http://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
 */

public class Rearrange {
	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		// Arrays.sort(numbers);
		int arrSize = 8;

		int pos = 0;
		int current = numbers[pos];
		int next = -1;

		while (true) {
			int newPos = getNewPos(pos, arrSize);
			next = numbers[newPos]; 			// Number present at new position
			numbers[newPos] = -current; 		// Push original number here.
			current = next; 					// Pick number at new position as new tmp
			pos = newPos; 						// Jump to new Pointer

			if (current < 0) {
				pos = getNewPos(numbers);

				if (pos == Integer.MAX_VALUE) {
					break;
				} else {
					current = numbers[pos];
				}
			}
		}

		for (int i = 0; i < arrSize; i++) {
			if (numbers[i] < 0) {
				numbers[i] = -numbers[i];
			}
		}

		printArray(numbers);

	}

	public static int getNewPos(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static int getNewPos(int currPos, int arraySize) {
		int end = arraySize - 1;
		return (currPos < arraySize / 2) ? currPos * 2 + 1
				: 2 * (end - currPos);
	}

	public static void swap(int from, int to, int[] tokens) {
		int tmp = tokens[from];
		tokens[from] = tokens[to];
		tokens[to] = tmp;
	}
}
