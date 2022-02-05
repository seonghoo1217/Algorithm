package chapter1;

import java.util.*;

public class Palindrome {

    public String solution(String str){
        String answer="NO";
        str=str.toUpperCase().replaceAll("[^A-Z]","");

        if(str.equals(new StringBuilder(str).reverse().toString())){
            answer="YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome P= new Palindrome();
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(P.solution(str));
    }
}
