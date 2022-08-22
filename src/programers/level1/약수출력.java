package programers.level1;

import java.util.Scanner;

public class 약수출력 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num = kb.nextInt();

        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
