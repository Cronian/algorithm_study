package test2;

public class symmetryProcession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_matrix = 4;
		
		char[] initMatrix = {'A', 'B', 'C', 'D'};
		
		for(int i = 0; i < num_matrix; i++) {
			
			for(int j = 0; j < num_matrix; j++) {
				char c = initMatrix[i ^ j];
				if(j == num_matrix - 1) {
					System.out.println(c);
				} else {
					System.out.print(c + "   ");	
				}
			}
			
		}
		

	}

}
