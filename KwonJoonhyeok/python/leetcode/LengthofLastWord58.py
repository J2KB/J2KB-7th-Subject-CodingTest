class Solution:
    def lengthOfLastWord(self, s: str) -> int:

        # 각 단어 split, 그 중에서 맨 마지막 단어 반환
        return len(s.split(' ')[-1])

# https://leetcode.com/problems/length-of-last-word/submissions/