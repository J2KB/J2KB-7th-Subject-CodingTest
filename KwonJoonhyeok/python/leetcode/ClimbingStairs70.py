# 1 stair = 1
# 2 stairs = 2
# 3 stairs = 3
# 4 stairs = 5
# 5 stairs = 8
# 6 stairs = 13
# (n) stairs + (n+1) stairs = (n+2) stairs


# 귀납적 추론을 통해 얻은 점화식으로
class Solution:
    def climbStairs(self, n: int) -> int:
        fibonacci = [0, 1, 2]
        if n < 3:
            return n

        else:
            for i in range(3, n + 1):
                fibonacci.append(fibonacci[i - 2] + fibonacci[i - 1])

        return fibonacci[n]
