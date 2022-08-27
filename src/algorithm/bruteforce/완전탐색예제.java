package algorithm.bruteforce;

import java.util.ArrayList;

public class 완전탐색예제 {
    // 단순 중첩예제
    /*public static void main(String[] args) {
        //N이 7
        String[] people={"1","2","3","4","5","6,","7"};
        int answer=0;
        for (int f=0;f< people.length;f++){
            for (int s=0;s< people.length;s++){
                if (f==s) continue;
                for (int t=0;t< people.length;t++){
                    if (t==s||t==f)continue;

                    String first = people[f];
                    String second = people[s];
                    String third = people[t];

                    System.out.println("first = " + first);
                    System.out.println("second = " + second);
                    System.out.println("third = " + third);

                    answer++;
                }
            }
        }
        System.out.println("answer = " + answer);
    }*/

    public static void main(String[] args) {
        int i=3;
        String[] people={"1","2","3","4","5","6,","7"};
        boolean[] check = new boolean[people.length];
        String[] result=new String[i];
        ArrayList<String[]> arrayList=new ArrayList<String[]>();
        permutation(people, check, result, i, 0, arrayList);
        for (String[] strings:arrayList){
            String temp="";
            for (String text:strings){
                temp+=" " + text;
            }
            System.out.println("temp = " + temp);
        }
        System.out.println("arrayList = " + arrayList.size());
    }
    private static void permutation( String[] people, boolean[] isChecked, String[] result, int endPoint, int dept, ArrayList<String[]> totalList ) {
        if( endPoint == dept ) {
            totalList.add(result.clone());
        } else {
            for ( int i = 0; i < people.length; i++ ) {
                if( !isChecked[i] ) {
                    isChecked[i] = true;
                    result[dept] = people[i];
                    permutation(people, isChecked, result, endPoint, dept + 1, totalList);
                    isChecked[i] = false;
                    result[dept] = "";
                }
            }
        }
    }
}
