package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,i,j;
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		for(i=num;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(i=2;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		
		sc.close();
		}

}
