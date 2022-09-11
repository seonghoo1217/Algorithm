package algorithm.heapsort;

public class 최대힙만들기 {
    public static void heapsort(int[] arr) {
        int size = arr.length;

        /*
         * 부모노드와 heaify과정에서 음수가 발생하면 잘못 된 참조가 발생하기 때문에
         * 원소가 1개이거나 0개일 경우는 정렬 할 필요가 없으므로 바로 함수를 종료한다.
         */
        if(size < 2) {
            return;
        }
        // 가장 마지막 노드의 부모 노드 인덱스
        int parentIdx = getParent(size - 1);

        // max heap 만들기
        for(int i = parentIdx; i >= 0; i--) {

            // 부모노드(i값)을 1씩 줄이면서 heap 조건을 만족시키도록 재구성한다.
            heapify(arr, i, size - 1);
        }

    }

    private static int getParent(int i) {
        /**
         * 부모 인덱스의 노드값을 가져오는 코드 생략
         */
        return 0;
    }


    // 힙을 만드는 함수
    private static void heapify(int[] a, int parentIdx, int lastIdx) {

		/*
		  heapify 코드(생략)
		 */
    }
}
