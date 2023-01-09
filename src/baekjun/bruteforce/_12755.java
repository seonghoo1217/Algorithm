package baekjun.bruteforce;

import java.io.*;

public class _12755 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int i=0;
		while (N>0){
			i++;
			String num = String.valueOf(i);
			N-=num.length();
			if (N<=0){
				bw.write(num.charAt(num.length()-1+N));
			}
		}
		bw.flush();
	}
}
