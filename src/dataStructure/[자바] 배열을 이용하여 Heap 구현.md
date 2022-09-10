# Heap

* 힙은 최솟값 또는 최대값을 최대한 빠르게 찾아내기 위하여 완전이진트리 형태로 만들어진 자료구조이다.

위 문장의 키워드중 중요 키워드 세가지는 "최소값 또는 최대값","빠르게","완전이진트리" 이며 이중 우리가 중점적으로 이해해야하는 부분은
완전이진트리이다.

기본적으로 트리란 다음과 같은 구조를 뜻한다.

![Tree](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbbNRYk%2FbtqV36qaJux%2Fcklbzws6M82XkJkJaqPA51%2Fimg.png)

해당 그림을 거꾸로 보면 나무같이 생겨서 생긴 별명으로 뿌리(시작점)로 부터 여러 가지가 뻗어나오는 모습에서 착안되었다.

해당 구조에서 중요한 용어와 개념들이 몇 나오는데 살펴보자면 다음과 같다.

1. 부모 노드: 자기자신(노드)과 연결된 노드 중 자신보다 낮은 레벨의 노드를 뜻한다.
2. 자식 노드: 자기자신과 연결된 노드 중 자신보다 높은 레벨의 노드를 뜻한다.
3. 루트 노드: 뿌리노드라고도 불리며 트리하나당 한개 밖에 존재할 수 없으며 부모노드가 없다는 특징이 있다.
4. 단말 노드: 리프노드라고도 불리며 자식노드가 없는 노드 즉 최상위 레벨의 노드이며 최하위 노드를 뜻한다.
5. 형제 노드: 부모가 같은 노드를 뜻한다.
6. 레벨: 노드의 깊이를 뜻하며 0또는 1부터 시작하며 레벨이 낮을수록 상위 노드이다.
7. 깊이: 특정 노드에 도달하기 위해 거쳐야하는 선의 개수를 의미한다.
8. 차수: 특정 노드가 하위노드와 연결 된 개수

* 그럼 이진트리는 여기서 어떻게 바꾸면될까?

위의 트리 이미지에서 모든 노드의 차수를 2로 제한하면(즉, 모든 노드가 자식노드를 최대 2개밖에 가지지 못한다면) 이를 이진 트리(Binary Tree)라고한다.
이미지로 보면 아래와 같다.

![BinaryTree](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtMysu%2FbtqV0DJgeJf%2FUfsVUDLaMWGFFt7tMpumkk%2Fimg.png)

그럼 이제 키워드 중 이진과 트리는 얻었으니 완전이라는 키워드만 익히면 된다.
완전이진트리란 먼저 정의하자면 마지막 레벨을 제외한 모든 노드가 왼쪽부터 채워져 있어야한다.
즉 이진트리에서 마지막 레벨을 제외한 모든 노드가 채워져있어야하고 모든 노드가 왼쪽부터 채워져야하는 구조이다.

그리고 완전이진트리에서 마지막 레벨을 제외한 모든 노드들은 두개의 자식을 가져야한다는 조건이 달리면 포화이진트리가 된다.

![](https://img1.daumcdn.net/thumb/R1920x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbfi34R%2FbtqV2WnM4Jj%2FMTkKbZMrJDecwvs3Wns8DK%2Fimg.png)

자 그래서 힙얘기를 하다가 왜 갑자기 트리얘기냐면 아까 얘기했던 부분과 연결된다.
최솟값 또는 최대값을 찾기위한 구조라고 얘기했던 부분이다.

예로 들어보자면 리스트에 어떤 값을 넣었다가 빼려고할 때 우선순위가 높은 것 부터 빼내려고 한다면 대개 정렬을 떠올리게 된다.

쉽게 생각해서 숫자가 낮을 수록 우선순위가 높다고 가정할 때 매 번 새 원소가 들어올 때 마다 이미 리스트에 있던 원소들과 비교를 하고 정렬을 해야한다.

문제는 이렇게 하면 비효율적이기 때문에 좀 더 효율이 좋게 만들기 위하여 다음과 같은 조건을 붙였다.

'부모 노드는 항상 자식 노드보다 우선순위가 높다.'

즉, 모든 요소들을 고려하여 우선순위를 정할 필요 없이 부모 노드는 자식노드보다 항상 우선순위가 앞선다는 조건만 만족시키며 완전이진트리 형태로 채워나가는 것이다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcUJahp%2FbtqV36KtdQ4%2FLzdICgKMk7KvYULPjkKQy1%2Fimg.png)

이를 생각해보면 루트노드는 항상 우선순위가 높은 노드라는 것이다. 이러한 원리로 최대값 혹은 최소값을 빠르게 찾아낼 수 있다는 장점과 함꼐 
삽입 삭제 연산시에도 부모노드가 자식노드보다 우선순위만 높으면 되므로 시간복잡도가 낮게 연산을 수행할 수 있다.

그리고 형제간의 우선순위는 고려되지 않는 사항이기 때문에 이러한 정렬상태를 약한 힙이라고 부른다.

그럼 이런 질문이 나올 수 있다. "왜 형제간의 대소비교가 필요 없다는 거죠?"

우선순위가 높은 순서대로 뽑는 것이 포인트다. 즉, 원소를 넣을 때도 우선순위가 높은 순서대로 나올 수 있도록 유지가 되야하고 뽑을 때 또한 우선순위가 높은 순서 차례대로 나오기만 하면 된다.


말로하면 어려울 수도 있으나 구현부분을 보면 바로 이해할 수 있을 것이다.


