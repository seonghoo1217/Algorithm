package baekjun.math;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class 연습 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int gold = Integer.parseInt(scanner.nextLine());
        double g=8800;
        HashMap<String,Integer> hashMap=new LinkedHashMap<>();
        for (int i=0;i<7;i++){
            String[] split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[2].replaceAll("%", ""));
            if (split[3].equals("상승")){
                gold= (int) Math.floor(gold+(gold*(a/100.0)));
                hashMap.put(split[0],gold);
            }else {
                gold= (int) Math.floor(gold-(gold*(a/100.0)));
                hashMap.put(split[0],gold);
            }
        }
        for (String x: hashMap.keySet()){
            System.out.println(x+" "+"금가격" +" "+hashMap.get(x)+"원");
        }
    }
}
