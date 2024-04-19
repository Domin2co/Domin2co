package baekjoon.No1427;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String n = br.readLine();
		String[] arr = new String[n.length()];
		for(int i=0; i<n.length(); i++) {
			arr[i] = n.split("")[i];
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(String value : arr) {
			sb.append(value);
		}
		System.out.println(sb);
		br.close();
	}

}
