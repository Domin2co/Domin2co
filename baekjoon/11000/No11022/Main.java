package baekjoon.No11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String ts = br.readLine();
		int t = Integer.parseInt(ts);
		
		String ab[];
		int a=0, b=0;
		for(int i = 0; i < t; i++) {
			ab = br.readLine().split(" ");
			a = Integer.parseInt(ab[0]);
			b = Integer.parseInt(ab[1]);
			bw.write("Case #"+ String.valueOf(i+1) + ": " + String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(a+b) + "\n");
		}
		
		bw.flush();
		br.close();
	}

}
