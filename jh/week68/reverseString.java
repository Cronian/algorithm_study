public void reverseString(char[] s) {
	/* 0번째를 바꿀 때 => 마지막이랑 교체
	   1번째를 바꿀 때 => 마지막-1과 교체
	   ...
	   n번째를 바꿀 때 => 마지막 -n과 교체
	*/
		for(int i=0; i<(s.length/2); i++) {
			// 임시로 저장할 공간 선언
			char tmp = s[s.length-1-i];
			s[s.length-1-i] = s[i];
			s[i] = tmp;
		}
}