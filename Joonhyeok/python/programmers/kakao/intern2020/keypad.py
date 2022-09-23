def solution(numbers, hand):
    leftOnly = [1, 4, 7, '*']
    rightOnly = [3, 6, 9, '#']
    centre = [2, 5, 8, 0]

    left_status = '*'
    right_status = '#'

    answer = ''

    for n in numbers:
        if n in leftOnly:
            left_status = n
            answer += 'L'
        elif n in rightOnly:
            right_status = n
            answer += 'R'
        elif n in centre:
            if left_status in leftOnly:
                left_distance = abs(leftOnly.index(left_status) - centre.index(n))
            elif left_status in centre:
                left_distance = abs(centre.index(left_status) - centre.index(n))

            if right_status in rightOnly:
                right_distance = abs(rightOnly.index(right_status) - centre.index(n))
            elif right_status in centre:
                right_distance = abs(centre.index(right_status) - centre.index(n))

            if left_distance == right_distance:
                if hand == "left":
                    left_status = n
                    answer += 'L'
                else:
                    right_status = n
                    answer += 'R'

            elif left_distance < right_distance:
                answer += 'L'

            else:
                answer += 'R'

    return answer
