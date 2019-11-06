package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class DeleteAnElement {
public static void main(String[] args) {
	
	
	int a[]= {1,2,3,4,5};
	
	int removeIndex = 1;

	   for(int i = removeIndex; i < a.length -1; i++){
	        a[i] = a[i + 1];
	      }
	
	   System.out.println(Arrays.toString(a));
	   
}
	
}
