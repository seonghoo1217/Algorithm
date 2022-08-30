package baekjun.sort;

import java.util.*;

public class _1764 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String,Integer> hashMap=new LinkedHashMap<>();
        int listen = scanner.nextInt();
        int see = scanner.nextInt();
        ArrayList<String> arrayList=new ArrayList<>();
        for (int i=0;i<listen;i++){
            String name = scanner.next();
            hashMap.put(name,hashMap.getOrDefault(name,0)+1);
        }
        for (int i=0;i<see;i++){
            String name = scanner.next();
            if (hashMap.containsKey(name)){
                arrayList.add(name);
            }
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (int i=0;i< arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
