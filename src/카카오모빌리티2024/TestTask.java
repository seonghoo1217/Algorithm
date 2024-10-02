package 카카오모빌리티2024;

public class TestTask {

    public int solution(int[] A) {
        int N = A.length;
        boolean[] present = new boolean[N + 1];

        for (int num : A) {
            if (num > 0 && num <= N) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return N + 1;
    }

    public static void main(String[] args) {
        TestTask testTask = new TestTask();
        int a[] = {1, 2, 3};
        System.out.println(testTask.solution(a));
    }

}
