package baekjun.string;

import java.io.*;
import java.util.Arrays;

public class _1431 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String [] arr=new String[N];
		for (int i=0;i<N;i++){
			arr[i]=br.readLine();
		}

		Arrays.sort(arr,((o1, o2) -> {
			if (o1.length() < o2.length()) {
				return -1;
			}
			else if (o1.length() == o2.length()) {
				if (add(o1)==add(o2)){
					return o1.compareTo(o2);
				}
				else {
					return Integer.compare(add(o1),add(o2));
				}
			}
			else {
				return 1;
			}
		}));

		StringBuilder sb=new StringBuilder();
		for (int i=0;i<arr.length;i++){
			sb.append(arr[i]).append("\n");
		}

		System.out.println(sb);
	}
	public static int add(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				sum+=s.charAt(i)-'0';
			}
		}
		return sum;
	}
}
