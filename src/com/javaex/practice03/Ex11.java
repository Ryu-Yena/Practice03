package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum=0;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i=i+2) {
			if(num%2!=0) {
				sum = i+sum;
			}else if(num%2==0){
				sum = (i+1)+sum;
			}
		}
		System.out.println("결과값: "+sum);
		sc.close();

	}

}
