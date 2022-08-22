package programers.level1;

public class 링딩동 {
    static class Solution {
        public String solution(String ex) {
            String answer="";
            for (char x:ex.toCharArray()){
                answer+=change(x);
            }
            System.out.println("answer = " + answer);
            return answer;
        }
    }
    public static String change(char x){
        if (x==' ') return "링디기디기\n";
        else if(x=='.') return "딩딩딩\n";
        else return "링딩동 ";
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution("나는 베짱이.");
    }
}
