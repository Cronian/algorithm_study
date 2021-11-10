package project_2021_11_09;

public class SelectionSort {
    // i와 j의 위치를 바꾸는 함수
    // 요소의 크기와 첫 번째 위치를 알고 있다면 한 번의 곱셈과 덧셈으로 어떤 요소의 위치라도 알 수 있기 때문에
    // 요소를 읽고 쓰는 것은 상수 시간 연산.

    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // start로부터 시작하는 최소값의 위치를 찾고 배열의 마지막 위치로 이동
    // start = 0, indexLowest는 전체 배열을 검색. -> 전체 비교 횟수는 배열의 길이인 n이 된다.
    // start 인자가 1인 경우 비교 횟수는 n-1이 된다.
    // 일반적으로 비교 횟수는 n-start가 되어 indexLowest는 선형.
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;

        for(int i=start; i<array.length; i++) {
            if(array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }

        return lowIndex;
    }

    // 배열 정렬
    // 0에서 n-1까지 반복하므로 n번 반복.
    // 매번 indexLowest 메서드를 호출하고 상수 시간 연산인 swapElements를 실행.
    // indexLowest가 처음 호출되면 n번 비교 연산을 한다.
    // 두 번째는 n-1번비교, 세 번째는 n-2...  => n + n-1 + n-2 + ... + 1 + 0
    // 이 수열의 합은 n(n+1)/2이고 n^2에 비례하기 때문에 해당 함수는 이차다.
    public static void selectionSort(int[] array) {
        for(int i=0; i<array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }
}
