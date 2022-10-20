package baekjun.string;

import java.io.*;

public class _11140 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            String S = br.readLine();
            boolean matches = S.matches("[a-z]");
            if (S.contains("lol")) {
                sb.append("0").append("\n");
            }
            else if (S.contains("lo")||S.contains("ol")||S.contains("ll")||matches) {
                sb.append("1").append("\n");
            }
            else if (S.contains("l")||S.contains("o")){
                sb.append("2").append("\n");
            }
            else{
                sb.append("3").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
