#백준 7795번  - 먹을 것인가 먹힐 것인가(이분탐색) 문제풀이
import bisect, sys

for _ in range(int(sys.stdin.readline())):
    n, m = map(int, sys.stdin.readline().split())
    A = sorted(list(map(int, sys.stdin.readline().split())))
    B = sorted(list(map(int, sys.stdin.readline().split())))
    count = 0
    for a in A:
        count += (bisect.bisect(B, a-1))
    print(count)