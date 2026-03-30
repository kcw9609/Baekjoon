from collections import deque
def solution():
    # input
    N = int(input())
    L = int(input())
    graph = [[] for _ in range(N+1)]
    
    # line
    for _ in range(L):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    
    # visit
    visit = [False] * (N+1)
    answer = 0
    
    queue = deque()

    
    # bfs
    def bfs(start):
        nonlocal answer
        queue = deque([start])
        visit[start] = True
        
        while queue:
            node = queue.popleft()
            # 연결된 트리 넣기
            for next in graph[node]:
                if not visit[next]:
                    visit[next] = True
                    queue.append(next)
                    answer += 1

    bfs(1) 
    print(answer)
solution()