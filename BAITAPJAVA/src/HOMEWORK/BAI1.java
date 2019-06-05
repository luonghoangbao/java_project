//Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b
package HOMEWORK;

import java.util.Scanner;
//cach 1
public class BAI1 {
	public static int a;
	public static int b;
	public static int UCLN(int a, int b) {	
		// Nếu a = 0 => ucln(a,b) = b
	    // Nếu b = 0 => ucln(a,b) = a
	    if (a == 0 || b == 0){
	        return a + b;
	    }
	    // Lặp tới khi 1 trong 2 số bằng 0
	    while (a*b != 0){
	        if (a > b){
	            a %= b; // a = a % b
	        }else{
	            b %= a;
	        }
	    }
	    return a + b; // return a + b, bởi vì lúc này hoặc a hoặc b đã bằng 0.
	}
	public static int Nhap() {
		int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();
         
        while ((a < 0) || (b < 0)) {
            System.out.println("Bạn đã nhập sai, hãy nhập lại hai số nguyên dương!");
            System.out.println("Nhập vào số thứ nhất: ");
            a = scanner.nextInt();
            System.out.println("Nhập vào số thứ hai: ");
            b = scanner.nextInt();
        }
        return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		System.out.println("UCLN of " +a +" and " +b +" is :" +	UCLN(a, b));
		System.out.println("BCNN of " +a +" and " +b +" is :" +	((+a * +b) / UCLN(a, b)) ); //bội chung nhỏ nhất
	}
}

//cach 2
/*public static int nhap(){
	Scanner input = new Scanner(System.in); 
  	boolean check= false;
	int n=0; 
    while(!check){
		System.out.print(" "); 
		//Catching exceptions
        try{
			n= input.nextInt(); 
            check= true;
        }catch(Exception e){
			System.out.println("Ban phai nhap so! hay nhap lai..."); 
            input.nextLine();
        }
    }
    return (n);
}
public static int UCLN(int a, int b){
            while(a!= b){
				if(a>b) a= a-b; 
                else b= b-a;
           }
           return (a);
  }
public static void main(String[] args){ 
	System.out.println("Nhap a");
	int a = nhap(); 
	System.out.println("Nhap b"); 
    int b= nhap();
	System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b)); 
         System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
	}
}
*/
