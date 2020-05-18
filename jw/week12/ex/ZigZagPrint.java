import java.util.*;

class ZigZagPrint {
    public static void main(String[ ] args) {
        System.out.println("지그재그 출력");
        int inLineNumber = 5;
        int LineSeq = 1;
        int subCount = 0;
        for(int i=1;i<=25;i++) {
            if(LineSeq%2 == 1) {
                System.out.print(" ");
                System.out.print(i);
                System.out.print(" ");
            } else {
                System.out.print(" ");
                System.out.print(inLineNumber*LineSeq-subCount);
                System.out.print(" ");
                subCount++;
            }
            if(i%inLineNumber == 0) {
                subCount = 0;
                LineSeq++;
                System.out.println("");
            }
        }
    }
}
