package baekjun.bruteforce;

import java.io.*;
import java.util.HashSet;

public class _5568 {
	private static HashSet<String> hashSet=new HashSet<>();
	private static String[] arr;
	private static int N;
	private static boolean[] visited;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		N= Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		arr=new String[N];
		for (int i=0;i<N;i++){
			arr[i]=br.readLine();
		}

		visited=new boolean[N];

		pick(K,"");

		System.out.println(hashSet.size());
	}

	private static void pick(int K, String card) {
		if (K==0){
			hashSet.add(card);
			return;
		}
		for (int i=0;i<N;i++){
			if (!visited[i]){
				visited[i]=true;
				pick(K-1,card+arr[i]);
				visited[i]=false;
			}
		}
	}
}
