package baekjun.sort;

import java.io.*;
import java.util.StringTokenizer;

public class _2960 {

	private static boolean[] prime;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		prime_num(N);
		int count = 0;
		for (int i=0;i< prime.length;i++){
			if (!prime[i]){
				count++;
				if (count==K) System.out.println(i);
			}
		}
	}

	private static void prime_num(int N){
		prime=new boolean[N+1];

		if (N<2){
			return;
		}
		prime[0]=prime[1]=true;

		for (int i=2;i<=Math.sqrt(N);i++){

			if (prime[i]){
				continue;
			}

			for (int j=i*i;j< prime.length;j=j+i){
				prime[j]=true;
			}
		}
	}
}
