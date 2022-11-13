from collections import deque

# storage 세팅
DODO = 0
SUYEON = 1
cards = [deque(), deque()]
grounds = [deque(), deque()]

# 입력값
n, m = map(int, input().split())
for _ in range(n):
  do, su = map(int, input().split())
  cards[DODO].appendleft(do)
  cards[SUYEON].appendleft(su)


# 함수 로직
def takeCard(taking, taken):
  while grounds[taken]:
    cards[taking].append(grounds[taken].pop())
  while grounds[taking]:
    cards[taking].append(grounds[taking].pop())

def changePlayer(player):
  if player == DODO:
    return SUYEON
  else:
    return DODO

def game():
  player = DODO

  for _ in range(m):
    grounds[player].appendleft(cards[player].popleft())

    if not cards[DODO] or not cards[SUYEON]:
      break
      
    if (grounds[DODO] and grounds[DODO][0] == 5) or (grounds[SUYEON] and grounds[SUYEON][0] == 5):
      takeCard(DODO, SUYEON)
    elif grounds[DODO] and grounds[SUYEON] and grounds[DODO][0] + grounds[SUYEON][0] == 5:
      takeCard(SUYEON, DODO)
    
    player = changePlayer(player)


def haligali():
  game()

  if len(cards[DODO]) > len(cards[SUYEON]):
    return "do"
  elif len(cards[DODO]) < len(cards[SUYEON]):
    return "su"
  else:
    return "dosu"


# 결과값
print(haligali())