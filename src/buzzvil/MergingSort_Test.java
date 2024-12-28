package buzzvil;

public class MergingSort_Test {
    public static void main(String[] args) {
        int[] A = {1, 2, 7, 9, 10};
        int[] B = {1, 4, 5, 11};

        int[] temp = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = B[j++];
            }
        }

        while (i < A.length) {
            temp[k++] = A[i++];
        }

        while (j < B.length) {
            temp[k++] = B[j++];
        }
    }
}
