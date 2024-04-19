package baekjoon.No10989;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int value : arr) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

}
