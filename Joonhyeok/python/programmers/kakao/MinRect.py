# https://school.programmers.co.kr/learn/courses/30/lessons/86491

def solution(sizes):
    wallet = []

    # 큰 수를 앞 순서로 옮김
    for i in range(len(sizes)):
        sizes[i].sort()

    # 각 요소 인덱스별로 최댓값 구하는 과
    for i in range(2):
        maximum = 0
        for j in range(len(sizes)):
            if maximum < sizes[j][i]:
                maximum = sizes[j][i]
        wallet.append(maximum)

    # 넓이 계산
    answer = wallet[0] * wallet[1]
    return answer
