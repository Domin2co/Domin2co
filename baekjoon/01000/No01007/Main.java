package baekjoon.No1007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 결과
	public static double result;
	
	// 조합 선택 여부
	public static boolean[] isChecked;
	
	// 점의 배열
	private static int[][] P;

	/**
	 * 메인 함수
	 * 
	 * @param args : [String[]] 매개변수
	 * 
	 * @throws IOException 데이터 입출력 예외
	 * 
	 * */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 케이스 수
		int T = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < T; i++) {
			// 점의 개수
			int N = Integer.parseInt(reader.readLine());
			
			result = Double.MAX_VALUE;
			
			isChecked = new boolean[N];
			
			P = new int[N][2];
			
			for(int j = 0; j < N; j++) {
				String[] temp = reader.readLine().split(" ");
				
				P[j][0] = Integer.parseInt(temp[0]);
				P[j][1] = Integer.parseInt(temp[1]);
			}
			
			combination(0, N / 2);
			
			System.out.println(result);
		}
		reader.close();
	}

	/**
	 * 조합 함수
	 * 
	 * @param index : [int] 인덱스
	 * @param count : [int] 조합할 원소 개수
	 * 
	 * */
	private static void combination(int index, int count) {
		// TODO Auto-generated method stub
		
		//조합할 원소 개수가 더 이상 없을 경우
		if(count ==0) {
			result = Math.min(result, getVector());
		}else {
			for(int i = index; i < P.length; i++) {
				isChecked[i] = true;
				combination(i + 1, count - 1);
				isChecked[i] = false;
			}
		}
	}
	
	/**
	 * 
	 * @return [double] 벡터 크기
	 * */
	private static double getVector() {
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < P.length; i++) {
			
			//	양수로 선택될 점 일 경우
			if(isChecked[i]) {
				x += P[i][0];
				y += P[i][1];
			}else {
				x -= P[i][0];
				y -= P[i][1];
			}
		}
		
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

}
