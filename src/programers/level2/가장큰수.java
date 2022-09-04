package programers.level2;

import java.util.ArrayList;
import java.util.Collections;

public class 가장큰수 {
    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int i=0;i<numbers.length;i++){
                if (numbers[i]==1000){
                    arrayList.add(1);
                    arrayList.add(0);
                    arrayList.add(0);
                    arrayList.add(0);
                }else if(numbers[i]>=100){
                    arrayList.add(Integer.parseInt(String.valueOf(String.valueOf(numbers[i]).charAt(0))));
                    arrayList.add(Integer.parseInt(String.valueOf(String.valueOf(numbers[i]).charAt(1))));
                    arrayList.add(Integer.parseInt(String.valueOf(String.valueOf(numbers[i]).charAt(2))));
                }else if (numbers[i]>=10){
                    arrayList.add(Integer.parseInt(String.valueOf(String.valueOf(numbers[i]).charAt(0))));
                    arrayList.add(Integer.parseInt(String.valueOf(String.valueOf(numbers[i]).charAt(1))));
                }else {
                    arrayList.add(Integer.parseInt(String.valueOf(String.valueOf(numbers[i]).charAt(0))));
                }
            }
            Collections.sort(arrayList,Collections.reverseOrder());
            for (int i=0;i<arrayList.size();i++){
                answer+=arrayList.get(i);
            }
            System.out.println("answer = " + answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] arr={6, 10, 2};
        solution.solution(arr);
    }
}
