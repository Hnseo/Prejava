package exercise;

import java.util.Scanner;

public class ExerciseIfhard {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1차 시험 점수를 입력하세요 : ");
		double num = sc.nextInt();
		if(num>100 || num<0) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		
		System.out.print("2차 시험 점수를 입력하세요 : ");
		double num1 = sc.nextInt();
		
		
		if(num1<0 || num1>100) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		
	
		double num2 = ((num+num1)/2);
		

		if(num1<40 || num<40) {
			System.out.println("과락입니다. 재평가가 필요합니다.");
		}
		else if(num1<60 && num<60) {
			System.out.println("재평가가 필요합니다.");
		}
		else if(num1>=60 && num<60) {
			System.out.println("1차 시험 재평가 대상입니다.");
		}
		else if(num>=60 && num1<60) {
			System.out.println("2차 시험 재평가 대상입니다.");
		}
		else if(num>=60 && num1>=60) {
			System.out.println("합격입니다.");	
		}
		System.out.println("평균 : "+num2);
			
	}

}
