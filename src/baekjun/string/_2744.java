package baekjun.string;

import java.io.*;

public class _2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        char[] array = br.readLine().toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<array.length;i++){
            if('a'<=array[i]&&array[i]<='z'){
                sb.append(String.valueOf(array[i]).toUpperCase());
            }else {
                sb.append(String.valueOf(array[i]).toLowerCase());
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
