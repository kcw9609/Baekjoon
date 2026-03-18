from collections import deque

def solution(m, n, h, w, drops):
    # 1. 격자 초기화 (비가 안 오는 곳은 무한대)
    # m * n <= 500,000 이므로 1차원 리스트로 관리하거나 2차원으로 관리
    inf = float('inf')
    grid = [[inf] * n for _ in range(m)]
    for i, (r, c) in enumerate(drops):
        grid[r][c] = i + 1

    # 단조 큐를 이용한 1차원 슬라이딩 윈도우 최솟값 함수
    def get_min_sliding_window(arr, k):
        res = []
        dq = deque()
        for i in range(len(arr)):
            if dq and dq[0] <= i - k:
                dq.popleft()
            while dq and arr[dq[-1]] >= arr[i]:
                dq.pop()
            dq.append(i)
            if i >= k - 1:
                res.append(arr[dq[0]])
        return res

    # 2. 행 방향 가로 길이 w의 최솟값 계산
    # temp_grid[r][c]는 grid[r][c:c+w] 의 최솟값
    temp_grid = []
    for r in range(m):
        temp_grid.append(get_min_sliding_window(grid[r], w))

    # 3. 열 방향 세로 길이 h의 최솟값 계산 (전치 활용 또는 직접 계산)
    # 최종적으로 (m-h+1) x (n-w+1) 크기의 결과가 나옴
    final_rows = m - h + 1
    final_cols = n - w + 1
    
    max_time = -1
    answer = [0, 0]

    # 각 열에 대해 세로 슬라이딩 윈도우 적용
    for c in range(final_cols):
        col_data = [temp_grid[r][c] for r in range(m)]
        col_mins = get_min_sliding_window(col_data, h)
        
        for r, val in enumerate(col_mins):
            # 가장 늦게 비를 맞는 시각(val)이 더 큰 경우 업데이트
            # 문제 조건: 동일 시각이면 위쪽(r), 왼쪽(c) 우선이므로 
            # 엄격한 초과(>) 비교를 하되 r, c 루프 순서를 조정
            if val > max_time:
                max_time = val
                answer = [r, c]
            elif val == max_time:
                # 행 우선, 열 우선 비교
                if r < answer[0]:
                    answer = [r, c]
                elif r == answer[0] and c < answer[1]:
                    answer = [r, c]

    return answer