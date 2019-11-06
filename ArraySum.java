package com.java.arrays.ArrayCoding;

public class ArraySum {
public static void main(String[] args) {
	
	// arary subarray SUM PROBLEM
	int []arr= {1,2,5,3,8,6,9,7};
	
	int search=10;
	 
	    subArrayIndex(arr,search);
	    
	
	
	
	
	
}

private static void subArrayIndex(int[] arr, int search) {
	
	for(int i=0;i<=arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			
			if(arr[i]+arr[j]==search) {
				
				System.out.println("["+i+"," +j+"]");
			}
			
			
			
		}
			
		
		
	}
	
	
	
	
	
	
}
}
