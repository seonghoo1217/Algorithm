package baekjun.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int num = 0;

        while(!str.equals("0 0 0")) {
            num++;
            String vacNum[] = str.split(" ");
            int L = Integer.parseInt(vacNum[0]);
            int P = Integer.parseInt(vacNum[1]);
            int V = Integer.parseInt(vacNum[2]);
            System.out.println(V%P);
            int result = (V / P) * L + Math.min((V % P), L);
            bw.write("Case "+ num +": " + result+"\n" );
            str = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}
