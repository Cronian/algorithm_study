class Solution {
    public String multiply(String num1, String num2) {
        int[] str = new int[40000];
        int max = 0;
        int size1 = num1.length();
        int size2 = num2.length();
        for(int i=size1-1;i>=0;i--) {
            for(int j=size2-1;j>=0;j--) {
                int idx = size1-i-1 + size2-j-1;
                str[idx]+=calc(num1.charAt(i),num2.charAt(j));
                if(idx > max) max = idx;
            }
        }
        StringBuilder sb = new StringBuilder();
        int zero = 0;
        for(int i=0;i<=max;i++) {
            int idx = 1;
            if(str[i] >= 10) {
                int d = str[i]/10;
                str[i+idx]+= d;
                if(i+idx > max) max = i+idx;
                str[i] = str[i]%10;
                idx++;
            }
            if(str[i] == 0) zero++;
            sb.append(str[i]);
        }
        if(zero == sb.toString().length()) return "0";
        return sb.reverse().toString();
    }
    
    public int calc(char a, char b) {
        return Character.getNumericValue(a) * Character.getNumericValue(b);
    }
}
