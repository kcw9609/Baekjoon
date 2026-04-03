def solution(sizes):
    answer = 0

    big_size = max(sizes[0][0], sizes[0][1])
    small_size = min(sizes[0][0], sizes[0][1])
    for i in range(1, len(sizes)):
        # 가로, 세로 사이즈 체크
        # 돌려서도 체크
        if big_size < max(sizes[i][0], sizes[i][1]):
            big_size =  max(sizes[i][0], sizes[i][1])
        if small_size < min(sizes[i][0], sizes[i][1]):
            small_size =  min(sizes[i][0], sizes[i][1])

            
    return big_size * small_size