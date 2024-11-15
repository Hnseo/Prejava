package exercise;

import java.util.Scanner;

public class ExerciseSwitch {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 마이페이지");
		System.out.println("4. 회원정보 수정");
		System.out.println("5. 회원탈퇴");
		System.out.println("메뉴 번호를 입력하세요");
		int num = sc.nextInt();
		String msg = "";
		switch(num) {
		case 1 :
		msg = "회원가입";
		case 2 :
			msg = "로그인";
			break;
		case 3 :
			msg = "마이페이지";
			break;
		case 4 :
			msg = "회원 정보 수정";
			break;
		case 5 :
			msg = "회원탈퇴";
			break;
			default :
				msg = "유효한 메뉴 번호를 입력해주세요";
				
		
		
		
		}
		System.out.println(msg);
		
		
	}

}
