package baekjoon.No25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//	정수 n
		String ns = br.readLine();
		int n = Integer.parseInt(ns);
		
		String type ="int";
		for(int i = 0; i < n; i++) {
			if(i % 4 == 0) {
				type = "long " + type;
			}
		}
		
		System.out.println(type);


		br.close();
	}

}
