package test2;

public class continuePrimeNumber {
	
	public static int[][] prime = new int[8][10000];
	
	public static void main(String[] args) {
		
		for( int tc = 0; tc < 1; ++tc) {
			extendPrime(4);
			
			for(int i = 0; prime[4-1][i] > 0; i++) {
				System.out.println("PrimeNumber : " + prime[4-1][i]);
			}
		}

	}
	
	public static boolean checkPrime(int num) {
		
		for(int i = 2; i * i <= num; i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int extendPrime(int n) {
		int i, j;
		int num;
		
		int k, x;
		
		for(i = 0; i < n; i++) {
			if(i == 0) {
				if(prime[0][0] == 0) {
					prime[0][0] = 2;
					prime[0][1] = 3;
					prime[0][2] = 5;
					prime[0][3] = 7;
				}
			} else {
				x = 0;
				for(j = 0; prime[i - 1][j] > 0; j++) {
					for(k = 0; k < 5; k++) {
						num = prime[i-1][j] * 10 + 2 * k + 1;
						System.out.println("candidated num : " + num);
						
						if((prime[i][x] == 0) && (checkPrime(num))) {
							prime[i][x] = num;
							x++;
						}
					}
				}
			}
		}
		
		return 0;
	}
	
}
