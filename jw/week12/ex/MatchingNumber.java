package ex;

import java.util.Scanner;

public class MatchingNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        System.out.println("숫자맞추기");
        System.out.println("1 - 100 사이 숫자 맞추기");
        module(number);
    }

    public static void module(int rand) {
        Scanner sc = new Scanner(System.in);
        System.out.println(rand);
        while(true) {
            System.out.print("입력 : ");
            int tmp = sc.nextInt();
            if(tmp > rand) System.out.println("입력한 숫자보다 작습니다");
            else if(tmp < rand) System.out.println("입력한 숫자보다 큽니다");
            else {
                System.out.println("맞췄습니다.");
                break;
            }
        }
    }
}
