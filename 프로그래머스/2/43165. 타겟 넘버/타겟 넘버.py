def solution(numbers, target):
    answer = 0
    
    def dfs(index, sum):
        nonlocal answer
        # 끝까지 갔는 지 확인
        if index >= len(numbers):
            if sum == target:
                answer += 1
            return
        # 타켓과 같은 지 확인
        
        dfs(index + 1 , sum + numbers[index])
        
        dfs(index + 1 , sum - numbers[index])
        
    dfs(0, 0)
    
    return answer