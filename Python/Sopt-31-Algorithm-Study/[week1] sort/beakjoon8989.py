
for _ in range(int(input())):
  clocks = list(input().split(" "))

  temp = []
  for clock in clocks:
    hour, minute = map(int, clock.split(":"))

    hd = ((hour % 12) * 30 + minute / 2) % 360 # 시침 각도
    md = minute * 6 # 분침 각도

    angle = abs(hd - md)

    temp.append([min(angle, 360 - angle), clock])
  
  temp.sort()
  print(temp[2][1])