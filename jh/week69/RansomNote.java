public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// Q. magazine에 있는 문자열을 한 번씩만 사용해서 ransomNote 문자를 만들 수 있으면 true else false
		// 1. magazine -> CharArray

		for(char word : magazine.toCharArray()) {
			// 이미 배열에 있는 경우 -> value+1 Set
			// 배열에 없는 경우 -> 1 Set
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		// ransomNote -> CharArray
		for(char rWord : ransomNote.toCharArray()) {
			// map에 없는 경우 -> 만들 수 없음. return false;
			// map에 있지만 이미 사용한 경우 -> 더이상 만들 수 없음. return false;
			if(!map.containsKey(rWord) || map.get(rWord) <= 0) return false;

			// 사용한 문자열에 해당하는 value -1
			map.put(rWord, map.get(rWord)-1);
		}

		return true;
}