package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class _3 {

    public int solution(int i,int n,int [][] arr,int [] arr2){
        Stack<Integer> stack=new Stack<>();
        int answer=0;
        for (int pos : arr2){
            for (int k=0;k<arr.length;k++){
                if(arr[k][pos-1]!=0){
                    int tmp=arr[k][pos-1];
                    arr[k][pos-1]=0;
                    if (!stack.isEmpty()&&stack.peek()==tmp){
                        answer+=2;
                        stack.pop();
                    }else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _3 N=new _3();
        Scanner kb= new Scanner(System.in);
        int i = kb.nextInt();
        int arr[][]=new int[i][i];
        for (int k=0; k<i;k++){
            for (int j=0;j<i;j++){
                arr[k][j]= kb.nextInt();
            }
        }
        int n=kb.nextInt();
        int arr2[]=new int[n];
        for (int k=0;k<n;k++){
            arr2[k]= kb.nextInt();
        }
        System.out.println(N.solution(i,n,arr,arr2));
    }
}
