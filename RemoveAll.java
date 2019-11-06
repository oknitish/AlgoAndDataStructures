package com.java.arrays.ArrayCoding;

import java.util.Arrays;

public class RemoveAll {

	//warning:  recheck this problem
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		
		int removeIndex = 1;

		   for(int i = 0; i < a.length ; i++){
		        a[i] = 0;
		      }
		
		   System.out.println(Arrays.toString(a));
		
	}
	
}
