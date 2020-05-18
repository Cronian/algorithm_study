import java.util.*;

class getPrime {
    public static void main(String[ ] args) {
        int count = 0;
        for(int i=2;i<=1000;i++) {
            boolean prime = true;
            for(int j=2;j<i;j++) {
                if(i%j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                count++;
            }
        }
        
        System.out.print("1부터 1000까지 소수갯수 : ");
        System.out.println(count);
    }
}
