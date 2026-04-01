def solution():
    # input
    import sys
    input = sys.stdin.readline
    sys.setrecursionlimit(10**6)
    T = int(input())
    
    for _ in range(T):
        M, N, K = map(int, input().split())
        ground = [[0] * M for _ in range(N)]

        # visit
        visit = [[False] * M for _ in range(N)]
        
        for _ in range(K):
            x, y = map(int, input().split())
            ground[y][x] = 1

        # 방문처리 , 연결된 곳 확인
        def dfs(r, c):
            directions = [(1, 0), (0, 1), (0, -1), (-1,0)]
            for dr, dc in directions:
                nr = r + dr
                nc = c + dc
                
                if 0 <= nr < N and 0 <= nc < M:
                    if not visit[nr][nc] and ground[nr][nc] == 1:
                        visit[nr][nc] = True
                        dfs(nr, nc)
        answer = 0
        # dfs 실행. 새로운 배추 그룹 찾기
        for i in range(N):
            for j in range(M):
                # 새로운 땅 찾기
                if ground[i][j] == 1 and not visit[i][j]:
                    visit[i][j] = True
                    dfs(i, j)
                    answer += 1
        print(answer)
solution()