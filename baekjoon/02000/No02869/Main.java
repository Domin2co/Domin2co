package baekjoon.No2869;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String abv = br.readLine();
		double a = Double.parseDouble(abv.split(" ")[0]);
		double b = Double.parseDouble(abv.split(" ")[1]);
		double v = Double.parseDouble(abv.split(" ")[2]);
		int day = 1;
		/*while(true) {
			if(day*(a-b) + b >= v) {
				System.out.println(day);
				break;
			}else {
				day++;
			}
		}*/
		/*for(int i=day; i*(a-b)< v; i++) {
			if(i*(a-b) + b >= v) {
				System.out.println(i);
				break;
			}
		}*/
		System.out.println((int)Math.ceil((v-b) / (a-b)));
		
	}

}
