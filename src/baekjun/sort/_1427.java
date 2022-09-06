package baekjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (char x:num.toCharArray()){
            arrayList.add(Integer.parseInt(String.valueOf(x)));
        }
        Collections.sort(arrayList,Collections.reverseOrder());

        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i));
        }
    }
}

/*
import java.io.InputStream;
        import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;

        int[] counting = new int[10];
        int c;
        while((c = in.read()) != '\n') {
            counting[c - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}*/
