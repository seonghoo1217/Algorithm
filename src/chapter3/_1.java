package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class _1 {

    public void solution(int n1,int n2,int arr1[],int arr2[]){
        int []answer=new int[n1+n2];
        System.arraycopy(arr1,0,answer,0,arr1.length);
        System.arraycopy(arr2,0,answer,arr1.length,arr2.length);
        /*Arrays.sort(answer);
        for (int x:answer){
            System.out.print(x+" ");
        }*/
        for (int i=0;i<answer.length;i++){
            for (int j=i+1;j<answer.length;j++){
                if(answer[i]>answer[j]){
                    int tmp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=tmp;
                }
            }
        }

        for (int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }

    public static void main(String[] args) {
        _1 N=new _1();
        Scanner kb=new Scanner(System.in);
        int n1 = kb.nextInt();
        int [] arr1=new int[n1];
        for (int i=0;i<n1;i++){
            arr1[i]= kb.nextInt();
        }
        int n2 = kb.nextInt();
        int [] arr2=new int[n2];
        for (int i=0;i<n2;i++){
            arr2[i]= kb.nextInt();
        }
        N.solution(n1,n2,arr1,arr2);
    }
}
