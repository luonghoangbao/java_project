package vd;

public class Swap {
    public static int a;
	public static int b;
	//Cach 1:
    public static void S_Wap(int x, int y){
        int tem = a;
        a = b;
        b = tem;
        /*Cach 2:
          a = a + b;
          b = a - b;
          a = a - b;
       Cach 3:
       private static void S_Wap(int a, int b){
       		this.a = b;
       		this.b = a;
     */
    }
    public static void main(String[] args) {
        a = 7;
        b = 10;
        S_Wap(a,b);
        System.out.println("Gia Tri Cua a = " + a +" b = " + b) ;
        
    }
}

//Kết quả : Gia Tri Cua a = 10 b = 7


