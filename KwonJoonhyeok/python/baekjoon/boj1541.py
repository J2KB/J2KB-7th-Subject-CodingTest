formula_deduct = input().split('-')

first_of_split = formula_deduct.pop(0).split('+')

result = 0
for i in first_of_split:
    result += int(i)

for num in formula_deduct:
    element = 0
    for i in num.split('+'):
        element += int(i)
    result -= element

print(result)




