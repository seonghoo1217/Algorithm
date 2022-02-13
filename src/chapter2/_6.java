package chapter2;

import java.util.*;


public class _6 {
    public boolean isPrime(int k){
        if(k==1) return false;
        for (int i=2;i<k;i++){
            if(k%i==0)return false;
        }
        return true;
    }


    public void solution(StringBuilder[] str){
        int k;
        for (StringBuilder x:str){
            k=Integer.parseInt(x.reverse().toString());
            if(isPrime(k)) System.out.print(k+" ");
        }
    }

    public static void main(String[] args) {
        _6 N=new _6();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        StringBuilder[] str= new StringBuilder[i];
        for(int k=0;k<i;k++){
            str[k]= new StringBuilder(kb.next());
        }
        N.solution(str);
    }
}
