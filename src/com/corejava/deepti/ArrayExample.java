package com.corejava.deepti;

import java.util.Scanner;

public class ArrayExample {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of array elements");
		// declare & initialize an array
		int n = scanner.nextInt();
		int[] arrayNumbers = new int[n];

		// input array elements
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			arrayNumbers[i] = scanner.nextInt(); // elements entered and stored in arrayNumbers
		}
		// calculate highest number in array
		int max = arrayNumbers[0];
		for (int i = 0; i < n; i++) {
			if (arrayNumbers[i] > max)
				max = arrayNumbers[i];
		}

		// calculate lowest number in array
		int min = arrayNumbers[0];
		for (int i = 0; i < n; i++) {
			if (arrayNumbers[i] < min)
				min = arrayNumbers[i];
		}

		//average of array elements
		int sum  =0;
		for (int i =0; i<n;i++) 
		{
			sum +=arrayNumbers[i];
		}
		double average = (double)sum /n; // average
		
		System.out.println("Highest Number" + max);
		System.out.println("Lowest  Number" + min);
		System.out.println("Average of Numbers" + average);
		
		scanner.close();

	}

}
