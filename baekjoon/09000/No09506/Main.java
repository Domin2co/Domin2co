package baekjoon.No9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n  = Integer.parseInt(br.readLine());
			if(n == -1) {
				break;
			}
			int total=0;
			int count=0;
			int[] narr = new int[n];
			for(int i=1; i<n; i++) {
				if(n % i ==0) {
					total += i;
					narr[count] = i;
					count++;
				}
			}

			if(n == total) {
				System.out.print(n +" = ");
				for(int j=0; j<count; j++) {
					if(j > 0) {
						System.out.print(" + ");
					}
					System.out.print(narr[j]);
				}
				System.out.println("");
			}else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}

}
