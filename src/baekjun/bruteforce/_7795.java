package baekjun.bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _7795 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb=new StringBuilder();
		for (int i=0;i<N;i++){
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			int [] arr1=new int[A];
			int [] arr2=new int[B];

			st=new StringTokenizer(br.readLine());
			for (int k=0;k<A;k++){
				arr1[k]=Integer.parseInt(st.nextToken());
			}

			st=new StringTokenizer(br.readLine());
			for (int k=0;k<B;k++){
				arr2[k]=Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr2);

			int cnt=0;
			for (int k=0;k<arr1.length;k++){
				for (int j=B-1;j>=0;j--){
					if (arr1[k]>arr2[j]){
						cnt+=j+1;
						break;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}

}
