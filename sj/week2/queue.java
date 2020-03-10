// 큐 알고리즘 문제

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        // 매개변수로 받은 배열들을 담을 배열 선언 정렬 하기 전
        int[][] result = new int[people.length][];
        
        // new Comparartor를 사용하면 앞에 있는 배열에
        // 자신이 재 정의한 정렬 함수를 통해 정렬 가능
        // sort는 선택 정렬
        Arrays.sort(people, new Comparator<int[]>(){
            
            //기존 comparable 함수와는 다른 compare함수 정의 
            public int compare(int[] a1, int[] a2){
                
                //키가 같지 않으면
                if(a1[0]!=a2[0]){
                    // 키가 작은 사람이 앞이니까 키 순서대로 내림 차순 정렬
                    return a2[0]-a1[0];
                    // 키가 같다면
                }else{
                    // k에 따라 정렬 k가 적은게 앞에 같거나 큰사람이 적다는 소리니까 앞으로가야함
                    return a1[1]-a2[1];
                }
            }
        });
        
        // add 메소드 사용하기 위해 리스트 선언 해서 담아줄 예정
        ArrayList<int[]> list = new ArrayList<int[]>();
        
     // 사람들 배열에서 하나씩 빼서 
       for(int[] p: people)
       {
           // k에 맞게 정렬 배열 추가 
            list.add(p[1],p);    
       }

        // 솔루션 리턴값이 int형 2차원배열이니 변환 
        return list.toArray(new int[people.length][2]);
        
    }
}
