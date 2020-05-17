package test;

import java.util.*;

public class deciamltoHexa {
	
	
	public static void main(String[] arg) {
		String key;
		int data;
		
		System.out.println("10진수와 16진수 변환 프로그램입니다.");
		System.out.println("10진수를 16진수로 변환하려면 A키를 누르세요.");
		System.out.println("16진수를 10진수로 변환하려면 A키를 누르세요.");
		System.out.println("a또는 b를 입력해주세요.");
		
		Scanner a = new Scanner(System.in);
		
		key = a.next();
		
		System.out.println("변환할 숫자를 입력하세요.");
		
		if(key.equals("a")) {
			data = a.nextInt();
			System.out.println("10진수 값 : " + data + " --> 16진수 값 : " + Integer.toHexString(data));
			
		} else if (key.equals("b")) {
			data = a.nextInt();
			System.out.println("16진수 값 : " + data + " --> 10진수 값 : " + Integer.parseInt(data + "", 16));
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
}
