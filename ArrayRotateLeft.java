package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class ArrayRotateLeft {

	// 1,2,3,4,5

	public static void main(String[] args) {

		int anArray[] = { 1, 2, 3, 4, 5 };

		int temp = anArray[0];

		for (int i = 0; i < anArray.length - 1; i++) {
			anArray[i] = anArray[i + 1];
		}
		anArray[anArray.length - 1] = temp;

		System.out.println(Arrays.toString(anArray));
	}

}
