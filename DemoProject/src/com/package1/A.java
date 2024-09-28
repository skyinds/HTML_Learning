package com.package1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) {

		
		try {

			int result = 10 / 0;
			System.out.println("print Result : " + result);
			System.out.println("Final result");
			System.out.println("Take this changes ");

		} catch (Exception e) {
			System.out.println("Exception caught 1:");
		}

	}

}
