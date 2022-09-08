package baekjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        PriorityQueue<student> q=new PriorityQueue<student>();

        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            q.add(new student(kor,eng,math,name));
        }

        while (!q.isEmpty()){
            student temp = q.poll();
            sb.append(temp.name).append("\n");
        }
        System.out.print(sb);
    }

    static class student implements Comparable<student>{
        int kor,eng,math;
        String name;

        public student(int kor, int eng, int math, String name) {
            super();
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.name = name;
        }

        @Override
        public int compareTo(student o) {
            if(this.kor==o.kor){
                if (this.eng==o.eng){
                    if (this.math==o.math){
                        return this.name.compareTo(o.name);
                    }
                    return o.math-this.math;
                }
                return this.eng-o.eng;
            }
            return o.kor - this.kor;
        }
    }
}
