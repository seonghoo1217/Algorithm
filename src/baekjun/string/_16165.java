package baekjun.string;

import java.io.*;
import java.util.*;

public class _16165 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String,String> hsm = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();

		for(int i=0; i<N; i++) {
			String team = br.readLine();
			int num = Integer.parseInt(br.readLine());

			//걸그룹 문자열을 받아서 hashmap에 ㅓㄶ기
			for(int j=0; j<num; j++) {
				sb.append(br.readLine()+" ");
			}
			hsm.put(team, sb.toString());
			sb.setLength(0); //stringBuilder 초기화;
		}

		//문제관련 for문
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			int num = Integer.parseInt(br.readLine());
			arr.clear();

			//0의 입력이 들어왔을때
			if(num == 0) {
				StringTokenizer st2 = new StringTokenizer(hsm.get(str)," ");
				while(st2.hasMoreTokens()) {
					arr.add(st2.nextToken());
				}
				Collections.sort(arr);
				for(int j=0; j<arr.size();j++) {
					bw.write(arr.get(j)+"\n");
				}
			}

			//1의 입력이 왔을때
			else {
				Iterator<String> it = hsm.keySet().iterator();
				while(it.hasNext()) {
					String key = it.next();
					StringTokenizer st3 = new StringTokenizer(hsm.get(key)," ");


					while(st3.hasMoreTokens()) {
						String strr = st3.nextToken();
						//System.out.println("이건str:" +str);
						//System.out.println("토큰 : "+strr);
						if(str.equals(strr)) {
							bw.write(key+"\n");
						}
					}
				}
			}
		}

		bw.flush();
		bw.close();
	}

}

