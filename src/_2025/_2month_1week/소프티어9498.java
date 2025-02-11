package _2025._2month_1week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 소프티어9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String S = br.readLine().trim();

        Stack<List<String>> stack = new Stack<>();
        stack.push(new ArrayList<>());

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(') {
                stack.push(new ArrayList<>());
            } else {
                List<String> subList = stack.pop();
                String expr;

                if (subList.isEmpty()) {
                    expr = "(1)";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < subList.size(); j++) {
                        if (j > 0) {
                            sb.append("+");
                        }
                        sb.append(subList.get(j));
                    }
                    expr = "(" + sb.toString() + ")";
                }

                stack.peek().add(expr);
            }
        }
        List<String> resultList = stack.pop();
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resultList.size(); i++) {
            if (i > 0) {
                result.append("+");
            }
            result.append(resultList.get(i));
        }

        System.out.println(result);
    }
}