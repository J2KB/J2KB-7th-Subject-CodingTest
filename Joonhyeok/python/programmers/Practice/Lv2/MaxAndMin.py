def solution(s):
    # map function : iterates something
    s = sorted(map(int, s.split()))
    # fstring
    return f"{s[0]} {s[-1]}"
