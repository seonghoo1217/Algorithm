package programers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두개뽑아서더하기 {
    static class Solution {
        public int[] solution(int[] numbers) {
            int temp = 0;

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int n = i + 1; n < numbers.length; n++) {
                    temp = numbers[i] + numbers[n];
                    if (!arr.contains(temp)) arr.add(temp);
                }
            }
            Collections.sort(arr);

            int answer[] = new int[arr.size()];

            return arr.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
