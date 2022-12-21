package silver4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1270 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			HashMap<String,Integer> hashMap=new HashMap<>();
			for (int k=0;k<T;k++){
				String key = st.nextToken();
				hashMap.put(key,hashMap.getOrDefault(key,0)+1);
			}
			getAnswer(T,hashMap);
		}
	}

	private static void getAnswer(int T, HashMap<String,Integer> hashmap){
		int temp=T%2==0?T/2:T/2+1;
		int max_only_one=0;
		String answer="";
		for (String x: hashmap.keySet()){
			if (hashmap.get(x)>=temp){
				max_only_one++;
				answer=x;
			}
		}
		if (max_only_one==1){
			System.out.println(answer);
		}else {
			System.out.println("SYJKGW");
		}
	}
}
