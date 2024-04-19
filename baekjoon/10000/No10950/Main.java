package baekjoon.No10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ts = br.readLine();
		int t = Integer.parseInt(ts);
		
		String[] nums;
		int a,b;
		
		for(int i = 0; i < t; i++) {
			nums = br.readLine().split(" ");
			a = Integer.parseInt(nums[0]);
			b = Integer.parseInt(nums[1]);
			
			System.out.println(a+b);
		}
		

		br.close();
	}

}
