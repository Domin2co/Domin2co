package baekjoon.No2720;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double t = Double.parseDouble(br.readLine());
		double c = 0;
		double p = 0;
		double m = 0;
		int l = 0;
		for(int i=0; i<t; i++) {
			c = Double.parseDouble(br.readLine());
			if(c / 25 != 0) {
				m = c % 25;
				p = c / 25;
				c = m;
				l = (int)p;
				System.out.print(l + " ");
				//if(c > 0) {
					m = c % 10;
					p = c / 10;
					c = m;
					l = (int)p;
					System.out.print(l + " ");
					//if(c > 0) {
						m = c % 5;
						p = c / 5;
						c = m;
						l = (int)p;
						System.out.print(l + " ");
						//if(c > 0) {
							m = c % 1;
							p = c / 1;
							c = m;
							l = (int)p;
							System.out.println(l + " ");
						//}
					}
				}
			}
	}

