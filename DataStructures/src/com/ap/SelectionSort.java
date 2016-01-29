package com.ap;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int l = 0;
		int r = a.length - 1;

		selectionSort(a, l, r);

	}

	public static void selectionSort(int a[], int l, int r) {

		int newArr[] = new int[a.length];
		for (int i = l; i <= r; i++) {
			l = i;
			newArr = getMin(a, l, r);
		}

		for (int i = 0; i <= newArr.length - 1; i++) {
			System.out.println(newArr[i]);
		}
	}

	public static int[] getMin(int a[], int l, int r) {

		int min = a[l];
		int pos = l;
		for (int i = l; i <= r; i++) {
			if (a[i] < min) {
				min = a[i];
				pos = i;
			}
		}

		int temp;

		temp = a[l];
		a[l] = a[pos];
		a[pos] = temp;

		return a;
	}
}
