package baekjoon.No15552;

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
		
		//	정수 n
		String ns = br.readLine();
		int n = Integer.parseInt(ns);
		
		int a = 0, b = 0;
		String[] ab;
		for(int i = 0; i < n; i++) {
			ab = br.readLine().split(" ");
			a = Integer.parseInt(ab[0]);
			b = Integer.parseInt(ab[1]);
			bw.write(String.valueOf(a + b) + "\n");
		}
		bw.flush();
		br.close();
	}

}
