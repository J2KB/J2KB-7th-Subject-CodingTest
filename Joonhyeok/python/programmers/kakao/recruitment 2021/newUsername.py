def solution(new_id):
    set_of_allowed = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                      't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '_', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8',
                      '9'}
    new_id = new_id.lower()
    dot_cnt = 0
    result = ''

    for character in new_id:
        if character in set_of_allowed:
            if character == '.':
                dot_cnt += 1
            elif dot_cnt >= 1:
                result += f'.{character}'
                dot_cnt = 0
            else:
                result += character

    result = result.strip('.')

    if result == '':
        result += 'a'

    result = result[:15].strip('.')

    while len(result) < 3:
        result += result[-1]

    return result
