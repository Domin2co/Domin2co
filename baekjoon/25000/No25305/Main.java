package baekjoon.No25305;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nk = br.readLine();
		int n = Integer.parseInt(nk.split(" ")[0]); // 응시자 수
		int k = Integer.parseInt(nk.split(" ")[1]); // 수상자 수
		
		String grade = br.readLine(); // 성적
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(grade.split(" ")[i]);
		}
		Arrays.sort(array);
		System.out.println(array[(n-k)]);
		
	}

}