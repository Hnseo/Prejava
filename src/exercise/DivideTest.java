package exercise;

import java.util.Scanner;

public class DivideTest {
	public static void main(String[] arg) {
		
		System.out.print("정수 하나 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String var = (num%2 == 0)? "짝수입니다" : " 홀수입니다";
		
		System.out.println(num + "은(는) "+var);
		
	}
	

}
