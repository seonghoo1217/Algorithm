package chapter2;

import java.util.Scanner;

public class _7 {

    public void solution(int i,int[] arr) {
        int answer = 0,count = 0;
        for (int k = 0; k < i; k++) {
            if (arr[k] == 1) {
                count++;
                answer += count;
            }else {
                count=0;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        _7 N=new _7();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        int arr[]=new int[i];
        for (int k=0;k<i;k++){
            arr[k]=kb.nextInt();
        }

        N.solution(i,arr);
    }
}
