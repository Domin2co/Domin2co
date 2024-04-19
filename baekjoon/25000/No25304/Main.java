package baekjoon.No25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//	총 구매 금액
		String totalMoneys = br.readLine();
		int totalMoney = Integer.parseInt(totalMoneys);
		
		//	물건 개수
		String kinds = br.readLine();
		int kind = Integer.parseInt(kinds);
		
		String[] items;
		int realBuyMoney = 0;
		for(int i = 0; i < kind; i++) {
			items = br.readLine().split(" ");
			realBuyMoney += Integer.parseInt(items[0]) * Integer.parseInt(items[1]);
		}
		if(totalMoney == realBuyMoney) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		br.close();
	}

}
