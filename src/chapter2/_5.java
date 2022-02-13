package chapter2;

import java.util.Scanner;

public class _5 {

    public int solution(int i){
        int answer=0;
        int [] num=new int[i+1];
        for (int k=2;k<=i;k++){
            if(num[k]==0){
                //System.out.println(k);
                answer++;
                for (int j=k;j<=i;j=j+k) {
                    //System.out.println("i="+i+"j="+j+"k="+k);
                    num[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _5 N=new _5();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        System.out.println(N.solution(i));
    }
}
