package baekjun.string;

import java.io.*;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            char[] arr = br.readLine().toCharArray();
            int answer = 0;
            int cnt=0;
            for (int k=0;k<arr.length;k++){
                if (arr[k]=='O') cnt++;
                else {
                    cnt=0;
                }
                answer+=cnt;
            }
            sb.append(answer).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
