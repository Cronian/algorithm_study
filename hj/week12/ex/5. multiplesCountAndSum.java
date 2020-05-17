package test;

import java.util.*;

public class multiplesCountAndSum {

	public static void main(String[] args) {
		
		int i, num, count = 0;
		
		long sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 1000 사이에 선택한 수의 배수가 몇 개고, 배수의 합은 얼마인가?");
		System.out.println("1부터 1000 사이에 수 중에서 하나를 입력하세요");
		
		num = scan.nextInt();
		
		for(i = 1; i <= 1000; i++) {
			if( i % num == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println("선택하신 수의 1000 이하의 배수의 개수 : " + count + " 배수의 합 : " + sum);
	}

}
