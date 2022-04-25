package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class _6 {

    public int solution(int i,int n){
        int answer;
        Stack<Integer> stack=new Stack<>();
        while (true){
            for(int k=0;k<i;k++){
                System.out.println(k);
                if (k==n) stack.pop();
                else stack.push(k);
                System.out.println("stack = " + stack);
            }
        }
    }

    public static void main(String[] args) {
        _6 N=new _6();
        Scanner kb =new Scanner(System.in);
        int i = kb.nextInt();
        int n = kb.nextInt();
        System.out.println(N.solution(i,n));
    }
}
