package programers.level1;

import java.util.Scanner;

public class DivisorSum {
    public int solution(int n){
        int answer=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        DivisorSum N=new DivisorSum();
        Scanner kb =new Scanner(System.in);
        int i = kb.nextInt();
        System.out.println(N.solution(i));
    }
}
