package day02;

import java.io.IOException;
import java.util.Scanner;

public class TrueorFalse {

	public static void main(String[] args) throws IOException {
				
		// 입력을 편하게 해주는 도구
		//API, 라이브러리
		//-> Scanner
		
		//Scanner
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		//boolean var = num<100;
		//System.out.println(var);
		
		Scanner sc = new Scanner(System.in); // 스캐너 선언
		int num = sc.nextInt();
		boolean var = num<100;
		System.out.println("입력받은 정수 : "+ var);
		char ch = sc.next().charAt(0);
		boolean var1 = ch<100;
		System.out.println("입력받은 문자 : " + var1);
		
		String str = sc.next();
		String aa = (num<100) ? "현서":"민지";
				System.out.println("입력받은 글자 : " + aa);
		
				}

}
