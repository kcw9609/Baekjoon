def solution(progresses, speeds):
    answer = []
    
    # exception
    
    def cul_dates(pr, speed):
        count = 0
        while pr < 100:
            pr += speed
            count += 1
        return count
    
    # set
    cnt = 1
    max_date = cul_dates(progresses[0], speeds[0])
    
    # grogresses 만큼 반복:
    for idx in range(1, len(progresses)):
        curr_cnt = cul_dates(progresses[idx], speeds[idx])
        
        # if 앞에 일수 > 뒤의 일수:
        if curr_cnt <= max_date:
            # 카운트 추가
            cnt += 1

        # if 앞의 일수 < 뒤의 일수:
        else:
            # 쌓인 업무들 배포
            answer.append(cnt)
            cnt = 1
            max_date = curr_cnt
            # 새롭게 카운트
    answer.append(cnt)
        
    return answer



# 7 3 9일 -> [2, 1]