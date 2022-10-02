# Priority Queue

PriorityQueue란 우선순위 큐로써 일반적인 큐의 구조인 FIFO의 특성을 가지면서 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를
먼저 결정하여 그 우선순위가 높은 원소가 먼저 산출되는 방식이다.

PriorityQueue를 구현하기 위해선 우선순위 큐에 저장할때에는 반드시 원소의 정렬조건을 구현하기 위해 Comparable Interface를 구현해야한다.

Comparable Interface를 구현하면 compareTo 메소드를 override하여 객체를 사용자 기준으로 객체를 정렬하여준다. 그러면 Priority Queue가
알아서 우선순위가 높은 객체를 추출하여준다.

PriorityQueue는 Heap을 이용하여 구현하는 것이 일반적인 방법이다.

데이터를 삽입할 때 우선순위를 기준으로 최대 힙 혹은 최소 힙을 구성하고 데이터를 꺼낼 때 루트노드를 얻어낸 뒤 루트 노드를 삭제할 때는 빈 루트 노드위치에
맨 마지막 노드를 삽입한다. 그 후 아래로 내려가면서 적절한 자리를 찾아 옮기는 방식으로 진행된다.

최대값이 우선순위인 큐 =최대 힙,최소값이 우선순위인 큐 = 최소값이 우선순위 인 큐

## PriorityQueue 특징

1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조이다. (우선 순위 큐에 들어가는 원소는 비교가 가능한 기준이 있어야한다.)
2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있다.
3. 내부구조가 힙읋 구성되어 있어 시간복잡도는 O(N)이다.
4. 우선순위를 중시해야하는 상황에 사용된다.

## PriorityQueue 선언

PriorityQueue를 사용하려먄 java.util.PriorityQueue를 Import하여야 한다.

```java
import java.util.PriorityQueue;
import java.util.Collections;

//낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

//높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
```

## PriorityQueue 메서드


```java

// add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환, 
// 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생
priorityQueueLowest.add(1);
priorityQueueLowest.add(10);
priorityQueueLowest.offer(100);

priorityQueueHighest.add(1);
priorityQueueHighest.add(10);
priorityQueueHighest.offer(100);

// 첫번째 값을 반환하고 제거 비어있다면 null
priorityQueueLowest.poll();

// 첫번째 값 제거 비어있다면 예외 발생
priorityQueueLowest.remove();

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 null을 반환
priorityQueueLowest.peek();

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 예외 발생
priorityQueueLowest.element();

// 초기화
priorityQueueLowest.clear();      
        
```