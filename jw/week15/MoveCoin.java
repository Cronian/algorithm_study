import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총 주머니 갯수를 입력해 주세요 ");
        int total =  sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("각 주머니에 들어갈 코인수를 입력해 주세요");
        int sum = 0;
        for(int i=1;i<=total;i++) {
            System.out.printf(" %d번째 주머니 코인 수 : ",i);
            int tmp = sc.nextInt();
            list.add(tmp);
            sum += tmp;
        }
        if(sum%total != 0) System.out.println("똑같이 나눠 담을수 없는 수 입니다.");
        else {
            int rack = 0;
            int avr = sum/total;
            for( int t : list) {
                if(t>avr) rack+=t-avr;
                else rack += avr-t;
            }
            System.out.printf("총 이동횟수는 %d 입니다.",rack/2);
        }
    }
}
