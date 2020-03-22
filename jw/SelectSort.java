package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] tmp = {5,4,3,2,1};
        int[] test = sort(tmp);
        for(int i : test) {
            System.out.println(i);
        }
    }

    public static int[] sort(int[] unSortedArray) {
        int size = unSortedArray.length;
        int tmp, min;
        for(int i=0;i<size;i++) {
            min = i;
            for(int j=i+1;j<size;j++) {
                if(unSortedArray[min] > unSortedArray[j]) {
                    min = j;
                }
            }
            tmp = unSortedArray[i];
            unSortedArray[i] = unSortedArray[min];
            unSortedArray[min] = tmp;
        }
        // Has been sorted.
        return unSortedArray;
    }
}
