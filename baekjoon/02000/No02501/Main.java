package baekjoon.No2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nk = br.readLine();
		int n = Integer.parseInt(nk.split(" ")[0]);
		int k = Integer.parseInt(nk.split(" ")[1]);
		int count = 0;
		for(int i =1; i <= n; i ++) {
			if(n % i == 0) {
				count++;
				if(count == k) {
					System.out.println(i);
				}
			}
			if(i == n && count < k) {
				System.out.println(0);
			}
		}
	}

}
