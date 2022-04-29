package programers.level1.kakao;

import java.util.*;

public class NumberWord {
    public int solution(String s) {
        int answer = 0;
        Map<String, String> number = new HashMap<String, String>();

        number.put("zero", "0");
        number.put("one", "1");
        number.put("two", "2");
        number.put("three", "3");
        number.put("four", "4");
        number.put("five", "5");
        number.put("six", "6");
        number.put("seven", "7");
        number.put("eight", "8");
        number.put("nine", "9");

        List<String> nList = new ArrayList<String>(number.keySet());
        for (int i = 0; i < nList.size(); i++) {
            s = s.replaceAll(nList.get(i), number.get(nList.get(i)));
        }
        answer = Integer.parseInt(s);
        return answer;

    }

    public static void main(String[] args) {
        NumberWord N=new NumberWord();
        Scanner kb=new Scanner(System.in);
        String s = kb.next();
        System.out.println(N.solution(s));
    }
}

