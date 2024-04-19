package baekjoon.No1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int a = 0;
		if(n.split(" ").length > 0) {
			a = n.split(" ").length;
			if(n.split(" ")[0] == "") {
				a = a-1;
			}
		}
		System.out.println(a);
	}

}