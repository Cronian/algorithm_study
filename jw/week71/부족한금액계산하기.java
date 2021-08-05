class Solution {
    public long solution(int price, int money, int count) {
        //int 값으로 곱연산시 오버플로우가 날 수 있음. 계산값을들 long으로 형변환한다. 
        long answer = ((long)(count*(count+1))/2*(long)price) - money;
        return answer > 0 ? answer : 0;
    }
}
