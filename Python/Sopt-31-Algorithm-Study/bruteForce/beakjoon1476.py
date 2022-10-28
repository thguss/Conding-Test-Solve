def counting(value, range):
  value += 1

  if(value > range):
    value -= range
  
  return value

e, s, m = map(int, input().split())

earth, sun, moon, year = 1, 1, 1, 1

while(True):
  if (e == earth) and (s == sun) and (m == moon):
    break
  
  earth = counting(earth, 15)
  sun = counting(sun, 28)
  moon = counting(moon, 19)
  year += 1

print(year)