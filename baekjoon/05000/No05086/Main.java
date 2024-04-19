package baekjoon.No5086;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0, b=0;
		
		while(true) {
			String ab = br.readLine();
			a = Integer.parseInt(ab.split(" ")[0]);
			b = Integer.parseInt(ab.split(" ")[1]);
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(b % a == 0) {
				System.out.println("factor");
			}else if(a % b == 0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
	}

}
