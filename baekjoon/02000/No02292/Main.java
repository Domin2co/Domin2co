package baekjoon.No2292;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		if (a == 1) {
			System.out.println(1);
		}else {
			while(range<=a) {
				range = range + (6*count);
				count++;
			}
			System.out.println(count);
		}
	}

}
