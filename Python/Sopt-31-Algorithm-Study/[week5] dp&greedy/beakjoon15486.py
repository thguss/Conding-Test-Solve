# 입력값
n = int(input())
consulting = [[] for _ in range(n)]
for i in range(n):
  t, c = map(int, input().split())
  if 0 <= i + t - 1 < n:
    consulting[i + t - 1].append([t, c])
TERM = 0
PRICE = 1


# 함수 로직
def dp():
  dp = [0] * n
  if consulting[0]:
    dp[0] = consulting[0][0][PRICE]

  for i in range(1, n):
    dp[i] = dp[i - 1]
    for j in range(len(consulting[i])):
      dp[i] = max(dp[i], consulting[i][j][PRICE] + dp[i - consulting[i][j][TERM]])

  return max(dp)


# 결과값
print(dp())