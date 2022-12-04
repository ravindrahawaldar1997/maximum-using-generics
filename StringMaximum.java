package com.bridgelabz.generics;

public class StringMaximum {
	public static <T extends Comparable<T>> T max(T d, T e, T f) {
		T max = d;
		if (e.compareTo(max) > 0) {
			max = e;
		}
		if (f.compareTo(max) > 0) {
			max = f;
		}
		printMax(d, e, f, max);
		return max;
	}

	public static <T> void printMax(T d, T e, T f, T max) {
		System.out.printf("Max of %s %s and %s is %s\n", d, e, f, max);
	}

	public static void main(String[] args) {
		String d="Apple", e="Peach", f="Banana";
		System.out.println("For String Values");
		max(d, e, f);
	}

	
}
