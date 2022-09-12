# StringTokenizer

* StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스이다. 쪼개진 문자열은 token이라는 단위로 불린다.

## StringTokenizer의 생성자

1. public StringTokenizer(String str); : 전달된 매개변수 str을 기본 delim으로 분리한다. 기본 delimiter는 공백 문자인 "\n"이다.

2. public StringTokenizer(String str,String delim): 특정 delim을 기준으로 문자열을 분리한다.

3. public StringTokenizer(String str,String delim,boolean returnDelims); : str을 특정 delim으로 분리시키는데 그 delim까지 tok
en으로 포함시킬지를 결정한다. returnDelims가 true일 경우 포함 false일경우 미포함한다.


## StringTokenizer의 메소드

1. int countTokens() : 현재 남아있는 token의 개수를 출력하여준다.
2. boolean hasMoreElements(),boolean hasMoreTokens() : 다음의 token을 반환한다.