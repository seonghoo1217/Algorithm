package baekjun.math;

public class _4673 {
    public static void main(String[] args) {

        boolean[] check=new boolean[10001];

        for (int i=1;i<=10001;i++){
            int num = d(i);

            if (num<10001){
                check[num]=true;
            }
        }
        StringBuilder sb=new StringBuilder();

        for (int i=1;i<10001;i++){
            if (!check[i]){
                sb.append(i+"\n");
            }
        }
        System.out.print(sb);
    }

    public static int d(int d) {
        int sum = d;

        while (d!=0){
            sum=sum+d%10;
            d=d/10;
        }

        return sum;
    }
}
