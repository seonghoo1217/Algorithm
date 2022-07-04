package programers.level1.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class 다트게임 {
    static class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            int round[]=new int[3];
            char arr[]=dartResult.toCharArray();
            int window=-1;
            for (int i=0; i<arr.length;i++){
                if (arr[i]>='0'&&arr[i]<='9'){
                    window++;
                    round[window]+=Integer.parseInt(String.valueOf(arr[i]));

                    if (i+1!=arr.length-1&&arr[i+1]=='0'&&arr[i]=='1'){
                        round[window]-=Integer.parseInt(String.valueOf(arr[i]));
                        round[window]=10;
                        i++;
                    }
                }
                else if (arr[i]=='D') round[window]*=round[window];
                else if (arr[i]=='T') round[window]*=round[window]*round[window];
                else if (arr[i]=='*'){
                    if (window>0) round[window - 1] *= 2;
                    round[window] *= 2;
                }
                else if (arr[i]=='#'){
                    round[window]*=-1;
                }
            }
            answer=round[0]+round[1]+round[2];
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution("1S*2T#3S*");
    }
}
