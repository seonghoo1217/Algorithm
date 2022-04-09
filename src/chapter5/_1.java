package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class _1 {

    public String solution(String str){
        /*String answer="NO";
        int lcnt=0,rcnt=0;
        for (char x:str.toCharArray()){
            if (x=='(')lcnt++;
            else rcnt ++;
        }
        if (lcnt==rcnt)answer="YES";
        return answer;*/
        String answer="YES";
        Stack<Character> stack=new Stack<>();
        for (char x:str.toCharArray()){
            if(x=='(') stack.push(x);
            else {
                if (stack.isEmpty())return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        _1 N=new _1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(N.solution(str));
    }
}
