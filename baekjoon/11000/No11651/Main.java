package baekjoon.No11651;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return Integer.compare(e1[1], e2[1]);
			}else {
				return Integer.compare(e1[0], e2[0]);
			}
		});
		
		StringBuffer sb = new StringBuffer();
		for(int j=0; j<n; j++) {
			sb.append(arr[j][1] + " " + arr[j][0]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

}
