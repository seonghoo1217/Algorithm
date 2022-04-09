package chapter4;

import java.util.*;

public class _5 {

    public int solution(int i,int n,int [] arr){
        int answer = 0;
        TreeSet<Integer> Tset=new TreeSet<>(Collections.reverseOrder());

        for (int j=0;j<i;j++){
            for (int k=j+1;k<i;k++){
                for (int l=k+1;l<i;l++){
                    Tset.add(arr[j]+arr[k]+arr[l]);
                }
            }
        }
        int cnt=0;
        for (int x:Tset){
            cnt++;
            if (cnt==n){
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _5 N=new _5();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int n = kb.nextInt();
        int [] arr=new int[i];
        for (int k=0;k<i;k++){
            arr[k]=kb.nextInt();
        }
        System.out.println(N.solution(i,n,arr));
    }
}
