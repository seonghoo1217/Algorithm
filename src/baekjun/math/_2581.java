package baekjun.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=M;i<=N;i++){
            boolean flag=true;
            for (int k=2;k<=Math.sqrt(i);k++){
                if (i%k==0){
                    flag=false;
                    break;
                }
            }
            if(flag) {
                arrayList.add(i);
            }
        }
        int answer=0;
        for (int i=0;i<arrayList.size();i++){
            answer+=arrayList.get(i);
        }
        if (!arrayList.isEmpty()){
            System.out.println(answer);
            System.out.print(arrayList.get(0));
        }else {
            System.out.print(-1);
        }

    }
}
