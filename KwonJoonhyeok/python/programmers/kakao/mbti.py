# https://school.programmers.co.kr/learn/courses/30/lessons/118666

def solution(survey, choices):
    answer = ''

    # character numbers
    characteristic = {'R': 0, 'T': 0, 'C': 0, 'F': 0, 'J': 0, 'M': 0,
                      'A': 0, 'N': 0}

    # compute points
    for i in range(len(choices)):
        if choices[i] < 4:
            characteristic[survey[i][0]] += 4 - choices[i]

        elif choices[i] > 4:
            characteristic[survey[i][1]] += choices[i] - 4

    # first refer
    if characteristic['R'] >= characteristic['T']:
        answer += 'R'
    else:
        answer += 'T'

    # second refer
    if characteristic['C'] >= characteristic['F']:
        answer += 'C'
    else:
        answer += 'F'

    # third refer
    if characteristic['J'] >= characteristic['M']:
        answer += 'J'
    else:
        answer += 'M'

    # fourth refer
    if characteristic['A'] >= characteristic['N']:
        answer += 'A'
    else:
        answer += 'N'

    return answer
