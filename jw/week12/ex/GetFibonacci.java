import java.util.*;

class GetFibonacci {
    public static void main(String[ ] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = 0;
        System.out.println("N 번째 피보나치수 구하기 (1-100)");
        System.out.print("N 입력 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Insert N1 , N2
        al.add(0);
        al.add(1);
        int count = 2;
        while(al.size() < n) {
            al.add(al.get(count-1)+al.get(count-2));
            count++;
        }
        System.out.println(al.get(n-1));
    }
    
}
