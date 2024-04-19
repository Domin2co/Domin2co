package baekjoon.No19532;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int a = Integer.parseInt(num.split(" ")[0]);
		int b = Integer.parseInt(num.split(" ")[1]);
		int c = Integer.parseInt(num.split(" ")[2]);
		int d = Integer.parseInt(num.split(" ")[3]);
		int e = Integer.parseInt(num.split(" ")[4]);
		int f = Integer.parseInt(num.split(" ")[5]);
		
		//각각의 x, y가 -999 <= x, y <= 999이기 때문에
        for(int i = -999; i <= 999; i++) { 
            for(int j = -999; j <= 999; j++) {
                if(a*i + b*j  == c){ // ax + by 가 C이고(x = i, y = j)
                    if(d*i + e*j  == f) { // dx + ey가 f일 때(x = i, y = j)
                        System.out.println(i + " " + j + "\n");
                        break;
                    }
                }
            }
        }
	}

}