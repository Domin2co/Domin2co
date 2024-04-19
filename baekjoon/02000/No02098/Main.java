package baekjoon.No2098;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String a = n.split(" ")[0];
		String b = n.split(" ")[1];
		StringBuffer sb1 = new StringBuffer(a);
		StringBuffer sb2 = new StringBuffer(b);
		a= sb1.reverse().toString();
		b= sb2.reverse().toString();
		
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		
		if(ai > bi) {
			System.out.println(ai);
		}else if(bi > ai) {
			System.out.println(bi);
		}
	}

}
