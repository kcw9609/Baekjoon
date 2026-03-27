from collections import deque

def solution(maps):
    n, m = len(maps), len(maps[0])
    
    queue = deque([(0, 0, 1)])
    visited = [[False] * m for _ in range(n)]
    visited[0][0] = True
    
    while queue:
        x, y, dist = queue.popleft()
        # 끝나면 결과 반환
        if x == n - 1 and y == m - 1:
            return dist
        # 모든 구간 다 돌기
        for dx, dy in [(0, 1), (1, 0), (-1, 0), (0, -1)]:
            nx, ny = x + dx, y + dy
            # 큐에 넣기
            if 0 <= nx < n and 0 <= ny < m:
                if maps[nx][ny] == 1 and not visited[nx][ny]:
                    visited[nx][ny] = True
                    queue.append((nx, ny, dist + 1))
                
    return -1
        