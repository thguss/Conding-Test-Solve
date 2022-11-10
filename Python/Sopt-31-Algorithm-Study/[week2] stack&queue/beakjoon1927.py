import heapq
import sys

hq = []

for _ in range(int(input())):
  n = int(sys.stdin.readline())

  if n == 0:
    if not hq:
      print(0)
    else:
      print(heapq.heappop(hq))

  else:
    heapq.heappush(hq, n)