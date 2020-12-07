class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        List<Integer> kls = new ArrayList<>();
        List<String> vls = new ArrayList<>();
        
        // 1000
        kls.add(1000);
        vls.add("M");
        // 900
        kls.add(900);
        vls.add("CM");
        // 500
        kls.add(500);
        vls.add("D");
        // 400
        kls.add(400);
        vls.add("CD");
        // 100
        kls.add(100);
        vls.add("C");
        // 90
        kls.add(90);
        vls.add("XC");
        // 50
        kls.add(50);
        vls.add("L");
        // 40
        kls.add(40);
        vls.add("XL");
        // 10
        kls.add(10);
        vls.add("X");
        // 9
        kls.add(9);
        vls.add("IX");
        // 5
        kls.add(5);
        vls.add("V");
        // 4
        kls.add(4);
        vls.add("IV");
        // 1
        kls.add(1);
        vls.add("I");
        
        for(int i=0;i<kls.size();i++) {
            int t = kls.get(i);
            int div = num/t;
            if(div > 0) {
                for(int cnt = 0;cnt<div;cnt++) {
                    sb.append(vls.get(i));
                }
                num -= div*t;
            } else {
                continue;
            }
        }
        
        return sb.toString();
        
    }
    
    
}
