package programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 가장큰수 {
    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] arr=new String[numbers.length];
            for (int i=0;i<numbers.length;i++){
                arr[i]= String.valueOf(numbers[i]);
            }

            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
//                    System.out.println("o1 = " + o1);
//                    System.out.println("o2 = " + o2);
                    return (o2+o1).compareTo(o1+o2);
                }
            });

            if (arr[0].equals("0")) return "0";

            /*Arrays.sort(numbers,(a,b)->{
                return a+b;
            });*/

//            System.out.println(String.join("",arr));
            return String.join("",arr);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] arr={6, 10, 2};
        solution.solution(arr);
    }
}
