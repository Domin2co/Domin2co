package baekjoon.No2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int result = 0;
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int x=0; x<n; x++) {
			for(int y=x+1; y<n; y++) {
				for(int z=x+2; z<n; z++) {
					if(x != y && y != z && x != z) {
						if(m >= arr[x] + arr[y] + arr[z] && (arr[x] + arr[y] + arr[z]) > result) {
							result = arr[x] + arr[y] + arr[z];
						}
					}
				}
			}
		}
		
		System.out.println(result);	
	}

}
