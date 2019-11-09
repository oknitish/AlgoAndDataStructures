package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class ArrayRotateRight {

	// 1,2,3,4,5
	// 5,1,2,3,4 one right operation
	// 4,5,1,2,3 two right operation
	public static void main(String[] args) {

		int anArray[] = { 1, 2, 3, 4, 5 };

		int temp = anArray[anArray.length - 1];
		for (int i = anArray.length - 1; i > 0; i--) {
			anArray[i] = anArray[i - 1];
		}
		anArray[0] = temp;

		System.out.println(Arrays.toString(anArray));
	}

}
