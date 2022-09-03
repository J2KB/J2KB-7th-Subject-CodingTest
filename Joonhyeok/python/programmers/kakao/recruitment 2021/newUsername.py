def solution(new_id):
    set_of_allowed = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                      't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '_', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8',
                      '9'}
    new_id = new_id.lower()
    dot_cnt = 0
    loop = len(new_id)
    for i in range(loop):
        if new_id[i] in set_of_allowed:
            if new_id[i] == '.':
                dot_cnt += 1
                if dot_cnt == 2:
                    new_id.replace('..', '.')
                    i -= 1
                    loop = len(new_id)
                    continue
                else:
                    continue
            else:
                if dot_cnt == 1:
                    dot_cnt == 0
                    continue
            print(new_id)

        else:
            new_id = new_id.replace(new_id[i], '*', 1)
            print(new_id)

    new_id = new_id.replace('*', '')
    new_id = new_id.strip('.')
    if new_id == '':
        new_id += 'a'

    if len(new_id) > 15:
        new_id = new_id[:15]
        new_id = new_id.strip('.')

    while len(new_id) < 3:
        new_id += new_id[-1]

    return new_id.strip('.')

