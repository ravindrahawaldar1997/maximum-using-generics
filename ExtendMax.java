package com.bridgelabz.generics;

class MaxClass {
	public  <T extends Comparable<T>> T max(T a, T b, T c, T d) {
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
		T a1 = a, a2 = b, a3 = c, a4 = d;
		// Float b1 = 1.6f, b2 = 3.4f, b3 = 5.6f, b4 = 2.8f;
		// String c1 = "Aplle", c2 = "Peach", c3 = "Banana", c4 = "Orange";
		System.out.println("Maximum values");
		System.out.printf("For  values: %s %s %s %s", a1.toString(), a2.toString(), a3.toString(), a4.toString());

	}

}
public class ExtendMax {
	public static void main(String[] args) {
		MaxClass max = new MaxClass();
		Integer a = max.max(100, 120, 200, 150);
		System.out.println("The max integer value" + a);
		Float f = max.max(5.6f, 120.8f, 200.5f, 150.9f);
		System.out.println("The max float value" + f);
		String s = max.max("Apple", "Peach", "Banana", "Orange");
		System.out.println("The max String value" + s);

	}
}
