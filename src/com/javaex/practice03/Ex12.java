package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int fac=1;
		
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			fac = i*fac;  
		}
		
		System.out.println("결과값: "+fac);
		sc.close();
	}
}
