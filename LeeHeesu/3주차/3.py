# 효율적인 화폐구성
# N 종류의 화폐를 이용하여 M 의 합이 되도록 하는 가장 최소한의 화폐갯수 구하기
# 불가능인 경우 -1
# (1<=N<= 100, 1<=M<=10000)

arr = []
a,b  = map(int, input().split())
for i in range(a):
    arr.append(int(input()))


# 단순하게 큰 수로만 나누면 안되고 보텀업 방식 이용
#10000개이므로
d = [10001] * (b +1)
d[0] = 0
for i in range(a):
    for j in range(arr[i], b+1):
        if d[j - arr[i]] != 10001:
            d[j] = min(d[j], d[j-arr[i]]+1)

if d[b] == 10001 :
    print(-1)
else :
    print(d[b])        


        
       
    
