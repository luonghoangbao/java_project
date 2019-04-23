package Examples;

import java.util.Scanner;
public class mainvd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a :");
		int a = input.nextInt();
		System.out.println("Please enter b :");
		int b = input.nextInt();
		System.out.println("a + b = " + (a + b));	
		System.out.println("a - b = " + (a - b));
		System.out.println("a % b = " + (a % b));	
		System.out.println("a / b = " + (a / b));	
		System.out.println("a++ = " + (a++));	  //a++ :in ra gia tri a xong roi` tang gia' tri. no' len.
		System.out.println("++a = " + (++a));	  //++a : gia tri tang truoc' xong roi` moi' in ra.
		
		System.out.println(check(a, b));
	}
		
		public static String check(int a, int b) {
			if(a > b) {
				return " a > b ";
			}
			return " a <= b";
		}
}
