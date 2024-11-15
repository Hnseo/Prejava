package exercise;

import java.util.Scanner;

public class Dan9Exercise {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-구구단-");
		System.out.print("어떤 숫자의 곱셈식을 출력하시겠습니까? : ");
		int num = sc.nextInt();
		
		if(num<2 || num>9) {
			System.out.println("1~9 사이의 숫자를 입력해주십시오.");
			return;
		}
		int num2 = 2;
		System.out.println("곱셈식을 출력합니다");
		for(num2 = 2; num2<=9; num2++)
			System.out.println(num + "X" + num2 + "=" + num*num2);
		
	}

}
