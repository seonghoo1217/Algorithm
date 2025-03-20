package _2025.tech_interview;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }


    public static void main(String[] args) {
        JadenCase문자열만들기 s = new JadenCase문자열만들기();

        System.out.println(s.solution("3people unFollowed me"));
    }
}
