import heapq

def Solution():
    # 다익스트라
    def dijkstra(n, graph):
        # 최소 비용 저장 배열
        cost = [[float('inf')] * n for _ in range(n)]
        
        # 우선순위 큐 (비용, x, y)
        pq = []
        heapq.heappush(pq, (graph[0][0], 0, 0))
        # 초기 설정
        cost[0][0] = graph[0][0]
        
        # 상하좌우
        dx = [1, -1, 0, 0]
        dy = [0, 0, 1, -1]
        
        while pq:
            cur_cost, x, y = heapq.heappop(pq)
            
            # 이미 더 작은 값 있으면 스킵
            if cur_cost > cost[x][y]:
                continue
            # 상하좌우 돌며 최소 거리 계산
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                # 범위 예외처리
                if 0 <= nx < n and 0 <= ny < n:
                    new_cost = cur_cost + graph[nx][ny]
                    # 비용 계산:
                    if new_cost < cost[nx][ny]:
                        cost[nx][ny] = new_cost
                        heapq.heappush(pq, (new_cost, nx, ny))
        return cost[n-1][n-1]
    
    # 입력 및 실행
    count = 1
   
    while True:
        n = int(input())
        if n==0:
            break;
        graph = [list(map(int, input().split())) for _ in range(n)]
        
        result = dijkstra(n, graph)
        print(f"Problem {count}: {result}")
        count += 1
Solution()
   