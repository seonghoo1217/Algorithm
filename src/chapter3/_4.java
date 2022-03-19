package chapter3;

import java.util.Scanner;

public class _4 {

    public int solution(int n1, int n2, int [] arr){
        /*int answer=0;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            for (int k=i+1;k<arr.length;k++){
                sum+=arr[k];
                if (sum==n2){
                    answer++;
                    break;
                }else if(sum>6) {
                    break;
                }
            }
            sum=0;
        }
        System.out.print(answer);*/
        int answer=0,sum=0,lt=0;
        for (int rt=0;rt<n1;rt++){
            sum+=arr[rt];
            if (sum==n2)answer++;
            while (sum>=n2){
                sum-=arr[lt++];
                if(sum==n2) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        _4 N=new _4();
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int[] arr=new int[n1];
        for (int i=0;i<n1;i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(N.solution(n1,n2,arr));
    }
}
