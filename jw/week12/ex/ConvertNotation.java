package ex;

import java.util.Scanner;

public class ConvertNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("10진수 <-> 16진수 변환 프로그램");
        System.out.println("10진수를 16진수로 바꾸려면 A 입력");
        System.out.println("16진수를 10진수로 바꾸려면 B 입력");
        System.out.print("A나 B 입력 : ");
        String tmp = sc.next();
        System.out.print("변환할 숫자를 입력하세요 : ");
        int convert = sc.nextInt();
        convertor(tmp,convert);
    }

    public static void convertor(String type,int num) {
        char[] numbers = "0123456789abcdef".toCharArray();
        int div = 0;
        if(type.toLowerCase().equals("a")) {
            div = 16;
        } else if (type.toLowerCase().equals("b")){
            div = 10;
        }

        if(div != 0) {
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                int tmp = num % div;
                sb.append(numbers[tmp]);
                num = num / div;
            }
            char[] rs = sb.toString().toCharArray();
            int size = rs.length;
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(rs[i]);
            }
        } else {
            System.out.println("A나 B를 입력하세요");
        }
    }
}
