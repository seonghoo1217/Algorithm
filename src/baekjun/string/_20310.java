package baekjun.string;

import java.io.*;

public class _20310 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();

		char[] arr =str.toCharArray();
		int cnt0=0;
		int cnt1 = 0;

		for (int i=0;i<arr.length;i++){
			if (arr[i] == '0') cnt0++;
			else cnt1++;
		}
		cnt0/=2;
		cnt1/=2;

		for (int i = 0; i < str.length() && cnt1!=0; i++) {
			if (arr[i] == '1') {
				cnt1--;
				arr[i] = 0;
			}
		}

		for (int i = str.length()-1; i >= 0 && cnt0!=0; i--) {
			if (arr[i] == '0') {
				cnt0--;
				arr[i] = 0;
			}
		}

		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] != 0)
				answer.append(arr[i]);
		}
		System.out.println(answer);
	}
}
