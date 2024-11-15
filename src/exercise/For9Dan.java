package exercise;

public class For9Dan {
	public static void main(String[]arg) {
		int num = 2;
		int num1 = 1;
		for(num = 2; num<=9; num++) {
			for(num1 = 1; num1 <=9; num1++) {
				if(num%2 == 1) {
				System.out.println(num + "X" + num1 + "=" + num*num1);
				}
			}
		 
		}
		System.out.println();
	}

}
