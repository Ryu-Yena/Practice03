package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		System.out.println("숫자를 입력하세요:");
		num = sc.nextInt();
		
		
		for(int i =0; i<=num; i++) {
			sum = i+sum;
		}
		System.out.println("합계: "+sum);
		
		sc.close();

	}

}
