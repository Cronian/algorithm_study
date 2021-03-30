class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> rs = new ArrayList<>();
        Map<Character,List<Character>> hm = new HashMap<>();
        // Setting Digit
        hm.put('2',Arrays.asList('a','b','c'));
        hm.put('3',Arrays.asList('d','e','f'));
        hm.put('4',Arrays.asList('g','h','i'));
        hm.put('5',Arrays.asList('j','k','l'));
        hm.put('6',Arrays.asList('m','n','o'));
        hm.put('7',Arrays.asList('p','q','r','s'));
        hm.put('8',Arrays.asList('t','u','v'));
        hm.put('9',Arrays.asList('w','x','y','z'));
        int size = digits.length();
        if( size == 0) return rs;
        putLetter(hm,rs,new StringBuilder(),digits,0,size);
        return rs;
    }
    
    public void putLetter(Map<Character,List<Character>> hm,List<String> rs, StringBuilder sb,String digits, int idx,int size) {
        if(size > idx) {
            List<Character> ls = hm.get(digits.charAt(idx));

            for(char t : ls) {
                putLetter(hm,rs,new StringBuilder(sb).append(t),digits,idx+1,size);
            }
        } else {
            rs.add(sb.toString());
        }
    }
}
