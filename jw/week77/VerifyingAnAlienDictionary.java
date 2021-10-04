class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> hm = new HashMap<>();
        int cnt = 0;
        boolean sorted = true;
        for(char c : order.toCharArray()) {
            hm.put(c,cnt++);
        }
        for(int i=0;i<words.length-1;i++) { 
            String a = words[i];
            int al = a.length();
            String b = words[i+1];
            int bl = b.length();
            cnt = 0;
            while(al>cnt && bl>cnt && a.charAt(cnt)==b.charAt(cnt)) {
                cnt++;
            }
            if(al<=cnt) continue;
            if(bl<=cnt) {
                return false;
            }
            //System.out.printf("Int %d, Cnt %d",i,cnt);
            if(hm.get(a.charAt(cnt)) > hm.get(b.charAt(cnt))) {
                System.out.println(cnt);
                return false;
            }
        }
        
        return true;
    }
}
