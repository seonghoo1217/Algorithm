# hashCode() 메서드란?

자바의 Hash Code 란 객체를 구별할 수 있는 유니크한 값을 얘기한다. 메모리에 생성된 객체의 주소를 변환한 형태를 얘기한다.
이때 Hash Code 값은 절대 중복되지 않는다. 비슷한 예로 DB의 Primary Key 값을 예시로 들 수 있다.

hashCode() 메서드는 모든 객체의 최상위 클래스인 Object에 존재하기 때문에 모든 객체에 존재한다.

## hashCode() 메서드의 특성

자바에서 hashCode() 메소드는 아래와 같이 정의되고 있다.

1. 변경되지 않는 한 객체의 hashCode() 메소드 호출결과는 항상 Integer 값이어야한다.
2. equals 메소드가 같다고 판별한 두 객체의 hashCode() 호출 결과는 똑같은 Integer 값이어야 한다.
3. 그러나 java.lang.Object.equals 메소드가 다르다고 두 객체의 hashCode() 값이 반드시 달라야 하는 것은 아니다.

위의 3번처럼 예외가 되는 경우가 있는데 HashSet,HashMap,HashTable은 아래의 그림과 같은 방법으로 두객체가 동등한지 비교한다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdyyO45%2FbtqA2OSHDax%2FsLcXFRfXtAxidIY2iUNUx0%2Fimg.png)

처음에 hashCode() 메소드의 결과 값이 동일한지 판단한 후 Hash Code 값이 다르면 서로 다른 객체라고 판단하고 Hash Code 값이 같으면 equals() 메소드로 다시 비교한다.
두 조건이 다같아야지 동일 객체로 판단한다.

