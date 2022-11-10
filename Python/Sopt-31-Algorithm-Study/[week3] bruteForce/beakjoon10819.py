from itertools import permutations

n = int(input())
arr = list(map(int, input().split()))

res = 0

for case in permutations(arr):
  temp = 0

  for i in range(1, len(case)):
    temp += abs(case[i] - case[i-1])

  res = max(res, temp)

print(res)