## Heap의 종류

앞서 힙은 우선순위 높은 순서대로 나온다고 말했다. 이 말은 우선순위에 따라 달라지지만 기본적으로 제네릭 형태의 값은 기본적으로 정렬을 지원하는 기본 정렬지원형태가 있다.

예로들어 정수나 문자형태의 값의 경우 {3,1,6,4} 가 값으로 들어온경우 1,3,4,6으로 정렬된다.

![Heap](https://img1.daumcdn.net/thumb/R1920x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbXeFO2%2FbtqVTGz4Spk%2FEmiJ4rN545GnSjLddKZnT0%2Fimg.png)

최소 힙: 부모노드의 값(key 값)<= 자식노드의 값(key 값)
최대 힙: 부모노드의 값(key 값)>= 자식노드의 값(key 값)

이렇게 두가지로 나뉜다.
다만 여기서 가장 기본으로 우선순위를 뽑는다면 오름차순을 많이 사용하기 때문에 최소힙을 구현해볼것이다.

이떄 우리는 위의 트리 구조를 어떻게 구현하는가? 가장 표준적으로 구현할 수 있는 방법은 배열이다. 연결리스트로도 구현이 가능하지만 문제는 
노드의 검색 이동 과정이 조금 더 번거롭다.
배열의 경우 특정 인덱스에 바로 접근할 수 있기 떄문에 좀더 효율적이다.
배열로 구현하면 장점들 몇가지가 있는데 다음과 같다.

![배열](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FWDMjZ%2FbtqV8GEMhcb%2FM2Wm02OJQhSh7sdW1kSzLK%2Fimg.png)

1. 구현의 용이함을 위해 시작인덱스가 1부터 시작된다.
2. 각 노드와 대응되는 배열의 인덱스는 불변한다.

위 특징을 기준으로 각 인덱스 별로 채워넣으면 특이한 성질이 나온다.

[성질]
1. 왼쪽 자식 노드 인덱스=부모노드 인덱스 x2
2. 오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2 + 1
3. 부모 노드 인덱스 = 자식 노드 인덱스 / 2

위 세개의 법칙은 절대 변하지 않는다.

예로들어 index 3 의 왼쪽 자식 노드를 찾고 싶다면 3 × 2를 해주면 된다. 즉 index 6 이 index 3 의 자식 노드라는 것이다.

반대로 index 5의 부모 노드를 찾고 싶다면 5 / 2 를 해주면 된다.(몫만 취함) 그러면 2 이므로 index 2가 index 5의 부모노드라는 것이다.

이를 기반으로한 구현을 해보자

### Heap 구현

앞서 말했지만, 일단 기본적으로 최소 힙(Min Heap)을 기준으로 설명드리도록 하겠다. 
최대 힙 또한 원리가 크게 다른 건 아니라 만약 최대힙을 구현하고 싶은 경우 비교 연산만 반대로 해주면 된다.

```java
import java.util.Comparator;
 
public class Heap<E> {
 
	private final Comparator<? super E> comparator;
	private static final int DEFAULT_CAPACITY = 10;	// 최소(기본) 용적 크기 
    
	private int size;	// 요소 개수 
 
	private Object[] array;	// 요소를 담을 배열 
 
	// 생성자 Type 1 (초기 공간 할당 X)
	public Heap() {
		this(null);
	}
	
	public Heap(Comparator<? super E> comparator) {
		this.array = new Object[DEFAULT_CAPACITY];
		this.size = 0;
		this.comparator = comparator;
	}
    
	// 생성자 Type 2 (초기 공간 할당 O)
	public Heap(int capacity) {
		this(capacity, null);
	}
	
	public Heap(int capacity, Comparator<? super E> comparator) {
		this.array = new Object[capacity];
		this.size = 0;
		this.comparator = comparator;
	}
    
 
	// 받은 인덱스의 부모 노드 인덱스를 반환
	private int getParent(int index) {
		return index / 2;
	}
	
	// 받은 인덱스의 왼쪽 자식 노드 인덱스를 반환 
	private int getLeftChild(int index) {
		return index * 2;
	}
	
	// 받은 인덱스의 오른쪽 자식 노드 인덱스를 반환
	private int getRightChild(int index) {
		return index * 2 + 1;
	}
	
	
}
```

변수부터 먼저 차례대로 설명해주도록 하겠다.



comparator : 여러분들이 객체를 정렬하고자 할 때, 혹은 임의의 순서로 정렬하고 싶을 때 Comparator 를 파라미터로 받아 설정할 수 있도록 한 변수다.

DEFAULT_CAPACITY : 배열의 기본 및 최소 용적이다. 한마디로 요소를 담을 배열의 크기를 의미한다. 배열을 동적으로 관리 할 때 최소 크기가 10 미만으로 내려가지 않기 위한 변수다. 그리고 요소의 개수랑은 다른 의미이므로 이 점 헷갈리지 말자.

size : 배열에 담긴 요소(원소)의 개수 변수

array : 요소를 담을 배열이다.

그리고 생성자는 크게 4가지로 나누었다.

먼저 데이터(요소)의 개수를 예상할 수 있어 배열의 크기(용적)를 최적으로 하고 싶을 때 초기에 생성할 배열의 크기를 설정 해줄 수 있도록 만든 방법과
사용자가 정렬 방법을 따로 넘겨주고자 할 때 쓸 수 있도록 Comparator을 받는 방법을 조합하여 4가지로 나누었다.