package chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int warn;
    public Person(int id, int warn) {
        this.id = id;
        this.warn = warn;
    }
}

public class _8 {

    public int solution(int i,int n,int arr[]){
        int answer=0;
        Queue<Person> Q=new LinkedList<>();
        for (int k=0;k<i;k++){
            Q.offer(new Person(k,arr[k]));
        }
        while (!Q.isEmpty()){
            Person tmp=Q.poll();
            for (Person x:Q){
                if(x.warn>tmp.warn){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp !=null){
                answer++;
                if(tmp.id==n) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _8 N=new _8();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int n = kb.nextInt();
        int []arr=new int[i];
        for (int k=0;k<i;k++){
            arr[k]=kb.nextInt();
        }
        System.out.println(N.solution(i,n,arr));
    }
}
