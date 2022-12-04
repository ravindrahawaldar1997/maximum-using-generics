package com.bridgelabz.generics;

public class MaxToStdUsingGenerics {
	public static <T extends Comparable<T>> T max(T a, T b, T c, T d) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		if (d.compareTo(max) > 0) {
			max = d;
		}
		printMax(a, b, c, d, max);
		return max;
	}

	public static <T> void printMax(T a, T b, T c, T d, T max) {
		System.out.printf("Max of %s %s %s and %s is %s\n", a, b, c, d, max);
	}

	public static void main(String[] args) {
		Integer a1 = 500, a2 = 250, a3 = 400, a4 = 690;
		Float b1 = 10.60f, b2 = 15.80f, b3 = 58.67f, b4 = 25.96F;
		String c1 = "Apple", c2 = "Peach", c3 = "Banana", c4 = "Orage";

		max(a1, a2, a3, a4);
		max(b1, b2, b3, b4);
		max(c1, c2, c3, c4);
	}

}
