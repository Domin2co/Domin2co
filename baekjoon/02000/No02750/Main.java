package baekjoon.No2750;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] array = new int[cnt];
		for(int i=0; i<cnt; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(array);
		for(int j=0; j<cnt; j++) {
			System.out.println(array[j]);
		}
	}

}
