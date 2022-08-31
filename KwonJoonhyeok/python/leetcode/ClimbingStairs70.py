import math


class Solution:
    def climbStairs(self, n: int) -> int:
        # integer to return
        result = 0

        # how many 2 steps
        distinct_by_two = n // 2

        # add cases
        for i in range(distinct_by_two + 1):
            number_of_climbing = n - i
            result += math.comb(n - i, i)

        return result
