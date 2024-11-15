package exercise;

import java.util.Scanner;

public class ExerciseRepeat {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("연산자를 입력하세요");
		char ch = sc.next().charAt(0);
		int num2 = num+num1;
		int num3 = num-num1;
		int num4=num*num1;
		int num5 = num/num1;
		int num6 = num%num1;
		
		if(ch == '+') {
			System.out.println(num2);
		}
		else if(ch == '-') {
			System.out.println(num3);
		}
		else if(ch == '*') {
			System.out.println(num4);
		}
		else if(ch == '/') {
			System.out.println(num5);
		}
		else if(ch == '%') {
			System.out.println(num6);
		}
		else {
			System.out.println("잘못된 값입니다.");
		}
		
		
	}

}
