package buzzvil;

import java.util.Arrays;

public class MergeSort_FeedBack {
    public static void main(String[] args) {
        int[] A = {38, 27, 43, 3, 9, 82, 10};
        int[] B = {1, 4, 5, 11, 12};

        // 두 배열을 병합하고 정렬
        int[] mergedSortedArray = mergeSortedArrays(A, B);

        // 결과 출력
        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedSortedArray));
    }

    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int[] mergedArray = new int[A.length + B.length];
        mergeSort(A, 0, A.length - 1);
        mergeSort(B, 0, B.length - 1);
        int i = 0, j = 0, k = 0;

        // 두 정렬된 배열을 병합
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                mergedArray[k++] = A[i++];
            } else {
                mergedArray[k++] = B[j++];
            }
        }

        // A 배열의 남은 요소 복사
        while (i < A.length) {
            mergedArray[k++] = A[i++];
        }

        // B 배열의 남은 요소 복사
        while (j < B.length) {
            mergedArray[k++] = B[j++];
        }

        return mergedArray;
    }

    // 병합 정렬 함수
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 왼쪽 절반 정렬
            mergeSort(array, left, mid);

            // 오른쪽 절반 정렬
            mergeSort(array, mid + 1, right);

            // 정렬된 배열 병합
            merge(array, left, mid, right);
        }
    }

    // 병합 함수
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1; // 왼쪽 배열의 크기
        int n2 = right - mid;    // 오른쪽 배열의 크기

        // 임시 배열 생성
        int[] L = new int[n1];
        int[] R = new int[n2];

        // 왼쪽 배열 복사
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }

        // 오른쪽 배열 복사
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        // 병합 과정
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        // 남은 요소 복사
        while (i < n1) {
            array[k++] = L[i++];
        }
        while (j < n2) {
            array[k++] = R[j++];
        }
    }
}
