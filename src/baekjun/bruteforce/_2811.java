package baekjun.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class _2811 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int [] arr=new int[N+1];

		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<N;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}

		boolean[] check=new boolean[N];
		int length=0,cnt=0,max=0;

		for (int i=N-1;i>=0;i--){
			if (arr[i]<0){
				length++;
			}

			for (int j=i+1-length*2;j<=i;j++){
				if (j>=0&&!check[j]){
					check[j]=true;
					cnt++;
				}
			}
			max=Math.max(max,length);
			length=0;
		}
		int maxday=0,result=0;

		for (int i=N-1;i>=0;i--){
			if (arr[i]<0){
				length++;
			}

			if (length==max){
				for (int j=i+1-length*3;j<=i;j++){
					if (j>=0&&!check[j]){
						maxday++;
					}
				}
			}

			result=Math.max(result,cnt+maxday);

			maxday=length=0;
		}
		System.out.println(result);
	}
}
