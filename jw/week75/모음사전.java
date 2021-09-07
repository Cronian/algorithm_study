class Solution {
    public int solution(String word) {
        String str = "AEIOU";
		int[] x = {781,156,31,6,1};
		int index,result=word.length();
		for(int i=0;i<word.length();i++){
			index = str.indexOf(word.charAt(i));
			result+=x[i]*index;
		}
		return result;
    }
}
