# https://leetcode.com/problems/add-binary/
# 45ms, faster than 71.46% of python3 submissions
# 13.9MB, less than 25.21% of python3 submission

class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a_decimal = 0
        b_decimal = 0

        # a 2진수 -> 10진수로 변경
        cnt = 0
        for bin_element in a:
            if bin_element == '1':
                a_decimal += 2 ** (len(a) - 1 - cnt)
            cnt += 1

        # b 2진수 -> 10진수
        cnt = 0
        for bin_element in b:
            if bin_element == '1':
                b_decimal += 2 ** (len(b) - 1 - cnt)
            cnt += 1

        # 10진수화한 a, b 더하기
        sum_decimal = a_decimal + b_decimal

        # 0일 때
        if sum_decimal == 0:
            return '0'

        # 0이 아닐 때
        else:
            result = ''
            while sum_decimal > 0:
                if sum_decimal % 2 == 0:
                    result += '0'
                else:
                    result += '1'
                sum_decimal //= 2

            return result[::-1]
