package chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class _4 {

    public int solution(String str1,String str2){
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        int answer=0;
        for (char x:str2.toCharArray()) map2.put(x,map2.getOrDefault(x,0)+1);
        for (int k=0;k<str2.length()-1;k++){
            map.put(str1.charAt(k),map.getOrDefault(str1.charAt(k),0)+1);
        }
        int lt=0;
        for (int rt=str2.length()-1;rt<str1.length();rt++){
            map.put(str1.charAt(rt),map.getOrDefault(str1.charAt(rt),0)+1);
            if (map.equals(map2))answer++;
            map.put(str1.charAt(lt),map.get(str1.charAt(lt))-1);
            if (map.get(str1.charAt(lt))==0)map.remove(str1.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        _4 N=new _4();
        Scanner kb= new Scanner(System.in);
        String str1= kb.next();
        String str2=kb.next();
        System.out.println(N.solution(str1,str2));
    }
}
