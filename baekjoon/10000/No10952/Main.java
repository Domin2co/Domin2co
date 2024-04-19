package baekjoon.No10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] ab = br.readLine().split(" ");
		int a=Integer.parseInt(ab[0]);
		int b=Integer.parseInt(ab[1]);
		System.out.println(a+b);
		while(a > 0 && b < 10){
			ab = br.readLine().split(" ");
			a=Integer.parseInt(ab[0]);
			b=Integer.parseInt(ab[1]);
			if(a > 0 && b < 10) {
				System.out.println(a+b);
			}else {
				
			}
		}
		
	}

}
