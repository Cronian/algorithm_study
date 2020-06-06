package test;

public class hanoi {
	
	static int Cnt = 0;

	public static void main(String[] args) {
		
		int n = 3;
		
		System.out.println("이동할 원판 수 : " + n);
		
		hanoi(n, 1, 2);
		System.out.println("원판의 총 이동 횟수 : " + Cnt);
		


	}
	
	
	public static void hanoi(int n, int a, int b) {
		
		int temp;
		
		if(n == 1) {
			System.out.println("원판 " + n + "을(를) " + a + "에서 " + b + "로 이동한다");
		} else {
			temp = 6 - a -b;
			hanoi(n - 1, a, temp);
			System.out.println("원판 " + n + "을(를) " + a + "에서 " + b + "로 이동한다");
			hanoi(n - 1, temp, b);
		}
		
		
		Cnt++;
		
	}

}
