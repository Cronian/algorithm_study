package test;

public class moveCoin {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCases, p, totalBeans = 0, averBeans;
		
		int i, j;
		
		int[] eachPocket =  {1, 1, 1, 1, 6};
		int num_moves = 0, num_pockets = 5;
		
		
		for(j = 0; j < eachPocket.length; j++) {
			totalBeans += eachPocket[j];
		}
		
		if((totalBeans % num_pockets) > num_pockets) {
			num_moves = -1;
		} else {
			averBeans = totalBeans / num_pockets;
			
			for(j = 0; j < num_pockets; j++) {
				if(eachPocket[j] < averBeans) {
					num_moves =  num_moves + (averBeans - eachPocket[j]);
					System.out.println("eachPocket[" + j + "]의 이동 횟수 : " + (averBeans - eachPocket[j]));
				}
			}
		}
		
		System.out.println("누적 이동 횟수 : " + num_moves);
	}

}
