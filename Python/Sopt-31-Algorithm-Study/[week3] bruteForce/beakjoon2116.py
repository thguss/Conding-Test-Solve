# 함수 로직
def getIndex(index):
  if index == 0:
    return 5
  elif index == 1:
    return 3
  elif index == 2:
    return 4
  elif index == 3:
    return 1
  elif index == 4:
    return 2
  elif index == 5:
    return 0


def getMax(dice, up, down):
  res = 0
  for i in range(6):
    if i != up and i != down:
      res = max(res, dice[i])
  return res


def bruteForce(dices):
  ans = 0

  for i in range(6):
    res = 0
    down = i
    up = getIndex(down)
    res += getMax(dices[0], up, down)
    target = dices[0][up]

    for j in range(1, len(dices)):
      down = dices[j].index(target)
      up = getIndex(down)
      res += getMax(dices[j], up, down)
      target = dices[j][up]

    ans = max(ans, res)
    
  return ans


# 입력값
dices = [list(map(int, input().split())) for _ in range(int(input()))]

# 결과값
print(bruteForce(dices))