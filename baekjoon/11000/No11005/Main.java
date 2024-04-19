package baekjoon.No11005;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nb = br.readLine();
		int n = Integer.parseInt(nb.split(" ")[0]);
		int b = Integer.parseInt(nb.split(" ")[1]);
		
		System.out.println((Integer.toString(n,b)).toUpperCase());
	}

}