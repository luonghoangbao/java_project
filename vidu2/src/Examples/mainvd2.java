package Examples;

import java.util.Scanner;
public class mainvd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char grade = args[0].charAt(0);
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao grade:");
		char grade = input.next().charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
			break;
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
			break;
		}
		System.out.println("Your grade is: " + grade);
	}

}
