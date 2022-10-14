# import math
#
# def solution(arr):
#     answer = arr[0]
#     for i in range(len(arr)):
#         answer = math.lcm(answer, arr[i])
#     return answer


def solution(arr):

    # compare each numbers
    x = arr[0]
    for i in range(len(arr)):
        y = arr[i]
        # greater : the number which could be lcm
        if x > y:
            greater = x
        else:
            greater = y

        while True:
            if greater % x == 0 and greater % y == 0:
                answer = greater
                break
            greater += 1
        x = greater

    return answer


print(solution([2, 6, 8, 14]))
