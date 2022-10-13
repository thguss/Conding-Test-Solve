n = int(input())
numbers = list(map(int, input().split()))
x = int(input())

res = 0

for number in numbers:
  # (x보다 작은 수이고) (제곱이 x가 아닌 수이고) (x가 되기 위해 더해야 하는 수가 numbers 배열에 있는 수이면)
  if number < x and not number * 2 == x and x- number in numbers:
    res += 1
      
print(res//2)