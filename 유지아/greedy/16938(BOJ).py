import sys
from itertools import combinations

n, l, r, x = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
result = 0
for i in range(2, n + 1):
    for combination in combinations(arr, i):
        if l <= sum(combination) <= r:
            if max(combination) - min(combination) >= x:
                result += 1

print(result)