package baekjoon.No11382;

import java.io.BufferedReader;
import java.io.IOException;
import 	java.lang.NumberFormatException;
import java.io.InputStreamReader;

/*
 * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
 * A+B+C의 값을 출력한다.
 * */
public class Main {

	/*
	 * @param args : [String[]] 매개변수
	 * */
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] number = br.readLine().split(" "); 
		try {
			
			Long a, b, c;
			//if(number.length >= 1) {
			//	if(number[0] != null) {
					a = Long.parseLong(number[0]);
			//	}
			//}
			//if(number.length >= 2) {
			//	if(number[1] != null) {
					b = Long.parseLong(number[1]);
			//	}
			//}
			//if(number.length >= 3) {
			//	if(number[2] != null) {
					c = Long.parseLong(number[2]);
			//	}
			//}
			
			//if(number.length >= 3) {
				System.out.println(a+b+c);
			//}
			
		}catch(NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
			e.printStackTrace();
		}finally {
			br.close();
		}
	}
}
