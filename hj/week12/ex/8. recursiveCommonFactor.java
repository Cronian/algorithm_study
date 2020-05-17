package test;

import java.util.*;

public class recursiveCommonFactor {
	static int ExecNum = 1;

	public static void main(String[] args) {
		
		int result;
		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최대공약수를 구하는 프로그램");
		System.out.println("2개의 수를 입력하세요");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
		result = gcd(num1, num2);
		System.out.println(num1 + "와 " + num2 + "의 최대공략수는 : " + result);
		
	}
	
	public static int gcd(int x, int y) {
		
		System.out.println(ExecNum + "번째 실행");
		ExecNum++;
		
		if( y != 0) {
			System.out.println("x : " + x + " y : " + y);
			return gcd(y, x % y);
		} else {
			return x;
		}
		
	}

}
