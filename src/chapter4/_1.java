package chapter4;


import java.util.HashMap;
import java.util.Scanner;

public class _1 {

    public char solution(int i,String str){
        char answer = 0;
        Integer max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for (char x:str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>max){
                max=map.get(x);
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _1 N=new _1();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        String str=kb.next();
        System.out.println(N.solution(i,str));
    }
}
