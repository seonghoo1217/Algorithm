package baekjun.dataStructure.list;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _1337 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	    int N = Integer.parseInt(br.readLine());
		List<Integer> num_list=new ArrayList<>();

		for (int i=0;i<N;i++){
			num_list.add(Integer.parseInt(br.readLine()));
		}
		num_list.sort(Comparator.naturalOrder());
		int max=0;
		int cnt = 0;
		int end = N<5 ? 1 : N;

		for(int i = 0; i <end;i++){
			int standardNum = num_list.get(i)+4;
			for(int j = 0; j < N-i;j++){
				int compareNum = num_list.get(i+j);
				if(standardNum >= compareNum){
					cnt++;
				} else{
					break;
				}
			}
			if(cnt>max) max = cnt;
			cnt=0;

		}
		System.out.println(5-max);
	}
}
