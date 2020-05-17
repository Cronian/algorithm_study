package test;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {


		int i, j, count = 1;
		long sum = 0;
		
		System.out.println("1부터 1000 사이의 수 중에서 소수를 구하는 프로그램");
		
		System.out.printf("1\t");
		
		for(i = 1; i <= 1000; i++) {
			for(j = 2; j < i; j++) {
				if((i % j) == 0) {
					break;
				}
			}
			
			if( i ==j ) {
				System.out.print(i + "\t");
				count++;
				
				if((count % 8 ) == 0) {
					System.out.println();
				}
			}
		}

		System.out.println("\n1부터 1000 사이의 소수는 " + count + "개이다.");
	}

}
