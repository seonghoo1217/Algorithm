package algorithm.selectionsort;

public class 선택정렬예제 {
    public static void main(String[] args) {
        int [] arr={2,3,5,1,1,1,2,4};
        selection_sort(arr,arr.length);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void selection_sort(int[] arr, int length) {
        for (int i=0;i<length-1;i++){
            int min_index=i;

            for (int j=i+1;j<length;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            swap(arr,min_index,i);
        }
    }

    private static void swap(int[] arr, int min_index, int i) {
        int temp=arr[min_index];
        arr[min_index]=arr[i];
        arr[i]=temp;
    }
}
