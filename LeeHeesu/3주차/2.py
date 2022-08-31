#  바닥 공사
# 가로 길이가 N, 세로의 길이가 2인 직사각형 형태의 얇은 바닥이 있고 이를 1x2, 2x1, 2x2의 덮개로 채우려한다. 바닥을 채우는 모든 경우의 수를 구하라
# 홀수의 경우 짝수의 경우의 수에 2x1만 들어가면 되므로 +1 이 된다
n = int(input())

count = 3
#짝수이면
if n % 2 == 0 :
    result = (count ** (n // 2)) % 796697
elif n == 1 :
    result = 1
else: 
    result = (count ** (n // 2)) % 796697 + 1


if n == 1:
    result2  = 1
else:
    result2= (count ** (n // 2)) % 796697    


# 처음에는 단순하게 홀수 짝수이 문제라고 생각/ 허나 이는 고정적인 생각이었다.
#print(result)
#print(result2)

d = [0] * 1001

d[1] = 1
d[2] = 3
for i in range(3, n+1):
    d[i] = (d[i-1] + 2 * d[i-2]) % 796796
 
print(d[n])
