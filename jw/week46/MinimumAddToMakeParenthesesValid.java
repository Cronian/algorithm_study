class Solution {
    public int minAddToMakeValid(String S) {
        int left = 0;
        int right = 0;
        int sum = 0;
        for(char c : S.toCharArray()) {
            if(c == '(') {
                left++;
                if(right > 0) {
                    if(left == 1 && right > 0) {
                        sum += right;
                        right = 0;
                    } else {
                        right--;
                        left--;
                    }
                }
            } else {
                right++;
                if(left > 0) {
                    left--;
                    right--;
                }
            }
        }
        return left+right+sum;
    }
}
