
def solution4(scoville, K):
    answer = 0
    scoville.sort() # 1. 처음 시작할 때 정렬이 되어 있어야 함
    
    # 1번째 작은 , 2번째 구하기
    while scoville[0] < K:
        if len(scoville) < 2: # 3. 섞을 음식이 없으면 -1
            return -1
        answer += 1
        # 곗한하기
        curr = scoville[0] + (scoville[1] * 2)
        # 정렬하기
        del scoville[0]
        del scoville[0]
        
        scoville.append(curr)
        scoville.sort()
        
    
    return answer

def solution21(scoville, K):
    answer = 0
    scoville.sort()
    
    while scoville[0] < K:
        temp = scoville.pop(0) + (scoville.pop(0) * 2)
        answer += 1
        scoville.append(temp)
        scoville.sort()
        
        if len(scoville) == 1 and scoville[0] < K:
            return -1
    return answer
import heapq        
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    
    while scoville[0] < K:
        temp = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        answer += 1
        heapq.heappush(scoville, temp)
        
        if len(scoville) == 1 and scoville[0] < K:
            return -1        
    return answer
        