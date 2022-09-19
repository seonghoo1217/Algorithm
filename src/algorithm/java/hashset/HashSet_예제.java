package algorithm.java.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet_예제 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        Iterator<Integer> iterator = hashSet.iterator();
        for (int i=0;i<hashSet.size();i++){
            System.out.println(iterator.next());
        }
        HashSet<Integer> lhashSet=new LinkedHashSet<>();
        lhashSet.add(1);
        lhashSet.add(1);
        lhashSet.add(2);
        lhashSet.add(3);
        Iterator<Integer> iterator1 = lhashSet.iterator();
        for (int i=0;i<lhashSet.size();i++){
            System.out.println(iterator1.next());
        }
    }
}
