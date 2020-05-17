package test;

public class fibonacciNumber {

	public static void main(String[] args) {
		int i, value_new, valuen_1, valuen_2;
		
		System.out.println("피보나치 수열");
		
		i = 0;
		valuen_1 = 1;
		valuen_2 = 0;
		
		while(i < 24) {
			value_new = valuen_1 + valuen_2;
			
			if(i % 12 == 0) {
				System.out.println("");
			}
			
			System.out.printf(value_new + "\t");
			
			valuen_2 = valuen_1;
			valuen_1 = value_new;
			i++;
		}
	}

}
