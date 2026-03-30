from collections import deque
def solution():
    # input
    N, M, V = map(int, input().split())
    graph = [[] for _ in range(N+1)]
    # line
    for _ in range(M):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    # sort
    for i in range(1, N+1):
        graph[i].sort()
    # 1 -> [2,3,4]
    # 2 -> [4]
    # 3 -> [4]

    visited_dfs = [False] * (N+1)
    dfs_result = []
    
    # dfs 하나식 연결해서 내려감
    def dfs(v):
        visited_dfs[v] = True
        dfs_result.append(v)
        
        for next in graph[v]:
            if not visited_dfs[next]:
                dfs(next)
  
    # bfs
    visited_bfs = [False] * (N+1)
    bfs_result = []
    def bfs(start):
        queue = deque([start])
        visited_bfs[start] = True
        
        while queue:
            v = queue.popleft()
            bfs_result.append(v)
            
            for next in graph[v]:
                if not visited_bfs[next]:
                    visited_bfs[next] = True
                    queue.append(next)
     
    dfs(V)
    bfs(V)
    
    print(*dfs_result)
    print(*bfs_result)
    
solution()
