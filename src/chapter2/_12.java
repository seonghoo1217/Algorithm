package chapter2;

import java.util.Scanner;

public class _12 {

    public int solution(int i,int n,int [][] arr){
        int answer=0;
        for (int k=1;k<=i;k++){
            for (int j=1;j<=i;j++){
                int count=0;
                for (int x=0;x<n;x++){
                    int pi=0,pj=0;
                    for (int s=0;s<i;s++){
                        if (arr[x][s]==k)pi=s;
                        if (arr[x][s]==j)pj=s;
                    }
                    if (pi<pj) count++;
                }
                if (count==n){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _12 N= new _12();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int n= kb.nextInt();
        int[][] arr = new int[n][i];
        for (int k=0;k<i;k++){
            for (int j=0;j<n;j++){
                arr[k][j]=kb.nextInt();
            }
        }
        System.out.println(N.solution(i,n,arr));
    }
}
