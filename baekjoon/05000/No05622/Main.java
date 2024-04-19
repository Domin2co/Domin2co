package baekjoon.No5622;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		String[] dials = dial.split("");
		int time = 0;
		for(int i =0; i<dials.length; i++) {
			if (dials[i].indexOf("A")>-1 || dials[i].indexOf("B")>-1 || dials[i].indexOf("C")>-1) {
				time = time + 3;
			}else if (dials[i].indexOf("D")>-1 || dials[i].indexOf("E")>-1 || dials[i].indexOf("F")>-1) {
				time = time + 4;
			}else if (dials[i].indexOf("G")>-1 || dials[i].indexOf("H")>-1 || dials[i].indexOf("I")>-1) {
				time = time + 5;
			}else if (dials[i].indexOf("J")>-1 || dials[i].indexOf("K")>-1 || dials[i].indexOf("L")>-1) {
				time = time + 6;
			}else if (dials[i].indexOf("M")>-1 || dials[i].indexOf("N")>-1 || dials[i].indexOf("O")>-1) {
				time = time + 7;
			}else if (dials[i].indexOf("P")>-1 || dials[i].indexOf("Q")>-1 || dials[i].indexOf("R")>-1 || dials[i].indexOf("S")>-1) {
				time = time + 8;
			}else if (dials[i].indexOf("T")>-1 || dials[i].indexOf("U")>-1 || dials[i].indexOf("V")>-1) {
				time = time + 9;
			}else if (dials[i].indexOf("W")>-1 || dials[i].indexOf("X")>-1 || dials[i].indexOf("Y")>-1 || dials[i].indexOf("Z")>-1) {
				time = time + 10;
			}
		}
		System.out.println(time);
	}

}
