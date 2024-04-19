package baekjoon.No2839;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//double sugar = Double.parseDouble(br.readLine());	//	설탕무게
		int sugar = Integer.parseInt(br.readLine());	//	설탕무게
		
		if (sugar == 4 || sugar == 7) {
			System.out.println(-1);
		}
		else if (sugar % 5 == 0) {
			System.out.println(sugar / 5);
		}
		else if (sugar % 5 == 1 || sugar % 5 == 3) {
			System.out.println((sugar / 5) + 1);
		}
		else if (sugar % 5 == 2 || sugar % 5 == 4) {
			System.out.println((sugar / 5) + 2);
		}
		br.close();
	}
}