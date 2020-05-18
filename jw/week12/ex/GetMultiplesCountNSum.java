import java.util.*;

class GetMultiplesCountNSum {
    public static void main(String[ ] args) {
        System.out.println("1 - 1000 의 N의 배수 갯수와 합 구하기");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=1;i<=1000;i++) {
            if(i%n == 0) {
                count++;
                sum +=i;
            }
        }
        System.out.print("배수 갯수 : ");
        System.out.println(count);
        System.out.print("배수 합 : ");
        System.out.println(sum);
        
    }
}
