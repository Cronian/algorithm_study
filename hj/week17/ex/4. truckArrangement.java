package test2;

public class truckArrangement {
	
	private static int[] data = { 75, 30, 100, 38, 50, 51, 52, 20, 81, 5};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] data2 = {{1, 10}, {3, 5}, {6, 9}, {8, 10}};
		
		for(int j = 0; j < 10; j++) {
			System.out.println("data["+ j +"] : " + data[j]);
		}
		
		for(int k = 0; k < 4; k++) {
			System.out.println("num_questions : 4 n : " + data2[k][0] + " m : " + data2[k][1]);
			getHeight(data2[k][0], data2[k][1]);
		}
		
	}
	
	public static void getHeight(int n, int m) {
		int min, j;
		min = 99999;
		
		for(j = n -1; j < m; j++) {
			
			if(min > data[j]) {
				min = data[j];
			}
		}
		
		System.out.println(min);
	}

}
