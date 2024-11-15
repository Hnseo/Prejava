package day02;

public class Exam_Logical {
	public static void main(String[] arg) {
		// 남자이면서 평균평점이 4.3이상인 사람 ? -> and, &&
		// 컴공과 또는 경영학과인 사람 ? -> or ||
		
		String gender = "남자";
		double score = 4.1;
		boolean var = (gender == "남자") && (score >= 4.3);
		System.out.println(var);
		var = (gender == "남자") || (score >= 4.3);
		System.out.println(var);
		
		//1보다 크고 100보다 작은 경우
		int input = 33;
		var = input >1 && input < 100;
		
		
		score = 59;
		
		// 1과 100사이의 수인가
        // ->1보다 크거나 같고 100보다 작거나 같을 경우
		var = score>=1 && score<=100;
		
	}

}
