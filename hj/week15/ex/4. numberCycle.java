package test;

public class numberCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tc, index, initNumber, powerNumber, Solution, tempNumber;
		
		int[] foundFlag = new int[100000]; 
		int[] calculatedNumber = new int[100000]; 
		
		int i;
		
		Solution = 0;
		
		initNumber = 638;
		powerNumber = 2;
		
		calculatedNumber[Solution++] = initNumber;
		
		while(true) {
			tempNumber = 0;
			
			while(initNumber > 0) {
				int digit = (initNumber % 10);
				initNumber = (initNumber / 10);
				
				if(powerNumber >= 2) {
					for(i = 2; i <= powerNumber; i++) {
						digit *= digit;
					}
				}
				
				tempNumber += digit;
				System.out.println("digit : " + digit + " tempNumber : " + tempNumber);
			}
			
			initNumber = tempNumber;
			
			if(foundFlag[initNumber] == 1) {
				break;
			}
			
			foundFlag[initNumber] = 1;
			
			calculatedNumber[Solution++] = initNumber;
			
		}
		
		for(i = 0; i < Solution; i++) {
			if(initNumber == calculatedNumber[i]) {
				break;
			}
		}
		
		System.out.println(i);

	}

}
