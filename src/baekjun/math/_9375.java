package baekjun.math;

import java.util.HashMap;
import java.util.Scanner;

public class _9375 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();

        while (i-->0){
            HashMap<String,Integer> hashMap=new HashMap<>();

            int N = scanner.nextInt();

            while (N-- > 0) {

                scanner.next();

                String kind = scanner.next();

                if (hashMap.containsKey(kind)) {
                    hashMap.put(kind, hashMap.get(kind) + 1);
                }
                else {
                    hashMap.put(kind, 1);
                }
            }

            int result = 1;

            for (int val : hashMap.values()) {
                result *= (val + 1);
            }

            System.out.println(result - 1);
        }

    }

}
