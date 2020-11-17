package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int i,j;
		
		System.out.println("숫자를 입력하세요.");
		x = sc.nextInt();
		
		for(i=1;i<=x;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}System.out.println("\n");
		}
		sc.close();
	}

}
