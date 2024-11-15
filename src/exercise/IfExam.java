package exercise;

import java.util.Scanner;

public class IfExam {
	public static void main (String []arg) {
		System.out.print("본인의 점수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
	    int score = sc.nextInt();
	    
	    if(0<=score && score<20) {
	    	System.out.println("9등급입니다");
	    }
	    else if (0<=score && score<30) {
	    	System.out.println("8등급입니다");
	    	
	    }
	    else if (0<=score && score<40) {
	    	System.out.println("7등급입니다");
	    	
	    }
	    else if (0<=score && score<50) {
	    	System.out.println("6등급입니다");
	    }
	    else if (0<=score && score<60) {
	    	System.out.println("5등급입니다");
	    }
		
	    else if (0<=score && score<70) {
	    	System.out.println("4등급입니다");
	    	
	    }
	    else if (0<=score && score<80) {
	    	System.out.println("3등급입니다");
	    	
	    }
	    else if (0<=score && score<90) {
	    	System.out.println("2등급입니다");
	    }
	    else if (0<=score && score <=100) {
	    	System.out.println("1등급입니다");
	    }
	    else {
	    	System.out.println("잘못된 입력입니다. 다시 입력해주세요");
	    }
	    	
System.out.println();
	}
	    

}
