package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		
		sc.close();

	}

}
