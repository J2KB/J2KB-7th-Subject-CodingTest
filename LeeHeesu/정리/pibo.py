# 피보나치
d  = [0] * 100

def fibo(x):
    #종료 조건(1, 2일때 반환)
    if x==1 or x==2:
        return 1
    if d[x] != 0: # 계산했던 것은 패스
        return d[x]
    d[x] = fibo(x-1) + fibo(x-2)
    return d[x]

print(fibo(6));
####### 다이나믹 프로그래밍을 통한 피보나치 수열 나열 방식
####### 다이나믹 프로그래밍의 경우 반복 횟수를 줄일 수 있다.

