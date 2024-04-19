package baekjoon.No24267;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long cnt = 0;
		System.out.println((n*(n-1)*(n-2))/6);
		System.out.println(3);
		br.close();
	}

}
