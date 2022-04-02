package chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class _2 {

    public String solution(String str1,String str2){
        String answer="YES";
        HashMap<Character,Integer>map =new HashMap<>();
        for (char x:str1.toLowerCase().toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (char x:str2.toLowerCase().toCharArray()){
            if(!map.containsKey(x)||map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        _2 N=new _2();
        Scanner kb=new Scanner(System.in);
        String str1= kb.next();
        String str2=kb.next();
        System.out.println(N.solution(str1,str2));
    }
}
