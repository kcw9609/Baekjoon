def solution(n):
    # n = 4 result = 1
    # n = 24 result = 3 + 1
    answer = 0
    piece = 7
    answer = (int)(n / 7)
    if n % 7 != 0:
        answer += 1
        
    return answer