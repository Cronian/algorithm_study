package test2;

public class decalcomanieSquared {

	public static void main(String[] args) {
		
		int solution = 0;
		
		
		for(int tc = 0; tc < 1; tc++) {
			
			for(int i = 1; i < 301; i++) {
				solution += makeReverseNumber(i * i, 10);
			}
			
		}
		
		System.out.println("총 개수 : " + solution);

	}
	
	public static int makeReverseNumber(int num_origin, int b) {
		
		int tmp, num_reverse;
		tmp = num_origin;
		num_reverse = 0;
		
		while(tmp > 0) {
			num_reverse = (num_reverse * b + (tmp % b));
			tmp = tmp / b;
			
		}
		
		if(num_reverse == num_origin) {
			System.out.println("반전 수가 같음 : " + num_reverse);
			return 1;
		} else {
			return 0;
		}
	}

}
