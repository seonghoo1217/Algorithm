package chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class _6 {

    public int solution(int i,int n){
        int answer=0;
        Queue<Integer> Q=new LinkedList<>();
        for (int k=1;k<=i;k++)Q.offer(k);
        while (!Q.isEmpty()){
            for (int k=1;k<n;k++){
                Q.offer(Q.poll());
            }
            Q.poll();
            if (Q.size()==1) answer=Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        _6 N=new _6();
        Scanner kb =new Scanner(System.in);
        int i = kb.nextInt();
        int n = kb.nextInt();
        System.out.println(N.solution(i,n));
    }
}
