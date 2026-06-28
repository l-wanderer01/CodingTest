count = int(input())
divisors = input().split()

min = 1000000
max = 2

if count == 1:
    result = int(divisors[0])**2

else:
    for i in range(count):
        if min >= int(divisors[i]):
            min = int(divisors[i])
        if max <= int(divisors[i]):
            max = int(divisors[i])
    result = max * min

print(result)