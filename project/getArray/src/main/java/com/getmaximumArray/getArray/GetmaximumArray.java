package com.getmaximumArray.getArray;

public class GetmaximumArray {

	public static int getMaximum(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		return max;
	}

}
