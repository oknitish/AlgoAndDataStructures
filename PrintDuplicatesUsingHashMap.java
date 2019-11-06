package com.java.arrays.ArrayCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintDuplicatesUsingHashMap {
//re check this problem
	public static void main(String[] args) {

		String[] strArray = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };

		String[] newArray = getDupliacate(strArray, strArray.length);

		System.out.println(Arrays.toString(newArray));

	}

	private static String[] getDupliacate(String[] strArray, int length) {

		Map<String, Integer> m = new HashMap<String, Integer>();


		for (int i = 0; i < length; i++) {

			if (m.containsKey(strArray[i])) {

				a[i] = strArray[i];

			} else {
				m.put(strArray[i], 1);

			}

		}

		return a;

	}

}
