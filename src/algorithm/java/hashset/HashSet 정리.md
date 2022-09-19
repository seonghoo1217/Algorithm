# HashSet이란?

자바의 HashSet이란 자바의 고유 자료구조인 Set 인터페이스에서 파생된 구현 클래스이다.

순서대로 입력되지 않으며 일정하게 유지되지 않는 특성이 있다.
HashSet은 null 요소도 허용하여주며 이 클래스의 가장 큰 특징으로는 중복을 허용하지 않는다는 것이다.

## 중복을 걸러내는 특성 및 과정

HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시코드와 비교한 뒤
같은 해시 코드가 있다면 다시 equals() 메소드로 두객체를 비교하여 true가 나오면 동일 객체로 판단하여서 중복 저장하지 않는다.

문자열을 HashSet에 저장할 경우 같은 문자열을 갖는 String 객체는 동일 객체로 간주하고 다른 문자열을 갖는 String 객체는 다른 객체로 간주한다.
그 이유는 String 클래스가 hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우 hashCode()의 리턴값은 같게 equals()의 리턴값은
true로 나오도록 하였기 때문이다.


## HashSet 변수선언

HashSet<Data Type> 변수명 = new HashSet<Data Type>(); 로 선언하여 선언할 수 있다.
데이터 타입에는 기본자료형인 Integer,String 부터 객체 타입또한 가능하다.

HashSet<Data Type> 변수명 = new LinkedHashSet<DataType>(); 로 선언할 경우 HashSet의 특징 중 하나인 순서가 보장되지 않는다는
단점을 극복할 수 있다.

## HashSet 메서드

HashSet은 Set 인터페이스의 구현체 클래스이기 때문에 메서드 또한 동일하다.

1. add() : set에 데이터를 추가하는 메서드

2. remove() : 특정 데이터를 지우는 메서드

3. clear() : Set에 있는 모든 데이터를 지우는 메서드

4. size() : Set의 전체 크기를 구하는 메서드

5. contains() : 특정 값이 포함되어 있는지 판단하는 메서드

