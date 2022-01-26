package chapter1;

import java.util.Scanner;

public class FindLongestWord {

    public String solution(String str){
        String answer="";

        int m =Integer.MIN_VALUE,pos;
        while ((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0,pos);
            if(tmp.length()>m){
                m=tmp.length();
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m)answer=str;
        return answer;
    }

    public static void main(String[] args) {
        FindLongestWord F=new FindLongestWord();
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(F.solution(str));
    }
}
