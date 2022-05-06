package programers.level1;

public class 소수찾기 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i=2;i<=n;i++){
                boolean flag=true;
                for (int k=2;k<=Math.sqrt(i);k++){
                    if(i%k==0) {
                        flag=false;
                        break;
                    }
                }
                if (flag==true) answer++;
            }
            return answer;
        }
    }
}
