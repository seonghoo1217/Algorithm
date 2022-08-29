package algorithm.countingsort;

public class 계수정렬예제 {
    /*public static void main(String[] args) {
        int [] array= new int [100];
        int [] counting=new int [31];
        int [] returnArr=new int[100];

        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*31);
        }

        //과정 1
        for (int i=0;i<array.length;i++){
            counting[array[i]]++;
        }

        *//*for (int i=0;i<counting.length;i++){
            System.out.println("counting = " + counting[i]);
        }*//*

        //과정 2
        for (int i=1;i<counting.length;i++){
            counting[i]+=counting[i-1];
        }

        //과정 3
        for (int i=returnArr.length-1;i>=0;i--){
            int value = array[i];
            counting[value]--;
            returnArr[counting[value]]=value;
        }

        for (int i=0;i<array.length;i++){
            if (i%10==0){
                System.out.println();
            }
            System.out.print(array[i]);
        }
        for (int i=0;i<array.length;i++){
            if (i%10==0){
                System.out.println();
            }
            System.out.print("rt : "+returnArr[i]);
        }
    }*/
    public static void main(String[] args) {

        int[] arr = new int[101]; // 수의 범위 : 0 ~ 100

        for (int i = 0; i < 50; i++) {	// 수열의 크기 : 50
            arr[(int) (Math.random() * 101)]++;	// 0 ~ 100
        }

        for(int i = 0; i < arr.length; i++) {
            while(arr[i]-- > 0) {	// arr 값이 0보타 클 경우
                System.out.println(i + " ");
            }
        }
    }
}
