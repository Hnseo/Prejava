package exercise;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] arg) {
		
		// 입력한 정수가 1~100 사이의 숫자인지 확인하는 프로그램을 작성하라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 :");
		int num = sc.nextInt();
		boolean var = 1<=num && num<100;
		System.out.println("num은 1~100 사이의 숫자인가? : " +var);
		
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		var = 1<=num1 && num1<100;
		System.out.println("num1은 1~100 사이의 숫자인가? : " + var);
		
		System.out.print("알파벳 입력 : ");
		char ch = sc.next().charAt(0);
		boolean var1 = 65<=ch && ch<=90;
		System.out.println("알파벳 ch는 대문자인가? : " +var1);
		
		System.out.print("알파벳 입력 : ");
        ch = sc.next().charAt(0);
		var1 = 65<=ch && ch<=90;
		System.out.println("알파벳 ch는 대문자인가? : " + var1);
		
		
		
	}

}
