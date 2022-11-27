package baekjun.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _16466 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		List<Long> list=new ArrayList<>();
		for (int i=0;i<N;i++){
			list.add(Long.parseLong(st.nextToken()));
		}
		int cnt=0;
		Collections.sort(list);
		for (int i=0;i<list.size();i++){
			if (list.get(i)!=i+1) {
				System.out.println(i+1);
				cnt++;
				break;
			}
		}

		if (cnt==0){
			System.out.println(list.size()+1);
		}
	}
}
