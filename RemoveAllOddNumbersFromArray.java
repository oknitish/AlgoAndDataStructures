package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class RemoveAllOddNumbersFromArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9 };

		int odd[] = removeOddNumbers(a, a.length);

		System.out.println(Arrays.toString(odd));
	}

	private static int[] removeOddNumbers(int[] a, int length) {

		if (a == null) {

			return null;
		}

		if (a.length == 1) {

			return a;
		}

		int evenCounter = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				evenCounter++;

			}

		}

		int[] evenResult = new int[evenCounter];

		evenCounter = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				evenResult[evenCounter++] = a[i];
			}

		}

		return evenResult;
	}

}
