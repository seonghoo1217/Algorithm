package chapter3;

import java.util.Scanner;

public class _6 {

    public int solution(int i,int n,int [] arr){
        int answer=0,cnt=0,lt=0;
        for (int rt=0; rt<i;rt++){
            if(arr[rt]==0)cnt++;
            while (cnt>n){
                if (arr[lt]==0)cnt --;
                lt ++;
            }
            answer=Math.max(answer,rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        _6 N= new _6();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int n = kb.nextInt();
        int [] arr=new int[i];
        for (int j=0;j<i;j++){
            arr[j]=kb.nextInt();
        }
        System.out.print(N.solution(i,n,arr));
    }
}
