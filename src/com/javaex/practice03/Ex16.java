package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int count = 0,sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		count = num/5;
		for(int i=1; i<=count;i++) {
			sum = i*5+sum;
		}
		
		System.out.println("5의배수의 개수: "+count);
		System.out.println("5의배수의 합: "+sum);
		sc.close();

	}

}
