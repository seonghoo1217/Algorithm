package _2025._1month4week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 튜플 {
    public List<Integer> solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] sArr = s.split("-");

        Arrays.sort(sArr, Comparator.comparingInt(String::length));

        List<Integer> list = new ArrayList<>();

        for (String el : sArr) {
            String[] check = el.split(",");

            for (int i = 0; i < check.length; i++) {
                int num = Integer.parseInt(check[i]);

                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        return list;
    }
}
