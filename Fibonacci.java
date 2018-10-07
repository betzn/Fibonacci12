/*
 * Fibonacci.java
 * 
 * The following program uses a for loop to compute and print out the first 12 Fibonacci numbers.
 * 
 * By Nathan Betz
 */
package Fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		for (int a = 0, b = 1, i = 1; i <= 12; i++) {
			System.out.println(b + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
