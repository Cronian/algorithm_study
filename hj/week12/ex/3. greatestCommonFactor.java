package test;

import java.util.*;

public class greatestCommonFactor {

	public static void main(String[] args) {

		int data1, data2;
		
		int i, num;
		
		System.out.println("공약수를 구할 두 정숫값을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수");
		data1 = scan.nextInt();
		
		System.out.println("두번째 정수");
		data2 = scan.nextInt();
		
		if(data1 > data2) {
			num = data1;
		} else {
			num = data2;
		}
		
		for(i = 1; i < num; i++) {
			if(((data1%i) == 0 ) && ((data2%i) == 0)) {
				System.out.println(i);
			}
			
			if(i == data1 || i == data2) {
				break;
			}
		}
		
	}

}
