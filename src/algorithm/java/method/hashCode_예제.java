package algorithm.java.method;

public class hashCode_예제 {
    public static void main(String[] args) {
        Person person=new Person(24,"성호");
        System.out.println(person.hashCode());
        Person person2=new Person(25,"진우");
        System.out.println(person2.hashCode());
        Integer age=24;
        boolean equals = age.equals(person.getAge());
        boolean equals2 = age.toString().equals(person.getAge());
        System.out.println(equals);
        System.out.println(equals2);
    }

    public static class Person{
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
