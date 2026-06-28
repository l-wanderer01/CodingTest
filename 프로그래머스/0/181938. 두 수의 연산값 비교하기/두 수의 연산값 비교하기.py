def solution(a, b):
#     answer = 0
#     mul = 2 * a * b
    
#     result = str(a) + str(b)
#     print(result)
    
#     if mul > int(result):
#         return mul
#     else:
#         return int(result)
    return max(int(str(a) + str(b)), 2 * a * b)