package programers.level1;

public class 소수만들기 {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            boolean check=false;
            for (int i=0;i<nums.length;i++){
                for (int k=i+1;k<nums.length;k++){
                    for (int j=k+1;j<nums.length;j++){
                        int sum=nums[i]+nums[k]+nums[j];
                        if (sum>=2) check = primeNum(sum);
                        if (check==true) answer++;
                    }
                }
            }

            return answer;
        }
        public boolean primeNum(int num){
            boolean prime =true;
            if (num==2) return prime;

            for (int i=2;i<num;i++){
                if (num%i==0) {
                    prime=false;
                    break;
                }
            }
            return prime;
        }
    }

}
