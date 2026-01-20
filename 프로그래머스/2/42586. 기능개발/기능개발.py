import math;
def solution(progresses, speeds):
    answer = {}


    be_needDate = 0
    
    # 차례대로 필요한 일자 계산
    for i in range(len(progresses)):
        
        # 걸리는 시간 계산
        fo_remained = 100 - progresses[i]
        fo_needDate = math.ceil(fo_remained / speeds[i])
        
        if fo_needDate > be_needDate:
            answer[fo_needDate] = answer.get(fo_needDate, 0) + 1
            be_needDate = fo_needDate # 새로운 기준일 업데이트
        else:
            answer[be_needDate] = answer.get(be_needDate, 0) + 1
            
    return list(answer.values())

        
    
    # 만약 앞의 작업의 시간이 더 오래걸리면 앞의 시간으로 배포
    
    # 만약 뒤의 시간이 더 걸리면 뒤의 시간으로 배포
    