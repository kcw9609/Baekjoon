import heapq
def solution(n, works):
    answer = 0
    
    # 예외처리
    if sum(works) <= n:
        return 0
    
    # 처음부터 야근할 필요 없는 경우
    
    # 음수값으로 변경 후 힙큐 적용
    works = [-i for i in works]
    heapq.heapify(works)
    # 작업
    for i in range(n):
        heapq.heappush(works, heapq.heappop(works) + 1)
        n -= 1
    
        
    # 야근 지수 구하기
    for i in works:
        answer += i*i
    
    return answer