package baekjoon.No2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ns = br.readLine();
		int n = Integer.parseInt(ns);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.printf(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		br.close();
	}
}
