package baekjun.dataStructure.stack;

import java.io.*;
import java.util.Stack;

public class _3986 {
	//34m29s02
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		boolean [] check=new boolean[N];
		int count=0;

		for (int i=0;i<N;i++){
			Stack<Character> stack=new Stack<>();
			char[] arr = br.readLine().toCharArray();
			for (char x:arr){
				if (stack.isEmpty()||stack.peek()!=x){
					stack.push(x);
				}else if (stack.peek()==x){
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				check[i]=true;
			}
		}
		for (int i=0;i<N;i++){
			if (check[i]) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
