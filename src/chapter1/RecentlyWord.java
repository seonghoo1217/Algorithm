package chapter1;
import  java.util.*;
public class RecentlyWord {

    public int[] solution(String str,char x){
        int [] answer=new int[str.length()];
        int p=100;

        for (int i=0;i<str.length();i++){
            if(x==str.charAt(i)){
                p=0;
            }else {
                p++;
            }
            answer[i]=p;
        }
        p=1000;
        for(int i=str.length()-1;i>=0;i--){
            if(x==str.charAt(i)){
                p=0;
            }else {
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RecentlyWord R=new RecentlyWord();
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        char x=kb.next().charAt(0);
        for (int a: R.solution(str,x)){
            System.out.print(a+" ");
        }
    }
}
