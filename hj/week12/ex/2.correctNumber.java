package test;

import java.util.*;

public class correctNumber {

	public static void main(String[] args) {
		int num, i, data;
		
		Random rand = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		num = rand.nextInt(10);
		
		i = 1;
		
		System.out.println("0부터 9까지  숫자를 입력하세여.");
		
		while(true) {
			
			System.out.println(i + "번째 도전");
			data = scan.nextInt();
			
			if(data < num) {
				System.out.println(data + "보다 큽니다.");
			} else if(data > num) {
				System.out.println(data + "보다 작습니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
			i++;
			
		}
		
	}

}
