package baekjun.bruteforce;

import java.io.*;

public class _10974 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int [] arr=new int[N];
		int [] output=new int[N];
		boolean [] visited=new boolean[N];

		for (int i=0;i<N;i++){
			arr[i]=i+1;
		}

		dfs(arr,output,visited,0,N,N);
	}

	private static void dfs(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth==r){
			print(output,r);
			return;
		}

		for (int i=0;i<n;i++){
			if (!visited[i]){
				visited[i]=true;
				output[depth]=arr[i];
				dfs(arr,output,visited,depth+1,n,r);
				visited[i]=false;
			}
		}
	}

	static void print(int [] arr,int r){
		for (int i=0;i<r;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
