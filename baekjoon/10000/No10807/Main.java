package baekjoon.No10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		String[] b = br.readLine().split(" ");
		String v = br.readLine();
		int ib = 0;
		int iv = 0;
		int cnt = 0;
		for(int i=0; i<b.length; i++) {
			ib = Integer.parseInt(b[i]);
			iv = Integer.parseInt(v);
			if(ib == iv) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
