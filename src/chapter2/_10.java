package chapter2;

import java.util.Scanner;

public class _10 {
    int [] dx={-1,0,1,0};
    int [] dy={0,1,0,-1};


    public int solution(int i,int [][] arr){
        int answer=0;

        for (int n=0;n<i;n++){
            for (int k=0;k<i;k++){
                boolean flag=true;
                for(int x=0; x<4;x++){
                    int nx=n+dx[x];
                    int ny=k+dy[x];
                    System.out.println("n = " + n);
                    System.out.println("dx[x] = " + dx[x]);
                    System.out.println("k = " + k);
                    System.out.println("dy[x] = " + dy[x]);
                    if (nx>=0&& nx<i && ny>=0 && ny<i &&arr[nx][ny]>=arr[n][k]) {
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _10 N= new _10();
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        int arr[][]=new int[i][i];
        for (int n=0;n<i;n++){
            for (int k=0;k<i;k++){
                arr[n][k]=kb.nextInt();
            }
        }
        System.out.println(N.solution(i,arr));
    }
}
