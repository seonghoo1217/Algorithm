package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _3 {

    public ArrayList<Integer> solution(int i,int n,int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int k=0;k<n-1;k++){
            map.put(arr[k],map.getOrDefault(arr[k],0)+1);
        }
        int lt=0;
        for (int rt=n-1;rt<i;rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if (map.get(arr[lt])==0)map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        _3 N=new _3();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int n = kb.nextInt();
        int[] arr =new int[i];
        for (int k=0;k<i;k++){
            arr[k]=kb.nextInt();
        }
        for(int x:N.solution(i,n,arr)) System.out.print(x+ " ");;
    }
}
