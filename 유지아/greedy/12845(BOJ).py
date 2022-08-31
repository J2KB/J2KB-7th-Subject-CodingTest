#백준 12845번 - 모두의 마블(그리디) 문제풀이
import sys

n = sys.stdin.readline()
card = list(map(int, sys.stdin.readline().split()))
card.sort(reverse=True)
result = 0

for i in range(len(card)):
    if i <= 1:
        result += card[i]
    else:
        result += card[0]+card[i]

print(result)