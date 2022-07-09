package programers.level1;

public class 가운데글가져오기 {
    static class Solution {
        public String solution(String s) {
            String answer = "";
            if (s.length()%2==1) answer+=s.charAt(s.length()/2);
            else answer+=String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution("qwerghja");
    }
}
