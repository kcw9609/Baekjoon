def solution(brown, yellow):
    answer = []
    x, y = 0, 0
    # yellow 에 따른 경우의 수 
    for y in range(1, yellow + 1):
        if yellow % y == 0:
            x = yellow // y
            
            if 2 * (x+y+2) == brown:
                answer = [x + 2, y + 2]
                break
    
     
    return answer