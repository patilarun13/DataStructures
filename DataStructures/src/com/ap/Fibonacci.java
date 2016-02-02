package com.ap;

public class Fibonacci {

	public static void main(String[] args) {

		int last = 0;
		int current = 1;
		int lasttolast;
		int i = 0;

		while (i <= 10) {
			if (i <= 1) {
				System.out.println(i);
			} else {
				lasttolast = last;
				last = current;
				current = last + lasttolast;
				System.out.println(current);
			}

			i++;
		}
	}
}
