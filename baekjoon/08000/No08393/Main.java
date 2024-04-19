package baekjoon.No8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ts = br.readLine();
		int t = Integer.parseInt(ts);
		
		int a = 0;
		
		for(int i = 0; i < t; i++) {
			a = a + (i+1);
		}
		System.out.println(a);

		br.close();
	}

}
