package baekjoon.No2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] hours = br.readLine().split(" ");
		int hour = Integer.parseInt(hours[0]);
		int min = Integer.parseInt(hours[1]);
		
		if(min < 45) {
			if(hour != 0) {
				hour = hour - 1;
			}else if(hour == 0) {
				hour = 23;
			}
			min = min + 60;
		}
		
		min = min - 45;
		
		System.out.println(hour + " " + min);

		br.close();
	}

}
