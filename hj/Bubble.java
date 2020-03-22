package algorithm_study;

public class Bubble {
	static int MAX = 100;
	
	static int[] Buf = new int[MAX];
	
	// 랜덤으로 숫자 생성
	public static void MakeRandomNumber() {
		int i, Num;
		i = 1;
		
		Buf[0] = 100;
		
		while(i < MAX) {
			int randome  = (int)(Math.random()*100) ;
			Num =  (randome % MAX);			
			if(!IsNumberExit(Num, i)) {
				Buf[i] = Num;
				i++;
			}
		}	
	}
	
	
	// 해당 배열에 존재 여부 체크
	public static boolean IsNumberExit(int number, int index) {		
		for(int i = 0; i < index; i++) {
			if(Buf[i] == number || number == 0) {
				return true;
			}
		}
		return false; 
	}

	// 버블정렬 실행
	public static void BubbleSort() {
		int i, j, dummy;
		
		for(i = MAX - 1; i >= 0; i--) {
			for(j=1; j<=i; j++) {
				if(Buf[j-1] > Buf[j]) {
					dummy = Buf[j-1];
					Buf[j-1] = Buf[j];
					Buf[j] = dummy;
				}
			}
		}
		
	}
	
	// 버퍼 출력
	public static void DisplayBuffer()	{
		
		for(int i = 0; i < MAX; i++) {
			if(i % 10 ==  0) {
				System.out.println("\n");				
			}			
			System.out.print(Buf[i] + "  ");
		}	
	}
	
	// 메인 실행
	public static void main(String[] args) {
		
		System.out.println("정렬시작 전");		
		MakeRandomNumber();
		System.out.println("랜덤 숫자 생성");	
		DisplayBuffer();
		
		System.out.println("정렬시작");
		
		BubbleSort();
		DisplayBuffer();
	}
}
