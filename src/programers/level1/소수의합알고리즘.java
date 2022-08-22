package programers.level1;

import java.util.Scanner;

public class 소수의합알고리즘 {

    public static boolean[] prime;
    public static void main(String[] args) {
        int answer=0;
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        make_prime(N);

        for(int i = 0; i < prime.length; i++) {
            if(prime[i] == false) {
                answer+=i;
            }
        }
        System.out.println("answer = " + answer);
    }

    public static void make_prime(int N) {

        prime = new boolean[N + 1];

        if(N < 2) {
            return;
        }

        prime[0] = prime[1] = true;


        for(int i = 2; i <= Math.sqrt(N); i++) {

            if(prime[i]) {
                continue;
            }

            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

    }

}