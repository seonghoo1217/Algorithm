package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[] arr=new String[N];
        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i]=st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length()-o2.length();
                }
            }
        });
        List<String> arrStr = Arrays.asList(arr)
                .stream()
                .distinct()
                .collect(Collectors.toList());

        for (int i=0;i< arrStr.size();i++){
            System.out.println(arrStr.toArray()[i]);
        }
    }
}
