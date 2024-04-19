package baekjoon.No2745;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nb = br.readLine();
		int a = Integer.parseUnsignedInt(nb.split(" ")[0], Integer.parseInt(nb.split(" ")[1]));
		System.out.println(a);
	}

}
