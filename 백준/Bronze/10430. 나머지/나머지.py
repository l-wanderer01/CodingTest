input = input().split()

A = int(input[0])
B = int(input[1])
C = int(input[2])

print((A+B)%C)
print(((A%C)+(B%C))%C)
print((A*B)%C)
print(((A%C)*(B%C))%C)