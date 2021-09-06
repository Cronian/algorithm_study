public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        while((binary.length() + sb.length()) < 32) {
            sb.append("0");
        }
        sb.append(binary);
        //System.out.println(sb.toString());
        String reverseBinary = sb.reverse().toString();
        //System.out.println(reverseBinary);
        int sum = 0;
        for(int i =0;i<32;i++) {
            //System.out.printf("char : %c,indx : %d \n",reverseBinary.charAt(i),i);
            sum = sum*2+Character.getNumericValue(reverseBinary.charAt(i));
        }
        return sum;
    }
}
