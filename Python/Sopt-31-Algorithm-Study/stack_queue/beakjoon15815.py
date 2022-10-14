expression = list(input())

stack = []

def calculate(exp):
  x, y = stack.pop(), stack.pop()

  if exp == '+':
    stack.append(x + y)
  elif exp == '-':
    stack.append(y - x)
  elif exp == '*':
    stack.append(x * y)
  elif exp == '/':
    stack.append(y // x)

for exp in expression:
  if exp in ['+', '-', '*', '/']:
    calculate(exp)
  else:
    stack.append(int(exp))

print(stack.pop())