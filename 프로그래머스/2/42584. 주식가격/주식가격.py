def solution(prices):
    answer = [0] * len(prices)
    stack = []

    # 각 각 넣다가 앞에 넣은 것보다 작아지면 pop
    # pop 2, push 3
    stack.append(0) # index 넣기
    for i in range(1, len(prices)): 
        # 넣는게 크면 넣음
        if prices[stack[-1]] <= prices[i]:
            stack.append(i)
            
        # 작아짐 -> 뺌 & 기록
        else:
            while stack and prices[stack[-1]] > prices[i]:
                top = stack.pop()
                answer[top] = i - top
            stack.append(i)
    while stack:
        top = stack.pop()
        answer[top] = len(prices) - top - 1

    return answer