class Solution {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = i + 1; j <= arr.length; j += 2) {
                int[] subArray = Arrays.copyOfRange(arr, i, j);
                for (int k = 0; k < subArray.length; k += 1) {
                    sum += subArray[k];
                }
            }
        }
        return sum;
    }
   
}
