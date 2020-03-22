package algorithm_study;

public class Select {
	
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

	// 선택정렬 실행
	public static void SelectionSort() {
		int i, j, min, dummy;
		
		for(i = 0; i < MAX; i++) {
			min = i;
			for(j = i + 1; j < MAX; j++) {
				if(Buf[j] < Buf[min]) {
					min = j;
				}
			}
			
			dummy = Buf[min];
			Buf[min] = Buf[i];
			Buf[i] = dummy;
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
		
		SelectionSort();
		DisplayBuffer();
	}

}
