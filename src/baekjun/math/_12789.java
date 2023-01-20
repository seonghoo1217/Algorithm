package baekjun.math;

import java.io.*;
import java.util.*;

public class _12789 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st=new StringTokenizer(br.readLine());

		Queue<Integer> queue=new LinkedList<>();
		Stack<Integer> stack=new Stack<>();
		List<Integer> list=new ArrayList<>();

		for (int i=0;i<N;i++){
			queue.add(Integer.parseInt(st.nextToken()));
		}

		int cnt=1;
		while (!queue.isEmpty()){
			if(queue.peek()==cnt){
				list.add(queue.poll());
				cnt++;
			}else if(!stack.isEmpty()&&stack.peek()==cnt){
				stack.pop();
				cnt++;
			}else {
				stack.push(queue.poll());
			}
		}
		while (!stack.isEmpty()){
			if (stack.peek()==cnt){
				stack.pop();
				cnt++;
			}else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
	}
}
