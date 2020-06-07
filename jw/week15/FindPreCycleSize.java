package sec12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPreCycleSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작숫자 입력하기");
        int init = sc.nextInt();
        int cnt = 0;
        int cntm = 0;
        System.out.println("제곱수 입력하기");
        int p = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(init,1);
        try {
            while (true) {
                int sum = 0;
                int tmp = init;
                while(tmp != 0) {
                    sum += Math.pow(tmp%10,p);
                    tmp = tmp/10;
                }
                int dup = map.getOrDefault(sum,0);
                if(dup == 0) {
                    map.put(sum,1);
                    cnt++;
                    init = sum;
                } else if(dup == 1) {
                    map.put(sum,2);
                    init = sum;
                    cntm++;
                } else {
                    break;
                }
            }
        } catch(Exception e) {
            System.out.println("반복없음!");
        }
        System.out.printf("반복수열까지 도달하기 위한 비반복 숫자는 %d 입니다.",cnt-cntm+1);
    }
}
