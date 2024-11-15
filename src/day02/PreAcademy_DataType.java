package day02;

public class PreAcademy_DataType {

	public static void main(String[] args) {
		byte bnum = 127;
		short snum = 32767;
		int inum = 2147483647;
		long lnum = 11111111111111l;
		float fnum = 5.7F;
		double dnum = 5.99;
		//char = 한 글자 문자
		char ch = 'A';
		boolean var = 5>3;
		String str = "현서";
		String str2 = "민지";
		String a = (var) ? str:str2;
		System.out.println((int)'A');
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(a);
	}

}
