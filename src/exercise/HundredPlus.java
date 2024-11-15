package exercise;

public class HundredPlus {
	public static void main(String[]arg) {
		int num = 1;
		int num1 = 0;
		for(num = 1; num<=100; num++) {
			
			if(num%2 == 1) {
				num1+=num;
			}		
		}
		System.out.println(num1);
	}

}
