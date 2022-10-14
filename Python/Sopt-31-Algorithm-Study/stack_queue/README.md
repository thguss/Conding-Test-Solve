# 알고리즘 정리 - 스택, 큐, 덱, 우선순위 큐

## 스택 (Stack)

- 데이터 임시 저장
- 후입선출(FILO) 방식 - 후에 들어온 데이터를 먼저 빼는 구조
- 제한적인 데이터 접근
- 한 쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조

### 관련 python 코드
```
stack = []
stack.append(data)  # 원소 삽입(push)
stack.pop() # 원소 추출 (pop)
```

<br/>

## 큐 (Queue)

- 데이터 임시 저장
- 선입선출(FIFO) 방식 - 먼저 들어온 데이터를 먼저 빼는 구조

### 관련 python 코드
```
from collections import deque

queue = deque()
queue.append()  # 원소 삽입(push)
queue.popleft() # 원소 추출(pop)
```

<br/>

## 덱(Deque)
- queue랑 비슷,, ~
- 파이썬 자체 라이브러리에서 구현되어 있음

### python 사용
```
from collections import deque

dq = deque()

# 원소 추가
dq.append(data)

# 가장 완쪽에 원소 추가
dq.appendleft(data)

# 가장 오른쪽 원소 추출
dq.pop()

# 가장 왼쪽 원소 추출
dq.popleft()
```

<br/>

## 우선순위 큐 (Priority Queue)
- 우선 순위가 높은 데이터 순으로 나가는 구조
- 파이썬에는 이미 구현된 내장 라이브러리가 존재
- 시간 복잡도 O(log n)

### 관련 python 코드
```
from queue import PriorityQueue

queue = PriorityQueue()

# 원소 추가
queue.put(data)

# 원소 추출 (오름차순으로 정렬된 순으로 원소가 추출된다)
queue.get()
```

### 정렬 기준 지정 코드
```
queue.put((1, 'B'))
queue.put((2, 'A'))
queue.put((3, 'C'))
```
위와 같이, 우선순위 큐에 `(우선순위, 데이터)` 형식의 튜플로 넣어주면 우선순위를 지정할 수 있다. 위 코드의 queue에서 차례로 원소를 추출해보면 B -> A -> C 순으로 추출된다.

근데 PriorityQueue는 동기화 이슈로 heap보다 느리다고 합니다. -> 우선순위 큐 문제 나오면 힙으로 ㅌㅌ 합시다. ^.^

<br/>

## 힙 (Heap)
- 완전 이진 트리 구조 (우선순위 큐를 구현하기 위해 만들어진 자료구조)
- 최대 힙, 최소 힙 구조가 있다.
- 파이썬에서 제공하는 heapq의 디폴트 기능은 최소 힙 구조.

### python 코드
```
import heapq

hq = []

# 원소 삽입
heapq.heappush(hq, data)

# 원소 추출
heapq.heappop(hq)
```