package Examples;

import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String fullName1 = input1.next();    			//next la in ra chu dau ( luong hoang bao = luong)
		System.out.println("Your fullName is : " + fullName1);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your name : ");        
		String fullName2 = input2.nextLine();            //nextLine la in ra full ten ( luong hoang bao = luong hoang bao)
		System.out.println("Your fullName is : " + fullName2);
		
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter double: ");
    	double myDouble = input3.nextDouble();
    	System.out.println("Double entered: " + myDouble);
    	
    	Scanner input4 = new Scanner(System.in);
    	System.out.print("Enter float: ");
    	float myFloat = input4.nextFloat();
    	System.out.println("Float entered : " + myFloat);
    	
    	Scanner input5 = new Scanner(System.in);
    	System.out.print("Enter an integer: ");
    	int number = input5.nextInt();
    	System.out.println("You entered : " + number);
	}

}
