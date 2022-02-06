package chapter2;

import java.util.Scanner;

public class _3 {

    public String solution(int i,int[] a,int[] b){
        String answer="";
        for (int k=0;k<i;k++){
            if(a[k]==b[k])answer+="D";
            else if(a[k]==1&&b[k]==3)answer+="A";
            else if(a[k]==2&&b[k]==1)answer+="A";
            else if(a[k]==3&&b[k]==2)answer+="A";
            else answer+="B";
        }
        return answer;
    }

    public static void main(String[] args) {
        _3 N=new _3();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int []a=new int[i];
        int []b=new int[i];
        for (int k=0;k<i;k++){
            a[k]=kb.nextInt();
        }
        for (int k=0;k<i;k++){
            b[k]=kb.nextInt();
        }
        for(char x:N.solution(i,a,b).toCharArray()){
            System.out.println(x);
        };
    }
}
