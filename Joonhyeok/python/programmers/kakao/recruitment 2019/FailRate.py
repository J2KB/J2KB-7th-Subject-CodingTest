def solution(N, stages):
    winners = [[i, 0] for i in range(N + 1)]
    num_of_players = len(stages)
    rates = []

    # number of people who cleared stages
    for player in stages:
        winners[player - 1][1] += 1

    #
    for i in range(len(winners) - 1):
        rates.append([i + 1, winners[i][1] / num_of_players])
        num_of_players -= winners[i][1]

    rates = sorted(sorted(rates, key=lambda x: x[0]), key=lambda x: x[1], reverse=True)

    return [rates[stage][0] for stage in range(len(rates))]


print(solution(5, [2, 1, 2, 6, 2, 4, 3, 3]))
