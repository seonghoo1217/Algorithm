package programers.level1;

public class 하샤드수 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int sum=0;
            int temp=x;

            while (temp>=1){
                sum+=temp%10;
                temp/=10;
            }

            if (x%sum==0){
                answer=true;
            }else {
                answer=false;
            }

            return answer;
        }
    }
}
