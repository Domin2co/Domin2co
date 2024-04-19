package baekjoon.No2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] hours = br.readLine().split(" ");
		String oventime = br.readLine();
		int hour = Integer.parseInt(hours[0]);
		int min = Integer.parseInt(hours[1]);
		int ovenmin = Integer.parseInt(oventime);
		
		int totalmin = (hour * 60) + min + ovenmin;
		
		int resultHour = totalmin / 60;
		
		int resultMin = totalmin - (resultHour * 60);
		
		if(resultHour >= 24) {
			resultHour = resultHour - 24;
		}
		System.out.println(resultHour + " " + resultMin);
		

		br.close();
	}

}
