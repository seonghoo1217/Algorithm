package chapter1;


import java.util.Scanner;

public class FindWordReverse {

    public String solution(char[] c){
        String answer="";
        int lt=0,rt=c.length-1;
        while (lt<rt){
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }
            else{
                char tmp=c[lt];
                c[lt]=c[rt];
                c[rt]=tmp;
                lt++;
                rt--;
            }
            answer=String.valueOf(c);
        }

        return answer;
    }


    public static void main(String[] args) {
        FindWordReverse F= new FindWordReverse();
        Scanner kb=new Scanner(System.in);

        char[] c = kb.next().toCharArray();
        System.out.println(F.solution(c));
    }
}
