package baekjun.sort;

import java.util.Scanner;

public class _10814카운팅정렬 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N = scanner.nextInt();

        StringBuilder[]p=new StringBuilder[201];

        for (int i=0;i<p.length;i++){
            p[i]=new StringBuilder();
        }

        for (int i=0;i<N;i++){
            int age = scanner.nextInt();
            String name = scanner.next();
            p[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb=new StringBuilder();
        for (StringBuilder x: p){
            sb.append(x);
        }

        System.out.println(sb);
    }
}
