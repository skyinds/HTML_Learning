package com.package1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		System.out.println(" main method ");
		try {

			int result = 10 / 0;
			System.out.println("Result: " + result);
			System.out.println("Final result");

		} catch (Exception e) {
			System.out.println("Exception caught 1:");
		}

	}

}
