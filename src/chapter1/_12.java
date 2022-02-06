package chapter1;

import java.util.*;

public class _12 {

    public String solution(int i,String str){
        String answer="";
        for (int k=0;k<i;k++){
            String tmp=str.substring(0,7).replace("#","1").replace("*","0");
            int num=Integer.parseInt(tmp,2);
            answer+=(char)num;
            str=str.substring(7);
        }
        return answer;
    }


    public static void main(String[] args) {
        _12 N =new _12();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        String str=kb.next();
        System.out.println(N.solution(i,str));
    }
}
