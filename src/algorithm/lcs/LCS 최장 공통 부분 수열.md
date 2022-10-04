# 최장 공통 부분 수열 LCS (Longest Common Subsequence)

LCS(Longest Common Subsequence)는 주로 최장 공통 부분수열을 나타내지만 최장 공통 부분 문자열(Longest Common Substring)을 말하기도 한다.

최장 공통 문자열은 반드시 부분 문자열이 연결된 형태여야한다. ex) `ban`ana , v`ban`kn

최장 공통 부분 수열은 떨어져 있어도 상관없다 ex) `b`d`an`vv,v`b`kk`an`m 

이러한 차이점이 존재하며 이는 주어진 여러개의 수열 모두의 부분수열이 되는 수열들 중에 가장 긴 것을 찾는 문제이다.

## LCS 길이 찾는 방법 (DP)

ACAYKP 와 CAPCAK의 LCS를 찾아보면 ACAK가 LCS가 된다. 따라서 LCS의 길이는 4가된다. 이를 구하는 방법으로는 이중 포문을 사용하여 각
원소들을 하나씩 직접 비교해주며 dp값을 갱신한다.

dp는 2차원 배열로 수열 n1과 n2의 LCS 길이를 저장해준다.
dp[수열 n1의 i번째][수열 n2의 j번째]= 수열n1(0~i)와 수열n2(0~j)의 LCS 길이

## LCS 알고리즘 설계

i: str1의 문자열 i번째 문자, j: str2의 문자열 j번째 문자

1. if(i==j) str1(0~i-1)과 str2(0~j-1)의 LCS +1 을 해준다.
1-1. AC`A`YKP, C`A`PCAK i가 3이고 j가 2일 때 (AC의 LCS: dp[2][1]=1)+1=2)

2. if(i!=j) str1(0~i-1)과 str2(0~j)의 dp[i-1][j], str1(0~i)와 str2(0~j)의 dp[i][j-1] 중 최대값을 받아온다.
2-1.(AC`A`YKP, CA`P`CAK)i=3, j=3 일 때,  (AC CAP의 LCS : dp[2][3] =1 )  vs (ACA CA dp[3][2] =2 ) → 2 

## 코드

* 재귀(Dynamic Programming)를 이용한 풀이

```java
public class Main {
	static int[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		System.out.println(LCS(str1, str2));
	}
	
	static int LCS(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();
		
		dp = new int[n1+1][n2+1];
		for(int i=1; i<n1+1; i++) {
			for(int j=1; j<n2+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[n1][n2];
	}
}
```


## LCS 문자열을 찾는 방법 (DP)

dp값을 그림으로 보면 이해가 빠르게 풀어낼 수 있다. 아래 색칠된 숫자를 보면 dp값이 변하는 지점이 LCS를 찾아내는 부분이므로 저 위치들만 골라 탐색을 진행하여준다.

![문자열](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Frc5PD%2FbtrbHbqkSMX%2FbtfiMTsFmLW7djXKMSHSk0%2Fimg.png)

## 문자열 찾기 설계

dp값이 줄어드는 절벽 구간에 도달했다면 해당 부분에 속하는 문자를 저장한다. n → 0 하향식으로 값을 저장해주므로 후입선출을 해주는 Stack자료구조를 사용하여 데이터를 저장한다.

1. dp[i][j] == dp[i-1][j] 이면
1-1. i → i-1 , j → j 로 이동

2. dp[i][j] == dp[i][j-1] 이면
2-1. i → i , j → j-1 로 이동

3. 1,2에 해당하지않으면 해당 부분은 절벽 구간으로 LCS의 문자열이므로 stack에 저장한다.
3-1. stack.push(str.charAt(i-1)); 
3-2. i → i-1, j →j-1로 이동

## 문자열 찾기 예제 코드

```java
import java.io.*;
import java.util.Stack;

public class Main {
	static int[][] dp;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		LCS2(str1,str2);
		getLCSToString(str1, str1.length(), str2.length());
		System.out.println(sb.toString());
	}
	
	static void LCS2 (String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();
		
		dp = new int[n1+1][n2+1];
		int max =-1;
		for(int i=1; i<n1+1; i++) {
			for(int j=1; j<n2+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] +1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		sb.append(dp[n1][n2] + "\n");
	}
	
	static void getLCSToString(String str, int i, int j) {
		Stack<Character> st = new Stack<>();
		while(i>0 && j>0) {
			if(i == 0 || j ==0)break;
			
			if(dp[i][j] == dp[i-1][j]) {
				i--;
			}else if(dp[i][j] == dp[i][j-1]) {
				j--;
			}else {
				st.push(str.charAt(i-1));
				i--;
				j--;
			}
		}
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
	}
}
```

## LCS 길이찾기 DP가아닌 이진탐색(LIS)

위의 DP 풀이는 이중 포문을 사용한 풀이로 두수열의 길이가 n1,n2일 때  시간복잡도가 O(N^2)을 갖게된다. 이는 문자열 길이가 100만이상으로 주어지면
엄청난 시간이 걸릴것이다.

이 두 수열 LCS 길이를 이중포문이 아닌 LIS를 통해 LCS를 구할 수 있는 방법이 있다. 이진탐색을 통한 시간복잡도는 O(N)을 가진다.

두수열 [1 3 2],[1 2 3]의 LCS는 [1,2] or [1,3]이다.

이는 따지고보면 [1 2 3]은 index 순으로 정렬이 되어있기 때문에 [1 3 2]의 가장 긴 증가하는 부분 수열(LIS)을 구하는 것과 다름없다.

그래서 하나의 배열을 기준으로 정렬하고 다른 배열을 기준이 되는 배열과 비교하여 index를 정리한다.

따라서 하나의 배열을 기준으로 index를 정하고 다른 배열을 기준 index를 통해 다시 원소를 재배열한 다음 해당 배열의 LIS를 구하면 결국은 두배열의
LCS를 찾는것과 같다.

총 3가지의 자료구조를 사용하여 풀이를한다.

1. standard : 첫번째로 주어진 배열로 비교의 기준 index가 되는 배열 standard {1,2,3}
2. arr : 두번째로 주어진 배열의 값들의 위치 index를 저장한 배열 arr[num-1]=i
두번째로 주어진 입력 배열 {1,3,2} -> arr{0,2,1}
3. res: standard 배열을 기준으로 arr원소들의 상대적인 위치를 저장하는 배열 res[i]=arr[standard[i]-1]+1

standard 배열
standard 배열이 가장 중요하다. 이 배열은 숫자가 아닌 하나의 기준이 된다는 것을 알아야한다.

standard(기준)  :  [1 4 6 7 5 2 3 8]
두 번째로 주어진 배열 : [1 2 3 6 7 8 4 5]
arr  :  [0 1 2 6 7 3 4 5]
res : [ 1 7 4 5 8 2 3 6 ] 

