package chapter1;
import java.util.*;
public class _11 {

    public String solution(String str){
        String answer="";
        int count=1;
        str=str+" ";
        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                answer+=str.charAt(i);
                if(count>1){
                    answer+=String.valueOf(count);
                    count=1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        _11 N=new _11();
        Scanner kb=new Scanner(System.in);
        String str = kb.next();
        System.out.println(N.solution(str));
    }
}
