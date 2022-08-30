package algorithm.InsertionSort;

public class 삽입정렬예제 {
    public static void main(String[] args) {
        int[] arr ={3,5,5,66,3,1,2,44};
        insertion_sort(arr,arr.length);
    }

    private static void insertion_sort(int[] arr, int length) {
        for (int i=1;i<arr.length;i++){
            int target=arr[i];

            int j=i-1;

            while (j>=0 && target<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=target;
        }
    }
}
