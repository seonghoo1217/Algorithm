package chapter1;

import java.util.*;

public class PalindromeString {

    public String solution(StringBuilder str){
        String answer="";
        if(str.toString().toUpperCase().equals(str.reverse().toString().toUpperCase())){
            answer="YES";
        }else {
            answer="NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        PalindromeString P=new PalindromeString();
        Scanner kb=new Scanner(System.in);
        StringBuilder str= new StringBuilder(kb.next());
        System.out.println(P.solution(str));
    }
}
