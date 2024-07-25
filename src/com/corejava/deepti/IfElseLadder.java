package com.corejava.deepti;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student's Name");
		String studentName = scanner.nextLine();
		
		
		System.out.println("Enter Student's Score ");		
//		String str = scanner.nextLine();
		int score = scanner.nextInt();
		System.out.println("Student's Score is:" + score);
		if(score >= 85 && score < 100) {
			System.out.println("Hi" + studentName);
			System.out.println("Yuppiieee !! You scored highest Marks.");
		}
		
		else if(score >= 65 && score < 85){
			System.out.println("Congratulations !! You scored second highest Marks");
		}
		else if(score >= 50 && score < 65)
		{
			System.out.println("You are in C Class:");
		}
		else {
			System.out.println("Failed !!");
		}
		scanner.close();
	}

}
