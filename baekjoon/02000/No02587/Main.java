package baekjoon.No2587;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[5];
		int total = 0;
		for(int i=0; i<5; i++) {
			array[i] = Integer.parseInt(br.readLine());
			total = total + array[i];
		}
		total = total / 5;
		Arrays.sort(array);
		System.out.println(total);
		System.out.println(array[2]);
	}

}