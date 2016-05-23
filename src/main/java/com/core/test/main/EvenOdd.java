package com.core.test.main;

public class EvenOdd {

	public static void main(String[] args) {
		int[] arr = { 51, 54, 32, 68, 12, 45, 76 };
		seperateEvenOdd(arr, 7);
		System.out.println("Array after segregation ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] seperateEvenOdd(int[] arr, int size) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			while (arr[left] % 2 == 0 && left < right)
				left++;

			while (arr[right] % 2 == 1 && left < right)
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}

}