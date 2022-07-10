package programers.level1.kakao;

import java.util.ArrayList;

public class 비밀지도 {
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String s="";
            String s1="";
            for (int i=0;i<n;i++){
                answer[i]="";
                s+="0";
                s1+="0";
            }
            ArrayList<String> sarr1=new ArrayList<>();
            ArrayList<String> sarr2=new ArrayList<>();

            for (int i=0;i<n;i++){
                String x = s.substring(Integer.toBinaryString(arr1[i]).length(), n);
                String x2 = s1.substring(Integer.toBinaryString(arr2[i]).length(), n);
                sarr1.add(x+=Integer.toBinaryString(arr1[i]));
                sarr2.add(x2+=Integer.toBinaryString(arr2[i]));
            }
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if ((sarr1.get(i).charAt(j)=='1'&&sarr2.get(i).charAt(j)=='1')||(sarr1.get(i).charAt(j)=='0'&&sarr2.get(i).charAt(j)=='1')||(sarr1.get(i).charAt(j)=='1'&&sarr2.get(i).charAt(j)=='0')) answer[i]+="#";
                    else answer[i]+=" ";
                }
            }

            for (int i=0;i<answer.length;i++){
                System.out.println("answer = " + answer[i]);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int arr[]={9, 20, 28, 18, 11};
        int arr2[]={30, 1, 21, 17, 28};
        solution.solution(5,arr,arr2);
    }
}
