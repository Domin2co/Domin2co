package baekjoon.No1436;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int cnt0 =0;
		int num = 0;
		String snum = "";
		for(int i=0; i<cnt; i++) {
			while(cnt0 < cnt) {
				snum = String.valueOf(num);
				if(snum.indexOf("666") > -1) {
					cnt0++;
				}
				num++;
			}
		}
		System.out.println(snum);
		br.close();
	}

}
