package chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _8 {

    public int[] solution(int i,int[] arr){
        int []answer=new int[i];
        for (int k=0;k<i;k++){
            int count=1;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[k]){
                    count++;
                }
            }
            answer[k]=count;
        }
        return answer;
    }

    public static void main(String[] args) {
        _8 N=new _8();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        int [] arr=new int[i];
        for (int k=0;k<i;k++){
            arr[k]=kb.nextInt();
        }
        for (int x:N.solution(i,arr)) System.out.print(x+" ");
    }
}
