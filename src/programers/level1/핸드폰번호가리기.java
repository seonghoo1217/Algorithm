package programers.level1;

public class 핸드폰번호가리기 {
    static class Solution {
        public String solution(String phone_number) {
            char[] arr = phone_number.toCharArray();
            for (int i=0;i<arr.length-4;i++){
                arr[i]='*';
            }
            return String.valueOf(arr);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String p="01033334444";
        solution.solution(p);
    }
}
