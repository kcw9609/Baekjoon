def solution(nums):
    answer = 0
    # set
    hash = {}
    # hash table 에 삽입
    for i in range(len(nums)):
        if nums[i] not in hash:
            hash[nums[i]] = 1
        
    # 포켓몬 픽: hash 길
    pick_num = len(nums)/2
    if len(hash) > pick_num:
        answer = pick_num
    else:
        answer = len(hash)
    
    
    return answer