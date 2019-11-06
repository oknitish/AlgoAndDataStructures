package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class SegregateNegativePositve {

	public static void main(String[] args) {

		int arr[] = { -1, 2, 3, -5, -9, 7 };
		int brr[] = new int[arr.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {

				brr[j++] = arr[i];

			} // scan for -ve

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {

				brr[j++] = arr[i];

			} // scan for +ve

		}

		System.out.println(Arrays.toString(brr));

	}

}
