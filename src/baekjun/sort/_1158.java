package baekjun.sort;

import java.io.*;
import java.util.*;

public class _1158 {
	/*private static List<Integer> answer=new ArrayList<>();
	private static LinkedList<Integer> josephus =new LinkedList<>();
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken())-1;

		for (int i=1;i<=N;i++){
			josephus.add(i);
		}
		getAnswer(N,K);

		System.out.println(answer);
	}

	private static void getAnswer(int N,int K){
		int temp=K;
		for (int i=0;i<N;i++){
			System.out.println(josephus.size());
			if (temp>= josephus.size()) temp-=josephus.size();

			if (josephus.size()>K) {
				answer.add(josephus.get(temp));
				josephus.remove(temp);
				temp+=K;
			}
			else{
				answer.addAll(josephus);
				break;
			}
		}
	}*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> qu = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) { // 큐에 N까지의 수 차례로 넣어주기
			qu.add(i+1);
		}

		while(!qu.isEmpty()) { // N명의 사람이 모두 제거될 때까지, 즉 큐가 빌 때까지 반복
			for(int j = 0; j < K; j++) { // K번째를 제거하기 위한 루프
				if(j == K-1) {
					sb.append(qu.poll() + ", "); // K번을 제거
				} else {
					qu.add(qu.poll()); // K번이 아닐 때에는 맨 뒤로 이동
				}
			}
		}

		bw.write((sb.substring(0, sb.length()-2) + ">").toString());
		bw.flush();
		bw.close();
	}

}
