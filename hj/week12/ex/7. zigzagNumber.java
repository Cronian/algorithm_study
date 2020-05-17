package test;

public class zigzagNumber {

	public static void main(String[] args) {

		int MaxLine = 5;
		int data;
		int LineNumber;
		
		System.out.println("지그재그 숫자 출력 프로그램");
		
		for(LineNumber = 1; LineNumber <= MaxLine; LineNumber++) {
			if((LineNumber % 2) == 0) {
				for(data = LineNumber * 5; data >= (LineNumber *5) -4; data --) {
					System.out.printf(data + "\t");
				}			
				System.out.println();
			} else {
				for(data = (5 * (LineNumber -1 )) +1 ; data <= (5 * (LineNumber -1)) + 5; data++) {
					System.out.printf(data + "\t");
				}				
				System.out.println();				
			}
		}
	}

}
