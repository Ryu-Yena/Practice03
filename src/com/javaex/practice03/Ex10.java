package com.javaex.practice03;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2 =0;
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=1;i<=5;i++) {
			System.out.print("숫자: ");
			num1 = sc.nextInt();
			if(num1>num2) {
				num2 = num1;
			}
		}
		System.out.println("최대값은 "+num2+"입니다.");
		
		sc.close();

	}

}
