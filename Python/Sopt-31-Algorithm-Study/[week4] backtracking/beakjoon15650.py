from itertools import combinations

n, m = map(int, input().split())

nums = [i+1 for i in range(n)]

for perm in list(combinations(nums, m)):
  temp = sorted(list(perm))
  print(" ".join(map(str, temp)))

  