package baekjoon.No2588;
import java.util.Scanner;

public class Main{

	/**
	 * @param args : [String[]] 매개변수
	 * */
    public static void main(String args[]){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        
        String bString = String.valueOf(B);
        String bString1 = bString.substring(0, 1);
        String bString2 = bString.substring(1, 2);
        String bString3 = bString.substring(2, 3);
        
        int b1 = Integer.parseInt(bString1);
        int b2 = Integer.parseInt(bString2);
        int b3 = Integer.parseInt(bString3);
        System.out.println(A*b3);
        System.out.println(A*b2);
        System.out.println(A*b1);
        System.out.println(A*B);
    }
}