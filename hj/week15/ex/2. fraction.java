package test;

public class fraction {

	public static void main(String[] args) {
		// TODO Auto-generated--+
		int testCases, maxNumber, Solutions;
		
		int i, j, k;
		int flag = 0;
		
		Solutions = 0;
	
		maxNumber = 10;
		
		for(j = 1; j <= maxNumber; j++) {
			for(k = 2; k <= maxNumber; k++) {
				
				if(j < k && GCD(j, k) == 1) {
					if(flag == 0) {
						System.out.println("찾은 기약 분수 : 0 / 1");
						flag = 1;
					}
					
					System.out.println("찾은 기약 분수 : " + j + " / " + k);
					Solutions++;
				}
			}
		}
		
		System.out.println("찾은 기약 분수 : 1 / 1");
		System.out.println("찾은 기약 분수의 총 개수 : " + (Solutions+2));
	}
	
	public static int GCD(int p, int q) {
		if(q == 0) {
			return p;
		}
		
		return GCD(q, p % q);
	}

}
