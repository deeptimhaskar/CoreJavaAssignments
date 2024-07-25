package com.corejava.deepti;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student's Name");
		String studentName = scanner.nextLine();
		
		
		System.out.println("Enter Student's Score ");		
//		String str = scanner.nextLine();
		int score = scanner.nextInt();
		System.out.println("Student's Score is:" + score);
		switch(score/10) {
		
		case 9:
		case 8: {
			System.out.println("Hi" + studentName);
			System.out.println("Yuppiieee !! You scored highest Marks.");
			break;
		}
		
		case 7:
		case 6 : {
			System.out.println("Hi" + studentName);
			System.out.println("Congratulations !! You scored second highest Marks");
			break;
		}			
		
		case 5: 		{
			System.out.println("You are in C Class:");
			break;
		}
		
		default:  {
			System.out.println("Failed !!");
		}
		
		scanner.close();
		}

	}

}
