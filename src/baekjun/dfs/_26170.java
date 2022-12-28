package baekjun.dfs;

import java.io.*;
import java.util.StringTokenizer;

public class _26170 {
	static int answer=Integer.MAX_VALUE;
	static int map[][]=new int[5][5];
	static int [] dx={1,0,-1,0};
	static int [] dy={0,1,0,-1};
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));


	    for (int i=0;i<5;i++){
			String line = br.readLine();
			for (int k=0;k<5;k++){
				map[i][k]=line.charAt(k);
			}
		}
		StringTokenizer st=new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		dfs(x,y,0,0);

		System.out.println(answer==Integer.MAX_VALUE?-1:answer);
	}

	private static void dfs(int x, int y, int count, int move) {
		if (count>=3){
			answer=Math.min(answer,move);
			return;
		}
		for (int i=0;i<4;i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx>=0&&nx<5&&ny>=0&&ny<5&&map[nx][ny]!=-1){
				if (map[nx][ny]==1){
					map[nx][ny]=-1;
					dfs(nx,ny,count+1,move+1);
					map[nx][ny]=1;
				}else {
					map[nx][ny]=-1;
					dfs(nx,ny,count,move+1);
					map[nx][ny]=0;
				}
			}
		}
	}

}
