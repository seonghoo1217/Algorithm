package baekjun.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _11582 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr=new ArrayList<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<N;i++){
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int cnt = Integer.parseInt(br.readLine());

		int loop=N/cnt;

		ArrayList<Integer> answer= new ArrayList<>();
		for (int i=0;i<N;i+=loop){
			ArrayList<Integer> temp= new ArrayList<>(arr.subList(i,i+loop));
			Collections.sort(temp);
			answer.addAll(temp);
		}

		for (int i=0;i<answer.size();i++){
			System.out.print(answer.get(i)+" ");
		}
	}
}
