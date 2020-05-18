import java.util.*;

class GreatestCommonFactor {
    public static void main(String[ ] args) {
        HashMap<Integer,Integer> hm1 = GetMeasure(100);
        HashMap<Integer,Integer> hm2 = GetMeasure(50);
        int rs = CalcGreatestCommonFactor(hm1,hm2);
        System.out.println(rs);
    }
    
    public static HashMap<Integer,Integer> GetMeasure (int num) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 2;
        while(num != 1) {
            if(num % count == 0) { 
                hm.put(count,hm.getOrDefault(count,0)+1);
                num = num/count;
            } else {
                count++;
            }
        }
        return hm;
    }
    
    public static int CalcGreatestCommonFactor(HashMap<Integer,Integer> hm1, HashMap<Integer,Integer> hm2) {
        int rs = 1;
        Iterator it1 = hm1.keySet().iterator();
        Iterator it2 = hm2.keySet().iterator();
        while(it1.hasNext() && it2.hasNext() ) {
            int num1 = (int) it1.next();
            int num2 = (int) it2.next();
            if( num1 < num2 ) {
                while(num1 < num2) {
                    if(it1.hasNext()) num1 = (int) it1.next();
                    else break;
                }
            } else if(num1 > num2) {
                while(num2 < num1) {
                    if(it2.hasNext()) num2 = (int) it2.next();
                    else break;
                }
            } else {
                rs *= (int) Math.pow(num1,Math.min(hm1.get(num1),hm2.get(num2)));
            }
        }
        
        return rs;
    }
}
