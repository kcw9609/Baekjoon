def solution(n, edge):
    answer = 0
    [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	
    g = [[] for i in range(n + 1)]
    for i, j in edge:
        g[i].append(j)
        g[j].append(i)
        
    q = []
    visit = [0] * (n+1)
    visit[1] = 1
    q.append(1)
    
    while q:
        k = q.pop(0)
        for i in g[k]:
            if visit[i] == 0:
                visit[i] = visit[k] + 1 # 이전까지 거리 + 1
                q.append(i)

    answer = visit.count(max(visit))
    
    return answer