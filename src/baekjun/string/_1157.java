package baekjun.string;

import java.io.*;

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26]; // 영문자의 개수는 26개임
        String s = br.readLine();


        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 97]++;
            } else {
                arr[s.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
