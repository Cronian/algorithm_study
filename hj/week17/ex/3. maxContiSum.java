package test2;

public class maxContiSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test_case;
		int t = 1;
		int solution;
		
		int[] data = {-1, 5, 2, -2, 8};
		
		for(test_case = 0; test_case < t; test_case++) {
			
			int i;
			int sum = 0;
			
			solution = -99999;
			
			 for(i = 0; i < 5; i++) {
				 sum = sum + data[i];
				 
				 if(solution < sum) {
					 solution = sum;
					 System.out.println("solution 교체 : " + solution);
				 }
				 
				 if( sum < 0) {
					 sum = 0;
				 } 
			 }
			 
			 System.out.println(solution);
			
		}
		
	}

}
