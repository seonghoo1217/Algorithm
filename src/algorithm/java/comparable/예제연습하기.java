package algorithm.java.comparable;

import java.util.*;

public class 예제연습하기 {
    public static class PhoneBook{
        String number;
        String name;

        public PhoneBook(String number, String name) {
            this.number=number;
            this.name=name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Main{
        public static void main(String[] args) {
            List<PhoneBook> arrayList=new ArrayList<>();
            List<String> list=new ArrayList<>();
            arrayList.add(new PhoneBook("010-6284-7384","Seong Ho"));
            arrayList.add(new PhoneBook("010-8519-0665","Bo Min"));
            arrayList.add(new PhoneBook("010-6899-6260","Seong Su"));
            for (int i=0;i<arrayList.size();i++){
                String number = arrayList.get(i).number;
//                number=number.replaceAll("[-]{1}"," ");
                number=number.replaceAll("01(?:0|1|[6-9])-","");
                number=number.replaceAll("-\\d{4}","");
                list.add(number);
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.parseInt(String.valueOf(o1.charAt(0)))>Integer.parseInt(String.valueOf(o2.charAt(0))) ? -1 :
                            Integer.parseInt(String.valueOf(o2.charAt(0)))>Integer.parseInt(String.valueOf(o1.charAt(0))) ? 1 :
                                    Integer.parseInt(String.valueOf(o2.charAt(1)))>Integer.parseInt(String.valueOf(o1.charAt(1))) ? 1 :
                                            Integer.parseInt(String.valueOf(o1.charAt(1)))>Integer.parseInt(String.valueOf(o2.charAt(1))) ? -1 : 0;
                }
            });
            System.out.println("list = " + list);
        }
    }
}
