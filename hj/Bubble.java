package algorithm_study;

public class Bubble {
	static int MAX = 100;
	
	static int[] Buf = new int[MAX];
	
	// �������� ���� ����
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
	
	
	// �ش� �迭�� ���� ���� üũ
	public static boolean IsNumberExit(int number, int index) {		
		for(int i = 0; i < index; i++) {
			if(Buf[i] == number || number == 0) {
				return true;
			}
		}
		return false; 
	}

	// �������� ����
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
	
	// ���� ���
	public static void DisplayBuffer()	{
		
		for(int i = 0; i < MAX; i++) {
			if(i % 10 ==  0) {
				System.out.println("\n");				
			}			
			System.out.print(Buf[i] + "  ");
		}	
	}
	
	// ���� ����
	public static void main(String[] args) {
		
		System.out.println("���Ľ��� ��");		
		MakeRandomNumber();
		System.out.println("���� ���� ����");	
		DisplayBuffer();
		
		System.out.println("���Ľ���");
		
		BubbleSort();
		DisplayBuffer();
	}
}
