# 자바 Comparable

자바에서 대부분 List형태의 데이터를 정렬하기 위해서는 Collections 클래스의 sort() 메소드를 이용하여 대부분 정렬한다.
이는 코딩테스트 또는 실제 스프링에서도 서비스 로직을 작성할때 유용하게 사용되는 메소드이다.

하지만 우리가 사용하는 sort() 메소드는 사실 2가지로 오버라이딩 되어있다. 
1. 파라메터로 List만을 받는 sort()
2. 파라메터로 List와 Compartor 객체를 받는 sort()

물론 둘다 static 메소드로서 사용가능하며 이는 API 문서에 공식 문서화 되어있다.

![](https://t1.daumcdn.net/cfile/tistory/2206E947575283092D)

![](https://t1.daumcdn.net/cfile/tistory/261C35485752829C01)

## Comparable<T> Interface

sort() 메소드의 매개변수 타입을 보면 List<T>로 제네릭 타입을 받고 있다. 이때 T는 <T extends Comparable>로 Comparable 인터페이스를
상속받아 구현하여야 한다.

Comparable 인터페이스를 살펴보면 int compareTo(T o) 메소드 하나 밖에 없으므로 이 메소드만 오버라이딩 해주면 Collections.sort()의 매개변수로 List를 넘겨
정렬할 수 있다.

## Comparable을 써야하는 이유

### 단순정렬

여기 예시를 보자 String 형태의 List가 존재할때 그냥 sort를 쓰면 다음과 같을것이다.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        Collections.sort(list);
    }
}
```

위와 같은 코드로 진행하며 list에는 a,b,c로 오름차순으로 정렬 되어있을 것이다.
이러한 String,Integer 타입의 간단한 list들은 sort 명령어만을 사용하여 간단히 정렬할 수 있다.
참고로 String 타입의 원소를 가진 List가 Collections.sort()로 매개변수로 넘겨져 정렬이 가능한 이유는 API 문서를 살펴보면 다음과 같다.
String 클래스는 char형태의 집합이고 char의 각각 값은 int 값으로 변환이 되기 때문에 이를 기반으로 정렬이 가능하다

![단순정렬](https://t1.daumcdn.net/cfile/tistory/235CA54057528F1C31)


### 객체 정렬

만약 사용자가 정의한 임의의 클래스 Person이 있다고 가정하고 이를 원소로하는 List를 정렬한다면 다음과 같을 것이다.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> nameList = new ArrayList<>();

        nameList.add(new Person("Lee", 24));
        nameList.add(new Person("Han", 23));
        nameList.add(new Person("Woo", 27));

        Collections.sort(nameList);
    }
}
```

위와 같이 평소 List를 정렬했던것과 같이 정렬을 시도할 경우 Main클래스 부분의 sort()에서 에러가 나게 된다.
왜냐하면 Person 클래스는 개발자가 임의로 생성한 class이기 때문에 String,Integer와 같이 자바에서 지원하지 않아 Comparable 인터페이스를 구현하지
않았기 때문에 Collection.sort(List<T> list)의 매개변수로 넘길 수 없기 때문이다. 게다가 Person 클래스의 경우 현재 name과 age라는 두가지
멤버 변수를 갖고 있기 때문에 어떠한 기준으로 정렬을 할지 프로그램은 알 수 없다. 그렇기 때문에 그 기준을 개발자가 정확히 명시하여 주어야한다.
따라서 다음과 같은 객체 또는 개발자의 기준을 토대로 정렬하고 싶다면 Comparable 인터페이스를 구현하여서 사용하여야한다. 이때 compareTo메소드를 오버라이딩하여
사용한다.

그럼 Person의 age를 기준으로 정렬한다고 가정하고 compareTo 메소드를 구현하여보자

```java
public class Person implements Comparable<Person> {
    String name;
    int age;

    @Override
    public int compareTo(Person p) {
        
        if (this.age>p.age){
            return 1;
        }else if (this.age<p.age){
            return -1;
        }else {
            return 0;
        }
    }
}
```
이렇게 코드를 구현한다면 아마 ["Woo","Lee","Han"] 순으로 정렬이 되게 될것이다.
이처럼 객체와 같이 멤버 변수가 여러개 존재하거나 개발자의 기준에 의해 정렬을 하려고한다면 Comparable 인터페이스의
compareTo() 메소드를 반드시 구현해야한다.

만약 여기에서 Person 클래스의 멤버변수에 전화번호,주민등록번호가 추가적으로 추가되고 전화번호 순, 주민등록번호 순으로 정렬을 하고 싶다고 하면 
이에 맞게 compareTo 메소드를 오버라이딩하여 구현하면된다.

## Comparator<T> 를 사용해야하는 이유

만약 알파벳의 사전편찬 순으로 정렬을 하거나 숫자 오름차순과 같이 지원이 되는 일정한 규칙적인 정렬 즉, natural order 대로의
정렬말고 사용자가 원하는 임의의 정렬 기준 예를들자면 방금 Person 클래스의 멤버변수 중 name의 길이가 가장 긴 사람부터 List를
정렬하고 싶다면 어떻게 구현해야하는가? 이럴땐 정렬의 기준을 개발자가 직접 정의하여 주면된다. 이때 사용되는 것이 Comparator 인터페이스이다.

Comparator 인터페이스에는 compare()라는 메소드가 존재하며 이를 사용하여 정렬기준을 구현한다.
사실 Comparator 인터페이스에는 compare() 메소드외에 equals()라는 메소드도 존재하지만 equals는 최상위 클래스인 Object에서
이미 구현되어 있기 때문에 Overriding을 할때 compare() 메소드만 구현하면된다.

이를 코드로 보자면 다음과 같다.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class Main {
    public static void main(String[] args) {
        class nameLengthComparator implements Comparator<Person> {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().length() > o2.getName().length() ? 1
                        : o1.getName().length() < o2.getName().length() ? -1 : 0;
            }
        }

        List<Person> nameList = new ArrayList<>();
        nameList.add(new Person("Hwang", 28));
        nameList.add(new Person("Lee", 24));
        nameList.add(new Person("Choi", 26));

        Collections.sort(nameList,new nameLengthComparator());
    }
}
```

위 코드에서 Comparator 인터페이스를 구현하는 nameLengthCompare라는 클래스는 Main() 메소드 안에서만 사용되기 때문에
InnerClass로 작성하였고 그 안의 compare()메소드를 구현할때의 정렬 기준은 Comparable 인터페이스의 compareTo() 메소드와
비슷하다.

해당예제에서는 compare 메소드에 인자로 o1과o2로 주어질 때 삼항연산자를 이용하여서
o1(리스트의 첫 이름) 의 길이가 o2(리스트의 나머지 이름들을 순차적으로 비교)의 길이보다 길면 1을 return하고
o1이 o2보다 작다면 -1을 return하고 같다면 0을 return한다. 이때 모든 리스트의 값을 순차적으로 바꿔가며 바교한다.
이런식으로 compare 메소드를 구현하였다면 Collections.sort()의 인자값으로 list와 함께 넣어주면 된다.

즉 sort(List o,Compactor c)형태로 호출하면 정렬을 할 수 있다. 또한 sort()를 해당형태로 호출하였을 때는 List에 있는
원소의 compareTo() 메소드가 호출되지 않고 Compactor의 compare 메소드가 호출된다. 즉 이말은 List에 있는
원소들이 Comparable 인터페이스를 상속받지않는 형태의 객체여도 괜찮다는 뜻이다.

