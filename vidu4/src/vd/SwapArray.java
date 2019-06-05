package vd;

public class SwapArray {
    public static int a;
    public static int b;
    public static void Swap(int a, int b){
	        int temp = a;
	        a = b;
	        b = temp;
    }
	public static void Sorta(int [] A) {
	    for(int i = 0; i < A.length-1; i++){
	        for(int j = i + 1; j < A.length; j++){
	            if(A[i] < A[j]){
	                Swap(A[i], A[j]);     
	            }
	        }
	}
}	
	public static void indayFibonacci(int n){  
	    int n1 = 0, n2 = 1, n3;  
	    if(n>0){  
	         n3 = n1 + n2;  
	         n1 = n2;  
	         n2 = n3;  
	         System.out.println(""+n3);  
	         indayFibonacci(n-1);  
	    }  
	}  
    public static void main(String[] args) {
    	int [] A = {3,5,1,9,2};
        Sorta(A);
        for(int i = 0; i < A.length; i++) {
        	System.out.println("Mang sau khi sap xep la :" + A[i]);
        }
    }
}

  


