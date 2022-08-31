package baekjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _10816 {
    /*public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        int card = scanner.nextInt();
        int[] arr=new int[card];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        int correct = scanner.nextInt();
        int[] arr2=new int[correct];
        for (int i=0;i<arr2.length;i++){
            arr2[i]=scanner.nextInt();
        }
        for (int x:arr2){
            if (hashMap.containsKey(x)) {
                System.out.print(hashMap.get(x)+" ");
            }else {
                System.out.print(0+" ");
            }
        }
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[20000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            //해당 인덱스 값에 +1해준다.
            arr[input + 10000000]++;
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(arr[input + 10000000]).append(" ");
        }
        System.out.println(sb);
    }
}
