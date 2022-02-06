package chapter2;

import java.util.*;

public class _1 {

    public ArrayList<String> solution(int i,String[] str){
        ArrayList<String> answer=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for (String x:str){
            if(Integer.parseInt(x)>min){
                min=Integer.parseInt(x);
                answer.add(x);
            }else {
                min=Integer.parseInt(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _1 N=new _1();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        String[]str=new String[i];
        for (int k=0;k<i;k++){
            str[k]=kb.next();
        }
        for (String x:N.solution(i,str)){
            System.out.print(x+" ");
        }
    }
}
