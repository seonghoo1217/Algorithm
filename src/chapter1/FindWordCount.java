package chapter1;

import java.util.*;

public class FindWordCount {

    public int solution(String str,char t){

        int answer=0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        //System.out.println(str+" "+t);
        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i)==t){
                answer+=1;
            }
        }*/
        for(char x:str.toCharArray())
            if(x==t){
                answer++;
            }
        return  answer;
    }


    public static void main(String[] args){
        FindWordCount F = new FindWordCount();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        System.out.println(F.solution(str,c));

    }
}