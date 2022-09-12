# countTokens 메소드

최근 알고리즘 공부를 하다가 countTokens라는 메소드를 알게 되었는데 코딩테스트를 할 때 상당히 유용한 메소드이다.

StringTokenizer 클래스에 존재하는 메소드로 Token의 개수를 호출하여주는 메소드로 무슨말인지 예시로 보여주자면 다음과 같다.

입력이 0001100 이 들어온다면 해당 문자열에 countTokens 메소드를 사용하면 아래와 같은 형태일 것이다.

```java
StringTokenizer st0 = new StringTokenizer(S, "0");
StringTokenizer st1 = new StringTokenizer(S, "1");
System.out.println(st0.countTokens());
System.out.println(st1.countTokens());
```
이때 나오는 값은 1과 2로 정확히 nextToken 메서드를 호출할 수 있는 횟수를 계산한다.

## 좀 더 자세한 예시

"Hello World Hello World"를 StringTokenizer를 거치면총 4개의 토큰이 생성된다.
이때 st.countTokens는 count가 4로 출력될것이다.


