import sys
import heapq

hq = []

for _ in range(int(input())):
  x = int(sys.stdin.readline())

  if not x:
    if not hq:
      print(0)
    else:
      print(heapq.heappop(hq)[1])
  else:
    heapq.heappush(hq, (abs(x), x))