def solution(s):
    answer = 0
    
    stk = []
    
    # 나누기
    splited = s.split()
    print(splited)
    
    for i in range(len(splited)):
        
        # Z를 만나면 이전꺼 빼기
        if splited[i] != 'Z':
            answer += int(splited[i])
        else:
            answer -= int(splited[i-1])
            
    
    return answer