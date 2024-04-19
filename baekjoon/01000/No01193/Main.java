package baekjoon.No1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a=1;
		int b=0;
		while(true) {
			if(n<=a+b) {
				if(a % 2 == 1) {
					System.out.println((a - (n-b-1)) + "/" + (n-b));
					break;
				}else {
					System.out.println((n-b)+ "/"+(a - (n-b-1)));
					break;
				}
			}else {
				b+=a;
				a++;
			}
		}
	}

}
