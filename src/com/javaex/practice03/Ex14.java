package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		System.out.println("숫자를 입력하세요:");
		num = sc.nextInt();
		
		
		for(int i =1; i<=num; i++) {
			sum = i+sum;
			if(i!=num) {
				System.out.print(i+"+");
			}else System.out.println(i);
		}
		System.out.println("합계: "+sum);
		
		sc.close();

	}

}
