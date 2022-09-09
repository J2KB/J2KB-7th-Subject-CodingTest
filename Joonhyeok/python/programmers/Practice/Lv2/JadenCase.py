def solution(s):
    answer = ''
    # split() ignores the word of case ''
    for word in s.split(' '):
        answer += f"{word.capitalize()} "

    # if the last word is blank, strip doesn't work properly
    return answer[:-1]
