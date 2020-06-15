package shuffle_the_Array;
// {x1,x2...,xn,y1,y2...yn} 형태의 배열이 주어졌을때 , 
// {x1,y1,x2,y2......xn,yn} 순으로 재정렬하라.

class Solution {
    public static int[] shuffle(int[] nums, int n) {
    	int newNums[] = new int[nums.length]; //새로운 배열 생성
    	
    	for(int i=0; i<n; i++)
    	{
    		newNums[i*2] = nums[i];
    		newNums[i*2+1] = nums[i+n]; 	
    	}
    	
    	return newNums;
    }
    
    public static void main(String[] args) {
		int nums[] = new int[6]; //배열생성
		int n = nums.length/2; //배열중간분리
		
		for(int i=0; i<nums.length; i++)
		{
			nums[i] = i+1;
		}
		
		
		int numResult[] = shuffle(nums,n);

		for(int i=0; i<numResult.length; i++)
		{
			System.out.print(numResult[i]+ " ");
		}
		
		 
	}
}
