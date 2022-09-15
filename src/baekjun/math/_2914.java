package baekjun.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int songs = Integer.parseInt(st.nextToken());
        int av = Integer.parseInt(st.nextToken());
        System.out.println(songs*(av-1)+1);
    }
}
