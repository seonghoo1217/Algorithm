package baekjun.math;

import java.io.*;

public class _1748 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    int count=0;
	    int plus=1;
	    int num=10;
	    int N=Integer.parseInt(br.readLine());

	    for (int i=1;i<=N;i++){
	    	if (i%num==0){
	    		plus++;
	    		num*=10;
			}
	    	count+=plus;
		}
	    bw.write(String.valueOf(count));
	    bw.flush();
	    bw.close();
	}
}
