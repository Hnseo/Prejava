package exercise;

public class Dan9 {
	public static void main(String[]arg) {
		int num;
		int num1;
		for(num = 2; num<=9; num++) {
			for(num1 = 1; num1<=9; num1++) {
				System.out.println(num + "X" + num1 + "=" + num*num1);
			}
			System.out.println();
		}
		System.out.println();
	}

}
