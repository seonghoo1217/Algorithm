package chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7 {


    public String solution(String str1,String str2){
        String answer="YES";
        Queue<Character> Q=new LinkedList<>();
        for (int i=0;i<str1.length();i++) Q.offer(str1.charAt(i));
        for (int i=0;i<str2.length();i++) {
            if(Q.contains(str2.charAt(i))){
                if (str2.charAt(i)!=Q.poll())return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        _7 N=new _7();
        Scanner kb=new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(N.solution(str1,str2));
    }
}
