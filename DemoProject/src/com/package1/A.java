package com.package1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println(" main method ");
		try {

			int result = 10 / 0;
			System.out.println("Result: " + result);

		} catch (Exception e) {
			System.out.println("Exception caught 1:");
		}
=======
	System.out.println(" pusing the file  ");
		  try {
			  
			  int result = 10/ 0; 	
			 System.out.println("Result: " + result); 
			 
		   } catch (Exception e) {
			 System.out.println("Exception caught 1:");
		   }  
>>>>>>> 04741048988a600596b2351396e4a9a90c81902e

	}

}
