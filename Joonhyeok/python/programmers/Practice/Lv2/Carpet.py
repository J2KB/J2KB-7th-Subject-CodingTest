def solution(brown, yellow):
    number_of_grids = brown + yellow

    for width_of_yellow in range(1, number_of_grids):
        if (number_of_grids - brown) % width_of_yellow == 0:
            height_of_yellow = yellow // width_of_yellow
            if number_of_grids == (height_of_yellow + 2) * (width_of_yellow + 2):
                answer = sorted([height_of_yellow + 2, width_of_yellow + 2], reverse=True)
                return answer


# def solution(brown, yellow):
#     total_count = brown + yellow
#     for column in range(2, total_count + 1):
#         if (total_count / column) % 1 == 0:
#             row = total_count // column
#             if row >= column and (2 * row) + (2 * column) == brown + 4:
#                 return [row, column]

print(solution(8, 1))
