import heapq, sys
n = int(sys.stdin.readline())

q = []

for i in range(n):
    a, end = map(int, sys.stdin.readline().split())
    q.append([a, b])

q.sort()

r = []
heapq.heappush(r, q[0][1])

for i in range(1, n):
    if q[i][0] < r[0]:
        heapq.heappush(r, q[i][1])
    else: 
        heapq.heappop(r)
        heapq.heappush(r, q[i][1])

print(len(r))