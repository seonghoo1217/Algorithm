package baekjun.sort;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1620 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());

		HashMap<String,Integer> pocket_mon=new HashMap<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] name=new String[N+1];
		StringBuilder sb=new StringBuilder();

		for (int i=1;i<=N;i++){
			String pocketmon_name = br.readLine();
			pocket_mon.put(pocketmon_name,i);
			name[i]=pocketmon_name;
		}

		while (M-->0){
			String findQ = br.readLine();
			if (findQ.matches("^[0-9]*$")){
				sb.append(name[Integer.parseInt(findQ)]).append("\n");
			}
			else {
				sb.append(pocket_mon.get(findQ)).append("\n");
			}
		}

		System.out.println(sb);
	}
}
