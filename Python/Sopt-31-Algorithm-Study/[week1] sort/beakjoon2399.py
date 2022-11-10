n = int(input())
numbers = list(map(int, input().split()))

res = 0

for i in range(n):
  for j in range(n):
    res += abs(numbers[i] - numbers[j])

print(res)