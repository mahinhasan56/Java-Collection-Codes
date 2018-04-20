package com.FaysalBinHasan;

import java.util.*;

public class TreeSetDemo2 {
	public static void main(String args[]) {
		// Create a tree set
		TreeSet<A> ts = new TreeSet<A>(new MyComp());
		// Add elements to the tree set
		ts.add(new A(1));
		ts.add(new A(5));
		ts.add(new A(4));
		ts.add(new A(2));
		ts.add(new A(3));

		System.out.println(ts);
	}
}

class A {

	int i;

	public A(int i) {
		this.i = i;
	}

	public String toString() {
		return "value: " + i;
	}
}

class MyComp implements Comparator<A> {

	public int compare(A a1, A a2) {
		if (a1.i == a2.i) {
			return 0;
		} else if (a1.i > a2.i) {
			return a1.i - a2.i;
		} else {
			return a1.i - a2.i;
		}

	}
}
