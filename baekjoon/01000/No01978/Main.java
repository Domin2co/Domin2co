package baekjoon.No1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		boolean cnt = false;
		String num = br.readLine();
		for(int i=0; i<n; i++) {
			int snum = Integer.parseInt(num.split(" ")[i]);
			for(int j=1; j<snum; j++) {
				if(j > 1 && snum % j ==0) {
					cnt = true;
				}
			}
			if(snum == 1 || snum == 2) {
				cnt = true;
			}
			if(!cnt) {
				count++;
			}
			cnt = false;
		}
		System.out.println(count);
	}

}
