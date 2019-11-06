package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class RemoveAllEven {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9 };

		int odd[] = removeEvenNumbers(a, a.length);

		System.out.println(Arrays.toString(odd));
	}

	private static int[] removeEvenNumbers(int[] a, int length) {

		if (a == null) {

			return null;
		}

		if (a.length == 1) {

			return a;
		}

		int oddCounter = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				oddCounter++;

			}

		}

		int[] oddResult = new int[oddCounter];

		oddCounter=0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				oddResult[oddCounter++] = a[i];
			}

			
			
		}

		return oddResult;
	}
}
