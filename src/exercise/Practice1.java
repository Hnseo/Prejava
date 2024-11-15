package exercise;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result;
		
		if(num>0) {
			result = "양수입니다";
		}
		else if (num>0) {
			result = "음수입니다";
		}
		else {
			result = "잘못된 값입니다";
		}
		
		System.out.println(result);
		
	}

}
