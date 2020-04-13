class Solution {
    public static int size = 0;
    public int largestPerimeter(int[] A) {
        size = A.length;
        mergeSort(A,0,size-1);
        size = A.length;
        int sum = 0;
        while(size-3 >= 0) {
            System.out.println(11);
            if(A[size-1] < (A[size-2]+A[size-3] )) {
                sum = A[size-1] + A[size-2] + A[size-3];
                break;
            } else {
                size--;
            }
        }
        return sum;
    }
    
    public static void mergeSort(int arr[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	public static void merge(int arr[], int l, int mid, int r) {
		int i = l;
		int j = mid+1;
		int k = l;
		int temp[] = new int[arr.length];
		while(i<=mid && j<=r) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=r)
			temp[k++] = arr[j++];
		for(int index=l; index<k; index++)
			arr[index] = temp[index];
	}
}
