package baekjoon.No2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String rs = "";
		String s = "";
		String[] so;
		String p = "";
		int r =0;
		String[] total = new String[t];
		for(int i =0; i <t; i++) {
			p= "";
			rs = br.readLine();
			r = Integer.parseInt(rs.split(" ")[0]);
			s = rs.split(" ")[1];
			so = s.split("");
			for (int j=0; j<so.length; j++) {
				for(int k=0; k<r; k++) {
					p= p + so[j];
				}
			}
			total[i] = p;
		}
		for(int m=0; m<=total.length -1; m++) {
			System.out.println(total[m]);
		}
	}

}
