package chapter6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class _1 {

    public ArrayList<Integer> solution(int arr[]){
        ArrayList<Integer> arrayList=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int a:arr){
            arrayList.add(a);
        }
        arrayList.sort(Comparator.naturalOrder());

        return arrayList;
    }


    public static void main(String[] args) {
        _1 N=new _1();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int arr[]=new int[i];
        for (int n=0;n<i;n++){
            arr[n] = kb.nextInt();
        }
        for (int n:N.solution(arr)) System.out.print(n+" ");
    }
}
