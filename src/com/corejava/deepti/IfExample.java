package com.corejava.deepti;

import java.util.Scanner;


public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String Value");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		if(!str.isEmpty()) {
			System.out.println("Entered Value is:" + str);
		}
		
		else {
			System.out.println("Value is not entered");
		}
		scanner.close();		
	}

}
