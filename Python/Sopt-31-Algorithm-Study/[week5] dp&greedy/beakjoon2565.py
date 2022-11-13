# 입력값
stick = []
for _ in range(int(input())):
  stick.append(list(map(int, input().split())))
B = 1


# 함수 로직
def sortStick():
  stick.sort(key=lambda x: x[1])
  stick.sort(key=lambda x: x[0])

def dp():
  sortStick()
  dp = [1] * len(stick)
  for i in range(len(stick)):
    for j in range(i):
      if stick[i][B] > stick[j][B] or stick[i][B] == stick[j][B]:
        dp[i] = max(dp[i], dp[j] + 1)
  return max(dp)

def removeLine():
  return len(stick) - dp()


# 결과값
print(removeLine())