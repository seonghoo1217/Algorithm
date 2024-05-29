package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class _412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String temp = "";
            if (isFizz(i)) {
                temp += "Fizz";
            }
            if (isBUzz(i)) {
                temp += "Buzz";
            }
            if (temp.isEmpty()) {
                temp = String.valueOf(i);
            }
            answer.add(temp);
        }
        return answer;
    }

    public boolean isFizz(int i) {
        return i % 3 == 0;
    }

    public boolean isBUzz(int i) {
        return i % 5 == 0;
    }
}
