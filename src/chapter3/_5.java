package chapter3;

import java.util.Scanner;

public class _5 {

    public int solution(int x){
        int answer=0,sum=0;
        for(int i=1;i<=x;i++){
            sum+=i;
            for (int j=i+1;j<=x;j++){
                sum+=j;
                if(sum==x){
                    answer++;
                    sum=0;
                    break;
                }else if(sum>x){
                    sum=0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _5 N =new _5();
        Scanner scanner=new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(N.solution(x));
    }
}
