package com.ap;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int elementToSearch = 6;
		int leftPos = 0;
		int rightPos = a.length - 1;
		int pos = binarySearch(elementToSearch, a, leftPos, rightPos);

		if (pos < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at position: " + pos);
		}

	}

	public static Integer binarySearch(int elementToSearch, int a[], int l, int r) {

		int midPos = Math.abs((l + r) / 2);
		int element = a[midPos];

		if (l == r) {
			return -1;
		} else if (element == elementToSearch) {
			return midPos;
		} else if (elementToSearch < element) {
			r = midPos - 1;
			return (binarySearch(elementToSearch, a, l, r));
		} else if (elementToSearch > element) {
			l = midPos + 1;
			return (binarySearch(elementToSearch, a, l, r));
		} else {
			return -1;// to avoid stackoverflow just in case if it happens
		}
	}

}
