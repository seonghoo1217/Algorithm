package chapter1;
import java.util.Scanner;

public class ExistWordRemove {

    public String solution(String str){
        String answer="";
        for (int i=0;i<str.length();i++){
            // System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)))
            if(i==str.indexOf(str.charAt(i))){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        ExistWordRemove E=new ExistWordRemove();
        String str= kb.next();
        System.out.println(E.solution(str));
    }
}
