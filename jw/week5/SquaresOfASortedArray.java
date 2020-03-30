class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++) {
            A[i] = A[i]*A[i];
        }
        quickSort(A,0,A.length-1);
        return A;
    }
    
    public static void quickSort(int[] data, int l, int r) {
        // QuickSort 내 왼쪽 시작점
        int left = l;
        // QuickSort 내 오른쪽 시작점
        int right = r;
        // QuickSort 피벗 (중간점 값)
        int pivot = data[(l+r)/2];
        
        // 왼쪽과 오른쪽이 같거나 오른쪽이 왼쪽보다 작아질떄 까지 ㄱㄱ
        do{
            // 왼쪽값이 피벗값보다 작은경우 조건에 맞으므로 패스
            while(data[left] < pivot) left++;
            // 오른쪽값이 피벗보다 큰경우 조건에 맞으므로 패스
            while(data[right] > pivot) right--;
            // 위 조건에 부합하지 않는경우들이 left / right 인덱스로 물고있음
            //왼쪽과 오른쪽의 인덱스값이 같거나 오른쪽이 큰경우 서로 바꿈
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) quickSort(data, l, right);
        if(r > left) quickSort(data, left, r);
        }
}
