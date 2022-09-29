def solution(dartResult):
    bonus = {'S': 1, 'D': 2, 'T': 3}
    answer = []
    score = ''

    for s in dartResult:

        if s in bonus:
            score = pow(int(score), bonus[s])

        elif s == '*':
            score = int(score) * 2
            if len(answer) >= 1:
                answer[-1] *= 2

        elif s == '#':
            score = int(score) * (-1)

        # if s is number
        else:
            # the case that the number is 10
            if type(score) == str:
                score += s

            # count the new number
            else:
                answer.append(score)
                score = s

    # add the last number
    answer.append(score)

    # sum of the elements
    return sum(answer)
