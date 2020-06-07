import java.util.Scanner;

public class Hanoi {
    private static int cnt = 0;
    public static void main(String[] args) {
        System.out.print("이동할 원판 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calc(n,1,2);
        System.out.printf("이동한 횟수 : %d",cnt);
    }

    public static void calc(int n,int a,int b) {
        int temp;
        if(n == 1) System.out.printf("원판 %d을(를) %d에서 %d로 이동한다\n",n,a,b);
        else {
            temp = 6-a-b;
            calc(n-1,a,temp);
            System.out.printf("원판 %d을(를) %d에서 %d로 이동한다\n",n,a,b);
            calc(n-1,temp,b);
        }
        cnt++;
    }
}
