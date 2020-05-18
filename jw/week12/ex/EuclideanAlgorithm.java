import java.util.*;

class EuclideanAlgorithm {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("X와 Y의 최대공약수 구하기");
        System.out.print("X 입력 :");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.print("Y 입력 :");
        int y = sc.nextInt();
        System.out.println(y);
        System.out.print("결과 : ");
        System.out.println(EuclideanAlgorithm(x,y));
    }
    
    public static int EuclideanAlgorithm(int a,int b) {
        return b != 0 ? EuclideanAlgorithm(b,a%b) : a;
    }
}
