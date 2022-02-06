package chapter2;

import java.util.*;

public class _4 {

    public void solution(int i){
        int num1=1,num2=1;
        System.out.print(num1+" "+num2+" ");
        int tmp;
        for (int k=2;k<i;k++){
            tmp=num1+num2;
            System.out.print(tmp+" ");
            num1=num2;
            num2=tmp;
        }
    }

    public static void main(String[] args) {
        _4 N=new _4();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        N.solution(i);
    }
}
