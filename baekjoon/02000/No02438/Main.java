package baekjoon.No2438;

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
		
		String ns = br.readLine();
		int n = Integer.parseInt(ns);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
	}

}
