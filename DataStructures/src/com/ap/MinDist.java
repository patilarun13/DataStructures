package com.ap;

public class MinDist {

	public static void main(String[] args) {
		char a[] = { 'a', 'c', 'd', 'e', 'a' };
		char first = 'a';
		char sec = 'd';
		System.out.println("Min distance is: " + getMinDist(a, first, sec));
	}

	public static Integer getMinDist(char a[], char f, char s) {

		int min = a.length;
		if (f == s) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == f && a[j] == s) {
					int currMin = Math.abs(i - j);
					if (currMin < min) {
						min = currMin;
					}
				}
			}
		}

		return min;

	}

}
