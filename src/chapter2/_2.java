package chapter2;

import java.util.*;

public class _2 {

    public int solution(String[] str){
        int answer = 0;
        int min=Integer.MIN_VALUE;
        for (String x:str){
            if(Integer.parseInt(x)>min){
                min=Integer.parseInt(x);
                answer+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _2 N=new _2();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        String[]str=new String[i];
        for (int k=0;k<i;k++){
            str[k]=kb.next();
        }
        System.out.println(N.solution(str));
    }
}
