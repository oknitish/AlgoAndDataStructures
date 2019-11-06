package com.java.arrays.ArrayCoding;

public class DummyContinuousSubArraySum {
	static void findSubArray(int[] inputArray, int inputNumber) {
		// { 42, 15, 12, 8, 6, 32 }, 26);
		int L = inputArray.length;
		int sum = 0;
		int start = 0;
		for (int i = 0; i < L; i++) {
			sum = sum + inputArray[i];
			while (sum > inputNumber) {
				sum = sum - inputArray[start];
				start++;
			}
			if (sum == inputNumber) {
				for (int j = start; j <= i; j++) {
					System.out.print(inputArray[j] + ",");
				}
			}
		}
	}
	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);
		findSubArray(new int[] { 12, 5, 31, 13, 21, 8 }, 49);
		findSubArray(new int[] { 15, 51, 7, 81, 5, 11, 25 }, 41);
	}
}
