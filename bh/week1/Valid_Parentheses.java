package valid_Parentheses;

import java.util.Scanner;
import java.util.Stack;


class Solution {
    public static boolean isValid(String s) {
    	
    	Stack<Character> st = new Stack<>();
    	
    	// 여는 괄호가 나오면 스택에 저장. 닫는 괄호가 있으면 pop으로 가장 가까운 여는 괄호를 찾아 쌍인지 확인한다. 
    	// isempty() : 스택에 원소가 없으면 ‘true’ 있으면 ‘false’ 값 반환
    	for(char c : s.toCharArray()) {
    		
    		switch(c) {
	    		case ']' :
	    			if(st.isEmpty() || '[' != st.pop())
	    				return false;
	    			break;
	    		case '}' :
	    			if(st.isEmpty() || st.pop() != '{')
	    				return false;
	    			break;
	    		case ')' :
	    			if(st.isEmpty() || st.pop() != '(')
	    				return false;
	    			break;
	    		default :
	    			st.push(c);
    		}
    		
    		
    	}
    		
    	return true;     	
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(isValid(s));;
	}
}
