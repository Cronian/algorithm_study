class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int sizeR = ransomNote.length();
        int sizeM = magazine.length();
        if(sizeR > sizeM) return false;
        Map<Character,Integer> mg = new HashMap<>();
        for(char t : magazine.toCharArray()) {
            mg.put(t,mg.getOrDefault(t,0)+1);
        }
        for(char t : ransomNote.toCharArray()) {
            int cnt = mg.getOrDefault(t,0);
            if(cnt-1 < 0) return false;
            else {
                mg.put(t,cnt-1);
            }
        }
        
        return true;
    }
}
