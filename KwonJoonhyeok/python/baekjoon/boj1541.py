# 더할 수 있는 것끼리 더해서 빼기
formula_deduct = input().split('-')

# 합 구하는 과정
first_of_split = formula_deduct.pop(0).split('+')

# result -> 출력할 최종 값
result = 0

# 뺄 값 만들기
for i in first_of_split:
    result += int(i)

# 빼기 시작
for num in formula_deduct:
    element = 0
    for i in num.split('+'):
        element += int(i)
    result -= element

print(result)




