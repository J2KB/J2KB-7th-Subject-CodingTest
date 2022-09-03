def solution(lottos, win_nums):
    # lotto matched cases and zero cases
    match = 0
    potential = 0

    # 6th rank until two matches
    rank = [6, 6, 5, 4, 3, 2, 1]

    # lottery has six numbers
    for i in range(6):
        # exception
        try:
            win_nums.index(lottos[i])
            match += 1

        # if no match with index method, ValueError occurs
        except ValueError:
            if lottos[i] == 0:
                potential += 1
                continue

    result = [rank[match + potential], rank[match]]
    # zero number all matches or not
    return result
