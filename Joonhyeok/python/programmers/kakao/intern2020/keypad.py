def solution(numbers, hand):
    left_only = [1, 4, 7, '*']
    right_only = [3, 6, 9, '#']
    centre = [2, 5, 8, 0]

    left_status = '*'
    right_status = '#'

    answer = ''

    for n in numbers:
        if n in left_only:
            left_status = n
            answer += 'L'

        elif n in right_only:
            right_status = n
            answer += 'R'

        elif n in centre:
            # if thumb is not on the centre, distance 1 must be plus
            if left_status in left_only:
                left_distance = abs(left_only.index(left_status) - centre.index(n)) + 1
            # the case when thumb is on the centre
            else:
                left_distance = abs(centre.index(left_status) - centre.index(n))

            # right side case
            if right_status in right_only:
                right_distance = abs(right_only.index(right_status) - centre.index(n)) + 1
            else:
                right_distance = abs(centre.index(right_status) - centre.index(n))

            # check the hand when each distance is same
            if left_distance == right_distance:
                if hand == "left":
                    left_status = n
                    answer += 'L'
                else:
                    right_status = n
                    answer += 'R'

            # different distances
            elif left_distance < right_distance:
                left_status = n
                answer += 'L'

            else:
                right_status = n
                answer += 'R'

    return answer
