from itertools import permutations

n, m = map(int, input().split())

nums = [i+1 for i in range(n)]
perm = list(permutations(nums, m))

for p in perm:
  p = list(p)
  for i in p:
    print(i, end=" ")
  print()