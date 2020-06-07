import java.util.Scanner;

public class FindFractionalFractionCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 최대값을 입력해주세요 : ");
        int max = sc.nextInt();
        int cnt = 2;
        for(int i=1;i<=max;i++) {
            for(int j=2;j<=max;j++) {
                if(i<j && GCD(i,j) == 1) {
                    System.out.printf(" 찾은 기약분수 %d / %d \n",i,j);
                    cnt++;
                }
            }
        }
        System.out.printf(" 찾은 기약분수 %d / %d \n",0,1);
        System.out.printf(" 찾은 기약분수 %d / %d \n",1,1);
        System.out.printf(" 총 갯수 : %d \n",cnt);
    }

    public static int GCD(int a,int b) {
        if(b == 0) return a;
        else return GCD(b,a%b);
    }
}
