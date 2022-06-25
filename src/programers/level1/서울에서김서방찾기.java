package programers.level1;

public class 서울에서김서방찾기 {
    static class Solution {
        public String solution(String[] seoul) {
            String answer = "";
            int count=0;
            for (String x:seoul){
                if (x.equals("Kim")) break;
                else count++;
                answer="김서방은 "+count+"에 있다";
            }
            System.out.println("answer = " + answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String arr[]={"lee","seo","jang","Kim","park"};
        solution.solution(arr);
    }
}
