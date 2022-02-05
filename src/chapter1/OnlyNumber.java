package chapter1;
import java.util.*;
public class OnlyNumber {

    public int solution(String str){
        String answer="";
        for (char x:str.toCharArray()){
            if(!Character.isAlphabetic(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        OnlyNumber O=new OnlyNumber();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(O.solution(str));
    }
}
