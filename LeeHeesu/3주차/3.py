# 효율적인 화폐구성
# N 종류의 화폐를 이용하여 M 의 합이 되도록 하는 가장 최소한의 화폐갯수 구하기
# 불가능인 경우 -1
# (1<=N<= 100, 1<=M<=10000)

arr = []
a,b  = map(int, input().split())
for i in range(a):
    arr.append(int(input()))
print(arr)
